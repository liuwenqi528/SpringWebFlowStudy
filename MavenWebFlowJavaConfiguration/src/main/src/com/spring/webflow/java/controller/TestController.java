package com.spring.webflow.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by
 *
 * @author: liuwenqi on 2018-02-10.
 * Description:
 */
@Controller
@RequestMapping("/test")
public class TestController {

    @GetMapping
    public String test(){
        System.out.println("ceshizhixing");
        System.out.println("ceshizhixing");
        return "test";
    }
}
