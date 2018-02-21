package com.spring.webflow.xml.controller;

import org.springframework.stereotype.Service;

/**
 * Created by
 *
 * @author: liuwenqi on 2018-02-21.
 * Description:
 */
@Service("userService")
public class UserAction {

    public String verifyPhone(String phone){
        System.out.println("phone===="+phone);
        return "yes";
    }
}
