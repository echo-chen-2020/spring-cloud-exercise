package org.example.user.service;

import org.example.user.pojo.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    User getUserById(Long id);

    List<User> getAllUsers();
}
