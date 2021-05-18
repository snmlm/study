package com.snmlm.dao;

import com.snmlm.dto.AuthorityDto;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * @author: snmlm
 * @create: 2021-05-17
 */
public class AuthorityMapperTest {
    @Test
    public void selectAuthorityUserTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("app-context-annotation.xml");
        AuthorityMapper authorityMapper  = (AuthorityMapper)context.getBean("authorityMapper");
        for (AuthorityDto dto : authorityMapper.selectAuthorityUser(1)) {
            System.out.println(dto.toString());
        }
    }

    @Test
    public void selectAuthorityUserAnnotationTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("app-context.xml");
        SqlSessionFactory sqlSessionFactory = (SqlSessionFactory)context.getBean("sqlSessionFactory");
        try(SqlSession sqlSession = sqlSessionFactory.openSession(true)) {
            AuthorityMapper authorityMapper = sqlSession.getMapper(AuthorityMapper.class);

            for (AuthorityDto dto : authorityMapper.selectAuthorityUser(1)) {
                System.out.println(dto.toString());
            }
        }
    }

    @Test
    public void aa(){
        System.out.println(new ClassPathResource("classpath:mybatis-config.xml"));
    }
}
