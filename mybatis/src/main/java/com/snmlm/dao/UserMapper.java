package com.snmlm.dao;

import com.snmlm.dto.UserDto;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author: snmlm
 * @create: 2021-05-14
 */
public interface UserMapper {
    public void insert(UserDto userDto);

    public void deleteByPrimary(Integer id);

    public void deleteByObject(UserDto userDto);

    public void updateByObject(UserDto userDto);

    public List<UserDto> findListByObject(UserDto userDto);

    public List<UserDto> selectUserAuthority(Integer id);

    @Select("select * from mybatis.user where id = #{id}")
    public UserDto select(Integer id);

    @Select("select * from mybatis.user where id = #{id}")
    @Result(property = "authorityDto", column = "authorityId",
                    one = @One(select = "com.snmlm.dao.AuthorityMapper.select")
    )//返回指向另外一个查询
    public List<UserDto> selectUserAuthorityAnnotation(Integer id);

    @Insert("insert into user(name,age,pwd) values (#{name},#{age},#{password})")
    public void insertAnnotation(UserDto userDto);

    //方法存在多个参数，所有的参数前面必须加上@Param注解
    @Insert("insert into user(name,age) values (#{name},#{age})")
    public void insertAnnotation1(@Param("name") String name,@Param("age") Integer age);

    @Delete("delete from user where id = #{uid}")
    public void deleteByPrimaryAnnotation(@Param("id")Integer uid);

    @DeleteProvider(type = DeleteUserMapper.class, method = "getSql")//提供复杂sql的拼写
    public void deleteByObjectAnnotation(UserDto userDto);

    @Select("select * from user")
    public List<UserDto> findListAnnotation();
}
