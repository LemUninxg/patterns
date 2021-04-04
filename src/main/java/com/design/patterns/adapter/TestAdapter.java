package com.design.patterns.adapter;

import java.util.concurrent.ThreadPoolExecutor;

public class TestAdapter {

    public static void main(String[] args) {
//        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor();

        AbsAdapter absAdapter = new AbsAdapter(){
            @Override
            public void m1(){
                System.out.println("覆盖 m1 方法");
            }
        };

        absAdapter.m1();
    }

}
