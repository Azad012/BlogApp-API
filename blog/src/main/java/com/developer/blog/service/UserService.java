package com.developer.blog.service;

import com.developer.blog.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    User saveUser(User user);

    List<User> getAllUsers();

}
