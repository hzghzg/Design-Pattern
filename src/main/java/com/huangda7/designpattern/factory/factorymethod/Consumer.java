package com.huangda7.designpattern.factory.factorymethod;

import com.huangda7.designpattern.factory.simplefactory.SimpleFactory;

public class Consumer {
    public static void main(String[] args) {
        Car car1 = new AoDiFactory().getCar();
        Car car2 = new WulingFactory().getCar();
    }
}
