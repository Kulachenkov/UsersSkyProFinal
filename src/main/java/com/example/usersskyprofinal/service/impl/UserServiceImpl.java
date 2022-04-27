package com.example.usersskyprofinal.service.impl;

import com.example.usersskyprofinal.repository.UserRepository;
import com.example.usersskyprofinal.model.User;
import com.example.usersskyprofinal.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void createUser(User user) {
        userRepository.save(user);
    }

    public User getUserById(Integer id) {
        return userRepository.getById(id);

    }

    public void deleteById(Integer id) {
        userRepository.deleteById(id);
    }
}
