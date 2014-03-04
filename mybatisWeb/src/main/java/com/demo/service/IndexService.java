package com.demo.service;

import com.demo.domain.User;
import com.demo.domain.User2;

public interface IndexService {
    User findUserById(User user);
    
    int addUser(User user);
    
    User findByName(String name);
    
    User2 findUserByUserId(User2 user);
    
    User2 findCupAndUserByUserId(User2 user);
    
    User2 findBoxAndUserByUserId(User2 user);
}
