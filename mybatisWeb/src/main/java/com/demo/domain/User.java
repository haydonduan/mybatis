package com.demo.domain;

public class User{  
    private Long id;
    private String name;  
    private String password;
    private Long _id;
    
    public Long get_id() {
        return _id;
    }
    public void set_id(Long _id) {
        this._id = _id;
    }
    public User (Long id,String name,String password){
        this.id = id;
        this.name = name;
        this.password = password;
    }
    public User (){}
    
    
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {  
        return name;  
    }  
    public void setName(String name) {  
        this.name = name;  
    }  
} 
