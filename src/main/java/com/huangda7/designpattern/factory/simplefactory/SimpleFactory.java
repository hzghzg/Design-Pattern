package com.huangda7.designpattern.factory.simplefactory;

public class SimpleFactory {//当有新的产品增加时，需要修改原来的代码，违背开闭原则
    public static Car getCar(String name){
        if("奥迪".equals(name)){
            return new AoDi();
        }else if("五菱".equals(name)){
            return new WuLing();
        }else {
            return null;
        }
    }
}
