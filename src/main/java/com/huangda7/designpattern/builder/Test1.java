package com.huangda7.designpattern.builder;

public class Test1 {
    public static void main(String[] args) {
        Worker1 worker = new Worker1();
        Product1 product = worker.getProduct();
        System.out.println(product.toString());
        //用户可以自定义产品的组合形式
        Product1 product1 = worker.buildA("炸鸡套餐").buildD("雪碧").getProduct();
        System.out.println(product1.toString());
    }
}
