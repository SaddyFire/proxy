package com.itheima.stat;

public class StaticProxy {
    private Mapperi mapper;

    public StaticProxy(Mapperi mapper) {
        this.mapper = mapper;
    }

    public void jdbcOpera(){
        System.out.println("开始连接数据库");
        mapper.jdbcOpera();
        System.out.println("关闭数据库");
    }
}
