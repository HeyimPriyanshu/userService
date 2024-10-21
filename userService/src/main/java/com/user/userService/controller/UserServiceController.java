package com.user.userService.controller;


import com.user.userService.model.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserServiceController {

    @PostMapping
    public String createUser(@RequestBody User user) {

        return "added";
    }
}
