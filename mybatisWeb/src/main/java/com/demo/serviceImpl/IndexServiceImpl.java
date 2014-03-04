package com.demo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.IndexMapper;
import com.demo.domain.User;
import com.demo.domain.User2;
import com.demo.service.IndexService;
@Service
public class IndexServiceImpl implements IndexService{
    @Autowired
    private IndexMapper indexMapper;
    
    
    public User findUserById(Long id) {
        User user = indexMapper.findById(id);
        return user;
    }

    public int addUser(User user) {
        return indexMapper.addUser(user);
    }

    public User findByName(String name) {
        return indexMapper.findByName(name);
    }

    public User2 findUserByUserId(User2 user) {
        return indexMapper.findByUserId(user);
    }

    public User2 findCupAndUserByUserId(User2 user) {
        return indexMapper.findCupAndUserByUserId(user);
    }

    public User2 findBoxAndUserByUserId(User2 user) {
        return indexMapper.findBoxAndUserByUserId(user);
    }

}
