package com.huangda7.designpattern.builder;

//负责定义一个产品生产的工序，与普通的建造者模式不同在于会返回自己
public interface Builder1 {
    Builder1 buildA(String msg);//打地基
    Builder1 buildB(String msg);//上钢筋
    Builder1 buildC(String msg);//铺电线
    Builder1 buildD(String msg);//粉刷
    Product1 getProduct();//粉刷
}
