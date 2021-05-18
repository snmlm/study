package com.snmlm.dao;

import com.snmlm.dto.UserDto;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: snmlm
 * @create: 2021-05-14
 */
public class UserMapperTest {
    @Test
    public void selectUserAuthorityAnnotationTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("app-context.xml");
        UserMapper userMapper  = (UserMapper)context.getBean("userMapper");
        for (UserDto dto : userMapper.selectUserAuthorityAnnotation(1)) {
            System.out.println(dto.toString());
        }
    }

    @Test
    public void selectUserAuthorityAnnotationTest1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("app-context.xml");
        UserMapper userMapper  = (UserMapper)context.getBean("userMapperDao");
        for (UserDto dto : userMapper.selectUserAuthorityAnnotation(1)) {
            System.out.println(dto.toString());
        }
    }
}
