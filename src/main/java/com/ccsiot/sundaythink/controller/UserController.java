package com.ccsiot.sundaythink.controller;

import com.ccsiot.sundaythink.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 1、UserController，用来描述我的行为
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/eat")
    public void eat()
    {
        userService.eat();
    }


    @RequestMapping("/wash")
    public void wash()
    {
        userService.wash();
    }


}
