package test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.service.IndexService;



public class UserTest {

private IndexService indexService;
    
    @Before
    public void before(){                                                                    
        @SuppressWarnings("resource")
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:conf/spring.xml"
                ,"classpath:conf/spring-mybatis.xml"});
        indexService = (IndexService) context.getBean("indexService");
    }
    
    @Test
    public void addUser(){
        System.out.println(indexService.findUserById(1L));
    }
}