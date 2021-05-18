package com.snmlm.dao;

import com.snmlm.dto.AuthorityDto;
import com.snmlm.dto.UserDto;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author: snmlm
 * @create: 2021-05-17
 */
public interface AuthorityMapper {
    public List<AuthorityDto> selectAuthorityUser(Integer id);

    @Select("select * from mybatis.authority where id = #{id}")
    @Result(property = "userDtoList", column = "id",
            many = @Many(select = "com.snmlm.dao.UserMapper.select")
    )//返回指向另外一个查询
    public List<UserDto> selectAuthorityUserAnnotation(Integer id);


    @Select("select * from mybatis.authority where id = #{id}")
    public AuthorityDto select(Integer id);
}
