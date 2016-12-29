package com.mode.create.factory;

public class MyFactory {
	public MyInterface produce(String type) {
		if ("One".equals(type)) {
			return new MyClassOne();
		} else if ("Two".equals(type)) {
			return new MyClassTwo();
		} else {
			System.out.println("没有要找的类型");
			return null;
		}
	}
	public MyInterface produceOne() {
		return new MyClassOne();
	}
	public MyInterface produceTwo() {
		return new MyClassTwo();
	}
	public static MyInterface produceOneStatic() {
		return new MyClassOne();
	}
	public static MyInterface produceTwoStatic() {
		return new MyClassTwo();
	}
}
