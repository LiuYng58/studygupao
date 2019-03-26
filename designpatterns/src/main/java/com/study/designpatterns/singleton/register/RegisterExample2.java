package com.study.designpatterns.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 容器式单例
 * 不使用synchronized是线程不安全的
 */
public class RegisterExample2 {
    private RegisterExample2(){}

    private static Map<String,Object> ioc = new ConcurrentHashMap<>();

    public static Object getBean(String className){
        synchronized (ioc){
            if(!ioc.containsKey(className)){
                Object object = null;
                try{
                    object = Class.forName(className).newInstance();
                    ioc.put(className,object);
                }catch (Exception e){
                    e.printStackTrace();
                }
                return object;
            }
            return ioc.get(className);
        }
    }
}
