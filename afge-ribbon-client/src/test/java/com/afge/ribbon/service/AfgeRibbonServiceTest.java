package com.afge.ribbon.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @author: lyf
 * @date: 2019/7/15
 * @description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AfgeRibbonServiceTest {

    @Autowired
    private AfgeRibbonService afgeRibbonService;

    @Test
    public void testRibbonAfge(){
        afgeRibbonService.test("1");
    }
}