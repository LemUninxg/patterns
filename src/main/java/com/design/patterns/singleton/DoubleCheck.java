package com.design.patterns.singleton;

//双重检查模式
public class DoubleCheck {

    private static volatile DoubleCheck instance;

    private DoubleCheck() {
    }

    public static DoubleCheck getInstance() {
        if (instance == null) {
            synchronized (DoubleCheck.class) {
                //有可能多个线程初次调用时导致有线程在 synchronized 外等待所以里面还需要有一层 if
                if (instance == null) {
                    //因为这一步不是原子操作所以需要 volatile
                    instance = new DoubleCheck();
                }
            }
        }
        return instance;
    }
}
