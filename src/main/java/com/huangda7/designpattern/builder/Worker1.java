package com.huangda7.designpattern.builder;

//同样负责去生产产品，但是返回的是自己，可以实现链式编程
public class Worker1 implements Builder1{
    private Product1 product1;

    public Worker1() {
        product1 = new Product1();
    }

    @Override
    public Builder1 buildA(String msg) {
        product1.setBuildA(msg);
        return this;
    }

    @Override
    public Builder1 buildB(String msg) {
        product1.setBuildB(msg);
        return this;
    }

    @Override
    public Builder1 buildC(String msg) {
        product1.setBuildC(msg);
        return this;
    }

    @Override
    public Builder1 buildD(String msg) {
        product1.setBuildD(msg);
        return this;
    }

    @Override
    public Product1 getProduct() {
        return product1;
    }
}
