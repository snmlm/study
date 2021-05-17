package com.snmlm.dao;

import com.snmlm.dto.UserDto;
import org.apache.ibatis.annotations.Select;

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
}
