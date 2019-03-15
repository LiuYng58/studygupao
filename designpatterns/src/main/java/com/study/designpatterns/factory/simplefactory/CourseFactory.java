package com.study.designpatterns.factory.simplefactory;


import com.study.designpatterns.factory.ICourse;

/**
 * 简单工厂模式
 */
public class CourseFactory {

    public ICourse create(Class clazz){
        try{
            if(null != clazz ){
                return (ICourse)clazz.newInstance();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
