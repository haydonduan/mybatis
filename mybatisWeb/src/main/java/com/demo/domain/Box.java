package com.demo.domain;


public class Box {
    private Long id;
    private String boxName;
    private Long userId;
    
    public Long getUserId() {
        return userId;
    }
    public void setUserId(Long userId) {
        this.userId = userId;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getBoxName() {
        return boxName;
    }
    public void setBoxName(String boxName) {
        this.boxName = boxName;
    }
    public Box(Long id, String boxName,Long userId) {
        super();
        this.id = id;
        this.boxName = boxName;
        this.userId = userId;
    }
    public Box() {
        super();
    }
    
    
}
