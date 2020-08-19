package com.huangda7.designpattern.builder;

public class Worker implements Builder{
    private Product product;

    public Worker() {
        product = new Product();//产品由工人new出来
    }

    @Override
    public void buildA() {
        product.setBuildA("打地基");
        System.out.println("打基地");
    }

    @Override
    public void buildB() {
        product.setBuildB("上钢筋");
        System.out.println("上钢筋");
    }

    @Override
    public void buildC() {
        product.setBuildC("铺电线");
        System.out.println("铺电线");
    }

    @Override
    public void buildD() {
        product.setBuildD("粉刷");
        System.out.println("粉刷");
    }

    @Override
    public Product getProduct() {
        return product;
    }

}
