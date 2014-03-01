package com.testmaven.app.testmaven;

import org.apache.ibatis.annotations.Select;

public interface UserMapper {  
    public User findById(String Id);  
    public int insertUser(String name);
    public int updateUser(User user);
    public int deleteUser(Long id);
    
    @Select("select * from user where id=#{id}")
    public User findById2(Long id);
}  