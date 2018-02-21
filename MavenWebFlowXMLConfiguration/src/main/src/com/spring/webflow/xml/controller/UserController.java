package com.spring.webflow.xml.controller;

import com.spring.webflow.xml.entity.User;
import com.spring.webflow.xml.service.api.UserServiceApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

/**
 * Created by
 *
 * @author: liuwenqi on 2018-02-10.
 * Description:
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserServiceApi userServiceApi;

    @PostMapping("/login")
    public String login(User user) {
        User u = userServiceApi.login(user);
        Optional<User> userOptional = Optional.ofNullable(u);
        return userOptional.map(user1 -> "redirect:/user/getAll").orElse("login");
    }

    @RequestMapping("/getAll")
    public String getAll(Model model) {
        System.out.println("chaxun");
        List<User> userList = userServiceApi.getAll();
        model.addAttribute("userList", userList);
        return "list";
    }

    public String verifyPhone(String phone) {
        System.out.println("---------------------------------------------");
        System.out.println("phone====" + phone);
        return "yes";
    }

    public String verifyOldPwd(User user) {
        System.out.println("--------user-------------user------------user------------");
        System.out.println("user====" + user);
        return "ok";
    }
}
