package com.itheima.pros;

import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        Worker people=(Worker)Proxy.newProxyInstance(Worker.class.getClassLoader(),
                Worker.class.getInterfaces(),
                new MyHander(new Worker()));
        people.work();
    }
}
