package com.demo.domain;

public class User{  
    private Long id;
    private String name;  
    private Integer age;  
    private String nickName;
    public User (Long id,String name){
        this.id = id;
        this.name = name;
    }
    public User (){}
    public String getNickName() {
        return nickName;
    }
    public void setNickName(String nickName) {
        this.nickName = nickName;
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
    public Integer getAge() {  
        return age;  
    }  
    public void setAge(Integer age) {  
        this.age = age;  
    }  
} 
