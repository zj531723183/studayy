package com.mode.create.factory;

public class MyClassOne implements MyInterface {
	@Override
	public void print() {
		System.out.println(this.getClass().getName());
	}
}
