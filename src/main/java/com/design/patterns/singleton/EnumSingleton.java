package com.design.patterns.singleton;

import java.util.HashMap;
import java.util.Map;

//枚举可以防止反序列化创建
public enum EnumSingleton {

    INSTANCE;

    public static EnumSingleton getInstance(){
        return INSTANCE;
    }





    private final Map<String, String> testMap = new HashMap<>();

    public void putMap(String key,String value){
        testMap.put(key, value);
    }

    public String getMap(String key){
        return testMap.get(key);
    }

}
