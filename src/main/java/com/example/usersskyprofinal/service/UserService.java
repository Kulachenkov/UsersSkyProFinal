package com.example.usersskyprofinal.service;

import com.example.usersskyprofinal.model.User;

public interface UserService {

    void createUser(User user);

    User getUserById(Integer id);

    void deleteById(Integer id);
}
