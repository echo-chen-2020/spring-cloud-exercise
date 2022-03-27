package org.example.user.service;

import org.example.user.pojo.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    User getUserById(Long id);
}
