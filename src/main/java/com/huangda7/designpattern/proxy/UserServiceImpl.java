package com.huangda7.designpattern.proxy;

public class UserServiceImpl implements UserService {
    @Override
    public void add() {
        System.out.println("增加了一个用户");
    }

    @Override
    public void update() {
        System.out.println("修改了一个用户");
    }

}
