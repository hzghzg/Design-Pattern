package com.huangda7.designpattern.factory.simplefactory;

public class Consumer {
    public static void main(String[] args) {
        Car car1 = SimpleFactory.getCar("奥迪");
        Car car2 = SimpleFactory.getCar("五菱");
    }
}
