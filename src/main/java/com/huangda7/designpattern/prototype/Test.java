package com.huangda7.designpattern.prototype;

import java.util.Date;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        //原型对象
        Date date = new Date();
        Video v1 = new Video("复仇者联盟",date);
        System.out.println("v1=>"+v1);
        System.out.println("v1.hashcode=>"+v1.hashCode());
        //原来复制的方式
        //Video v2 = new Video("复仇者联盟",date);
        Video v2 = (Video) v1.clone();
        System.out.println("v2=>"+v2);
        System.out.println("v2.hashcode=>"+v2.hashCode());
    }
}
