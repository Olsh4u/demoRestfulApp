package com.olsh4u.demorestfulapp.controller;

import com.olsh4u.demorestfulapp.entity.Users;
import com.olsh4u.demorestfulapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UsersController {

    private final UserService userService;

    @Autowired
    public UsersController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    List<Users> getAllUsers(){
        return userService.findAll();
    }

    @PostMapping("/users")
    ResponseEntity<Void> createUser(@RequestBody Users user) {
        userService.createUsers(user);
        return ResponseEntity.ok().build();
    }
}
