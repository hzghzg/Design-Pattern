package com.huangda7.designpattern.factory.factorymethod;

public class AoDiFactory implements CarFactory{
    @Override
    public Car getCar() {
        return new AoDi();
    }
}
