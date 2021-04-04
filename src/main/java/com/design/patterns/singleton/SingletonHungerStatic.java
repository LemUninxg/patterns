package com.design.patterns.singleton;

/**
 * 静态常量 饿汉模式
 */
public class SingletonHungerStatic {

    //声明 private 防止对象被 new
    private SingletonHungerStatic() {

    }

    //创建静态对象实例
    private final static SingletonHungerStatic instance = new SingletonHungerStatic();

    //提供公共外部访问方法
    public static SingletonHungerStatic getInstance() {
        return instance;
    }

}
