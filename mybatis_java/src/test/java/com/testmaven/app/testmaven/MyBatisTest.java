package com.testmaven.app.testmaven;

import java.io.IOException;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisTest {
    
    /**
     * 获得MyBatis SqlSessionFactory
     * SqlSessionFactory负责创建SqlSession，一旦创建成功，就可以用SqlSession实例来执行映射语句
     * ，commit，rollback，close等方法。
     * 
     * @return
     */
    private static SqlSessionFactory getSessionFactory() {
        SqlSessionFactory sessionFactory = null;
        String resource = "configuration.xml";
        try {
            sessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader(resource));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sessionFactory;
    }

    public static void main(String[] args) {
        SqlSession sqlSession = getSessionFactory().openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        selectMethod(userMapper);
         //insertMethod(userMapper);
        //updateUser(userMapper,"suse",1L);
        //deleteUser(userMapper,1L);
        
        //关闭连接
        sqlSession.commit();
        sqlSession.close();
    }

    
    public static void deleteUser(UserMapper userMapper,Long id){
        System.out.println("删除了" + userMapper.deleteUser(id) + "条");
    }
    public static void updateUser(UserMapper userMapper,String name,Long id){
        System.out.println("更新了" + userMapper.updateUser(new User(1L,"suse")) + "条");
    }
    public static void insertMethod(UserMapper userMapper) {
        System.out.println("插入了" + userMapper.insertUser("姓名1") + "条");
    }

    public static void selectMethod(UserMapper userMapper) {
        User user = userMapper.findById("1");
        User user2 = userMapper.findById2(7L);
        if (user == null) {
            System.out.println("无此人！");
        } else {
            System.out.println(user.getId() + ":" + user.getName());
        }
        if (user2 == null) {
            System.out.println("无此人！");
        } else {
            System.out.println(user2.getId() + ":" + user2.getName());
        }
    }
}