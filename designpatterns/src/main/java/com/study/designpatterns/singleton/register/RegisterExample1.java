package com.study.designpatterns.singleton.register;

public enum RegisterExample1 {
    INSTANCE;

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static RegisterExample1 getInstance(){
        return INSTANCE;
    }

}
