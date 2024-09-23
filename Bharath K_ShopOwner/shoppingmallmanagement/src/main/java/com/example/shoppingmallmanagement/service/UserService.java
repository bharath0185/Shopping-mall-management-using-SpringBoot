package com.example.shoppingmallmanagement.service;

import com.example.shoppingmallmanagement.model.User;
import com.example.shoppingmallmanagement.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<User> getUserById(Long uid) {
        return userRepository.findById(uid);
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public User updateUser(Long uid, User user) {
        if (userRepository.existsById(uid)) {
            user.setUid(uid);
            return userRepository.save(user);
        } else {
            throw new RuntimeException("User not found");
        }
    }

    public void deleteUser(Long uid) {
        userRepository.deleteById(uid);
    }
}
