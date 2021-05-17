package com.snmlm.dto;

/**
 * @author: snmlm
 * @create: 2021-05-14
 */
public class UserDto {
    private Integer id;
    private String name;
    private Integer age;
    private String pwd;

    public UserDto() {
    }

    public UserDto(String name, Integer age, String pwd) {
        this.name = name;
        this.age = age;
        this.pwd = pwd;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}
