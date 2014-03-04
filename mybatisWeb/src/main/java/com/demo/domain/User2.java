package com.demo.domain;

import java.util.List;

public class User2{  
    private Long id;
    private String userName;  
    private Cup cup;
    private List<Box> box;
    
    public List<Box> getBox() {
        return box;
    }
    public void setBox(List<Box> box) {
        this.box = box;
    }
    public Cup getCup() {
        return cup;
    }
    public void setCup(Cup cup) {
        this.cup = cup;
    }
    public User2 (Long id,String userName,List<Box> box){
        this.id = id;
        this.userName = userName;
        this.box = box;
    }
    public User2 (Long id){
        this.id = id;
    }
    public User2 (){}
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
 
} 
