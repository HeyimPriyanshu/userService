package com.user.userService.repository;


import com.user.userService.model.UserUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserServiceRepository extends JpaRepository <UserUser, UUID>{
}
