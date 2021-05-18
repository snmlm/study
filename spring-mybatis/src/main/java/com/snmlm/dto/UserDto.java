package com.snmlm.dto;

import lombok.Data;

/**
 * @author: snmlm
 * @create: 2021-05-14
 */
//@Alias("aaaa") 优先于配置文件
@Data
public class UserDto {
    //可以和数据库中不一致。
    //属性名与数据一致，默认get方法设置
    //可以多字段
    //如果想少字段，需要在xml中单独配置。需要配resultMap
    //dto和mapper是耦合的
    private Integer id;
    private String name;
    private Integer age;
    private String pwd;
    private String address;
    private AuthorityDto authorityDto;
    private String authorityId;
}
