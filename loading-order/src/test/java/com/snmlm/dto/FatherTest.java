package com.snmlm.dto;

/**
 * @author: snmlm
 * @create: 2021-05-19
 */
public class FatherTest {
    private String name;
    public static String nameStatic = "Tom";

    FatherTest(){
        System.out.println("--父类的无参构造函数--");
    }

    FatherTest(String name){
        this.name=name;
        System.out.println("--父类的有参构造函数--"+this.name);
    }

    static{
        System.out.println("--父类的静态代码块--");
    }

    {
        System.out.println("--父类的非静态代码块--");
    }

    public void speak(){
        System.out.println("--父类的方法--");
    }
}
