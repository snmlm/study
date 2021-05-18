package com.snmlm.dao.impl;

import com.snmlm.dao.AuthorityMapper;
import com.snmlm.dao.UserMapper;
import com.snmlm.dto.AuthorityDto;
import com.snmlm.dto.UserDto;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

/**
 * @author: snmlm
 * @create: 2021-05-17
 */
public class AuthorityMapperImpl implements AuthorityMapper {
    private AuthorityMapper authorityMapper;

    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.authorityMapper = ((AuthorityMapper)sqlSessionTemplate.getMapper(AuthorityMapper.class));
    }

    @Override
    public List<AuthorityDto> selectAuthorityUser(Integer id) {
        return authorityMapper.selectAuthorityUser(id);
    }

    @Override
    public List<UserDto> selectAuthorityUserAnnotation(Integer id) {
        return authorityMapper.selectAuthorityUserAnnotation(id);
    }

    @Override
    public AuthorityDto select(Integer id) {
        return authorityMapper.select(id);
    }
}
