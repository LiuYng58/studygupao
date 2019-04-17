package com.study.designpatterns.proxy.dbroute.db;

public class DynamicDataSourceEntity {
    private final static String DEFAULE_SOURCE = null;
    private final static ThreadLocal<String> local = new ThreadLocal<>();

    public DynamicDataSourceEntity() {
    }

    public static void restore(){
        local.set(DEFAULE_SOURCE);
    }
    public static String get() {
        return local.get();
    }

    public static void set(String source){
        local.set(source);
    }

    public static void set(int year){
        local.set("DB_" + year);
    }
}
