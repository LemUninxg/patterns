package com.design.patterns.singleton;

//静态内部类
public class StaticInnerClass {

    private StaticInnerClass() {
    }

    //内部类不会在类转载时被初始化
    private static class StaticInnerClassInstance {
        private static final StaticInnerClass instance = new StaticInnerClass();
    }

    public static StaticInnerClass getInstance() {
        return StaticInnerClassInstance.instance;
    }

}
