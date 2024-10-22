package com.user.userService.controller;


import com.user.userService.model.UserUser;
import com.user.userService.service.UserServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserServiceController {

    @Autowired
    private UserServiceService userServiceService;

    @PostMapping
    public UserUser createUser(@RequestBody UserUser user) {
        return userServiceService.addUser(user);
    }
}
