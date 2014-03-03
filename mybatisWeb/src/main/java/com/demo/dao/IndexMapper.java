package com.demo.dao;

import com.demo.domain.User;
public interface IndexMapper{
    public User findById(Long id);
    int addUser(User user);
    User findByName(String name);
}
