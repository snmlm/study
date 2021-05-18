package com.snmlm.dao.impl;

import com.snmlm.dao.UserMapper;
import com.snmlm.dto.UserDto;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

/**
 * @author: snmlm
 * @create: 2021-05-18
 */
public class UserMapperImpl extends SqlSessionDaoSupport implements UserMapper {


    @Override
    public void insert(UserDto userDto) {

    }

    @Override
    public void deleteByPrimary(Integer id) {

    }

    @Override
    public void deleteByObject(UserDto userDto) {

    }

    @Override
    public void updateByObject(UserDto userDto) {

    }

    @Override
    public List<UserDto> findListByObject(UserDto userDto) {
        return null;
    }

    @Override
    public List<UserDto> selectUserAuthority(Integer id) {
        return null;
    }

    @Override
    public UserDto select(Integer id) {
        return null;
    }

    @Override
    public List<UserDto> selectUserAuthorityAnnotation(Integer id) {
        return getSqlSession().getMapper(UserMapper.class).selectUserAuthorityAnnotation(id);
    }

    @Override
    public void insertAnnotation(UserDto userDto) {

    }

    @Override
    public void insertAnnotation1(String name, Integer age) {

    }

    @Override
    public void deleteByPrimaryAnnotation(Integer uid) {

    }

    @Override
    public void deleteByObjectAnnotation(UserDto userDto) {

    }

    @Override
    public List<UserDto> findListAnnotation() {
        return null;
    }
}
