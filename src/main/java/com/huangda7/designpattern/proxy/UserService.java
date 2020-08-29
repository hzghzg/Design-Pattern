package com.huangda7.designpattern.proxy;

//代理和真实角色（UserServiceImpl）都可以完成的目标
public interface UserService {
    void add();

    void update();
}
