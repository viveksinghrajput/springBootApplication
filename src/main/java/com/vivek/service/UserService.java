package com.vivek.service;

import com.vivek.model.User;

import java.util.List;

public interface UserService {
    User getUserById(String userid);

    List<User> getAllUsers();

    String deleteUserById(String userid);

    User saveUser(User user);
}
