package com.design.patterns.singleton;

public class TestSingleton {

    public static void main(String[] args) {
        String key = "test1";
        EnumSingleton.getInstance().putMap(key,"value1");

        System.out.println(EnumSingleton.getInstance().getMap(key));
    }

}
