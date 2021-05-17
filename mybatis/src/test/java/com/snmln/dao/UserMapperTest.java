package com.snmln.dao;

import com.github.pagehelper.PageHelper;
import com.snmlm.dao.UserMapper;
import com.snmlm.dto.UserDto;
import com.snmlm.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @author: snmlm
 * @create: 2021-05-14
 */
public class UserMapperTest {
    @Test
    public void insertTest(){
        try(SqlSession sqlSession = MybatisUtils.getSqlSession()){
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            UserDto userDto = new UserDto();
            userDto.setName("哈哈");
            userDto.setAge(1);
            userMapper.insert(userDto);
            for (UserDto dto : userMapper.findListByObject(null)) {
                System.out.println(dto.toString());
            }
        }
    }
    @Test
    public void deleteTest(){
        try(SqlSession sqlSession = MybatisUtils.getSqlSession()){
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            userMapper.deleteByPrimary(3);
            UserDto userDto1 = new UserDto();
            userDto1.setAge(1);
            userMapper.deleteByObject(userDto1);
            for (UserDto dto : userMapper.findListByObject(null)) {
                System.out.println(dto.toString());
            }
        }
    }
    @Test
    public void updateTest(){
        try(SqlSession sqlSession = MybatisUtils.getSqlSession()){
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            UserDto userDto = new UserDto();
            userDto.setId(1);
            userDto.setPwd("2233");
            userMapper.updateByObject(userDto);
            for (UserDto dto : userMapper.findListByObject(null)) {
                System.out.println(dto.toString());
            }
        }
    }

    @Test
    public void selectPageHelperTest(){
        try(SqlSession sqlSession = MybatisUtils.getSqlSession()){
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            PageHelper.startPage(2,2);
            for (UserDto dto : userMapper.findListByObject(null)) {
                System.out.println(dto.toString());
            }
        }
    }

    @Test
    public void deleteByPrimaryAnnotationTest(){
        try(SqlSession sqlSession = MybatisUtils.getSqlSession()){
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

            UserDto userDto = new UserDto();
            userDto.setAge(1);

            userMapper.deleteByObjectAnnotation(userDto);
            for (UserDto dto : userMapper.findListAnnotation()) {
                System.out.println(dto.toString());
            }
        }
    }

    @Test
    public void selectUserAutrity(){
        try(SqlSession sqlSession = MybatisUtils.getSqlSession()){
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

            for (UserDto dto : userMapper.selectUserAuthority(1)) {
                System.out.println(dto.toString());
            }
        }
    }

    @Test
    public void selectUserAuthorityAnnotationTest(){
        try(SqlSession sqlSession = MybatisUtils.getSqlSession()){
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

            for (UserDto dto : userMapper.selectUserAuthorityAnnotation(1)) {
                System.out.println(dto.toString());
            }
        }
    }
}
