package com.snmln.dao;

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
    public void test(){
        try(SqlSession sqlSession = MybatisUtils.getSqlSession()){
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

            //insert
//            UserDto userDto = new UserDto();
//            userDto.setName("哈哈");
//            userDto.setAge(1);
//            userDto.setPwd("123321");
//            userMapper.insert(userDto);
            //delete
            //userMapper.deleteByPrimary(3);
//            UserDto userDto1 = new UserDto();
//            userDto1.setAge(1);
//            userMapper.deleteByObject(userDto1);
            //update
            UserDto userDto1 = new UserDto();
            userDto1.setId(1);
            userDto1.setPwd("2233");
            userMapper.updateByObject(userDto1);

            for (UserDto dto : userMapper.findListByObject(null)) {
                System.out.println(dto.toString());
            }
        }
    }
}
