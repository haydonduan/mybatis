package com.demo.dao;

import org.springframework.stereotype.Repository;

import com.demo.domain.User2;
@Repository  
public interface CupMapper{
    User2 findCupById(User2 user);
}
