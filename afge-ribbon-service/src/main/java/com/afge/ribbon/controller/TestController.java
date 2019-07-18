package com.afge.ribbon.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: lyf
 * @date: 2019/7/15
 * @description:
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/one")
    public void test(@RequestParam String id) {
        System.out.println("test");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
