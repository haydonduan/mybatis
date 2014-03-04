package com.demo.dao;

import org.springframework.stereotype.Repository;

import com.demo.domain.User;
import com.demo.domain.User2;
@Repository  
public interface IndexMapper{
    public User findById(User user);
    int addUser(User user);
    User findByName(String name);
    User2 findByUserId(User2 user);
    
    User2 findCupAndUserByUserId(User2 user);
    
    User2 findCupById(User2 user);
    
    User2 findBoxAndUserByUserId(User2 user);
}
