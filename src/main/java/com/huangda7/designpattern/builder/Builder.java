package com.huangda7.designpattern.builder;
//抽象的建造者：只定义建造的步骤，不负责实现
public interface Builder {
    void buildA();//打地基
    void buildB();//上钢筋
    void buildC();//铺电线
    void buildD();//粉刷
    Product getProduct();//粉刷
}
