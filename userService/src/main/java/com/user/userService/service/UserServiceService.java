package com.user.userService.service;


import com.user.userService.model.UserUser;
import com.user.userService.repository.UserServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceService {

    @Autowired
    private UserServiceRepository userServiceRepository;

    // Add new user
    public UserUser addUser(UserUser user) {
        return userServiceRepository.save(user);
    }

}
