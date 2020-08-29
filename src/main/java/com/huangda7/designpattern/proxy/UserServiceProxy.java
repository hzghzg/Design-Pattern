package com.huangda7.designpattern.proxy;

public class UserServiceProxy implements UserService {
    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void add() {
        log("add");
        userService.add();
    }

    @Override
    public void update() {
        log("update");
        userService.update();
    }
    public void log(String msg) {
        System.out.println("调用了"+msg+"方法");
    }
}
