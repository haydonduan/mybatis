package com.demo.domain;

public class Cup {
    
    private String cupName;
    private Long id;
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cup(Long id, String cupName) {
        this.id = id;
        this.cupName = cupName;
    }
    
    public Cup() {
    }

    
    public String getCupName() {
        return cupName;
    }
    public void setCupName(String cupName) {
        this.cupName = cupName;
    }
    
}
