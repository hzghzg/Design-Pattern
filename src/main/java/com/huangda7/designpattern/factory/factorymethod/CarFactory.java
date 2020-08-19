package com.huangda7.designpattern.factory.factorymethod;

public interface CarFactory {//将工厂进一步抽象，每种产品由对应的工厂生产，不用像简单工厂模式一样增加产品时还要修改原来的代码
    Car getCar();
}
