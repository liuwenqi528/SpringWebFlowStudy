package com.spring.webflow.xml.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by
 *
 * @author: liuwenqi on 2018-02-11.
 * Description:
 */
@Controller
@RequestMapping("/test")
public class TestController {

    @GetMapping
    public String test(){
        return "success";
    }
}
