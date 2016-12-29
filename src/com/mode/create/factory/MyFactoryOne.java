package com.mode.create.factory;
public class MyFactoryOne implements Provider {

    @Override
    public MyInterface produce() {
        return new MyClassOne();
    }

}