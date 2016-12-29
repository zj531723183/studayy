package com.mode.create.factory;
public class MyFactoryTwo implements Provider {

    @Override
    public MyInterface produce() {
        return new MyClassTwo();
    }

}