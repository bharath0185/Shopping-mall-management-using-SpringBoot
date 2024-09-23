package com.example.shoppingmallmanagement.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.shoppingmallmanagement.model.User;
import com.example.shoppingmallmanagement.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{uid}")
    public Optional<User> getUserById(@PathVariable Long uid) {
        return userService.getUserById(uid);
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @PutMapping("/{uid}")
    public User updateUser(@PathVariable Long uid, @RequestBody User user) {
        return userService.updateUser(uid, user);
    }

    @DeleteMapping("/{uid}")
    public void deleteUser(@PathVariable Long uid) {
        userService.deleteUser(uid);
    }
}
