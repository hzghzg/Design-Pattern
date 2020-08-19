package com.huangda7.designpattern.factory.factorymethod;

public class WulingFactory implements CarFactory{
    @Override
    public Car getCar() {
        return new WuLing();
    }
}
