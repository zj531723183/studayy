package com.mode.create.factory;

public class FactoryTest {
	public static void main(String[] args) {
		MyFactory factory = new MyFactory();
		MyInterface myi = factory.produce("Two");
		//myi.print();
		MyInterface c = factory.produceOne();
		MyInterface cc =  MyFactory.produceOneStatic();
	
		//cc.print();
		
		 Provider provider = new MyFactoryOne();
		MyInterface myi1 = provider.produce();
	        myi1.print();
	}
}
