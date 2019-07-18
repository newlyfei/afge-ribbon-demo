package com.afge.ribbon.config.ribbon;

import feign.RetryableException;
import feign.Retryer;

/**
 * @author: lyf
 * @date: 2019/7/17
 * @description:
 */
public class MyRetryer implements Retryer {
    private final int maxAttempts;
    private final long backoff;
    int attempt;

    public MyRetryer() {
        this(2000, 3);
    }

    public MyRetryer(long backoff, int maxAttempts) {
        this.backoff = backoff;
        this.maxAttempts = maxAttempts;
        this.attempt = 1;
    }

    public void continueOrPropagate(RetryableException e) {
        if (attempt++ >= maxAttempts) {
            throw e;
        }

        try {
            Thread.sleep(backoff);
        } catch (InterruptedException ignored) {
            Thread.currentThread().interrupt();
        }
    }

    @Override
    public Retryer clone() {
        return new MyRetryer(backoff, maxAttempts);
    }
}
