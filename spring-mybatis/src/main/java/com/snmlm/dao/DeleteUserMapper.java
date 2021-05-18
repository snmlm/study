package com.snmlm.dao;

import com.snmlm.dto.UserDto;

/**
 * @author: snmlm
 * @create: 2021-05-17
 */
public class DeleteUserMapper {
    public String getSql(UserDto userDto){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("delete from mybatis.user ");
        if(userDto == null){
            return stringBuilder.toString();
        }
        StringBuilder whereSB = new StringBuilder();
        if(userDto.getId() != null){
            whereSB.append(" and id = ").append(userDto.getId());
        }
        if(userDto.getName() != null){
            whereSB.append(" and name = '").append(userDto.getName()).append("'");
        }
        if(userDto.getAge() != null){
            whereSB.append(" and age = ").append(userDto.getAge());
        }
        if(userDto.getPwd() != null){
            whereSB.append(" and pwd = '").append(userDto.getPwd()).append("'");
        }
        if(userDto.getAddress() != null){
            whereSB.append(" and address = '").append(userDto.getAddress()).append("'");
        }
        if(whereSB.length()>0){
            stringBuilder.append(" where ").append(whereSB.substring(4));
        }
        return stringBuilder.toString();
    }
}
