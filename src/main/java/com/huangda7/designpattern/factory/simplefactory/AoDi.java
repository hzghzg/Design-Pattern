package com.huangda7.designpattern.factory.simplefactory;

public class AoDi implements Car{
    @Override
    public void name() {
        System.out.println("这是一辆奥迪");
    }
}
