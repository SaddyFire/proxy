package com.itheima.stat;

public class Test {
    public static void main(String[] args) {
        Mapper mappper=new Mapper();
        AdminMapper adminMapper=new AdminMapper();
        StaticProxy staticProxy =new StaticProxy(adminMapper);
        staticProxy.jdbcOpera();
    }
}
