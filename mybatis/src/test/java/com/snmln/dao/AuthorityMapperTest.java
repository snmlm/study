package com.snmln.dao;

import com.snmlm.dao.AuthorityMapper;
import com.snmlm.dao.UserMapper;
import com.snmlm.dto.AuthorityDto;
import com.snmlm.dto.UserDto;
import com.snmlm.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @author: snmlm
 * @create: 2021-05-17
 */
public class AuthorityMapperTest {
    @Test
    public void selectAuthorityUserTest(){
        try(SqlSession sqlSession = MybatisUtils.getSqlSession()){
            AuthorityMapper authorityMapper = sqlSession.getMapper(AuthorityMapper.class);

            for (AuthorityDto dto : authorityMapper.selectAuthorityUser(1)) {
                System.out.println(dto.toString());
            }
        }
    }

    @Test
    public void selectAuthorityUserAnnotationTest(){
        try(SqlSession sqlSession = MybatisUtils.getSqlSession()){
            AuthorityMapper authorityMapper = sqlSession.getMapper(AuthorityMapper.class);

            for (AuthorityDto dto : authorityMapper.selectAuthorityUser(1)) {
                System.out.println(dto.toString());
            }
        }
    }
}
