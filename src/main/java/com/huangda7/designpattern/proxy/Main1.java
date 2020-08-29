package com.huangda7.designpattern.proxy;

public class Main1 {
    public static void main(String[] args) {
        //真实角色
        UserService userService = new UserServiceImpl();
        ProxyInvocationHandler proxyInvocationHandler = new ProxyInvocationHandler();
        proxyInvocationHandler.setTarget(userService);
        UserService proxy = (UserService)proxyInvocationHandler.getProxy();
        proxy.add();

    }
}
