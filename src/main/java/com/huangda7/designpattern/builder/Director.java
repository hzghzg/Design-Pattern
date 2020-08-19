package com.huangda7.designpattern.builder;
//负责指挥，接收一个工人并指挥工人去构建工程，工程的构建顺序由它决定
public class Director {
    public Product build(Builder builder){
        builder.buildA();
        builder.buildB();
        builder.buildC();
        builder.buildD();
        return builder.getProduct();
    }

}
