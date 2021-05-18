package com.snmlm.dto;

import lombok.Data;

import java.util.List;

/**
 * @author: snmlm
 * @create: 2021-05-17
 */
@Data
public class AuthorityDto {
    private Integer id;
    private String name;
    private List<UserDto> userDtoList;
}
