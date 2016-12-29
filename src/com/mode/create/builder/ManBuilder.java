package com.mode.create.builder;

/**
 * @ClassName: ManBuilder
 * @Description: ConcreteBuilder（实现Builder接口，针对不同的商业逻辑，具体化复杂对象的各部分的创建。 在建造过程完成后，提供产品的实例。）
 * @author: Administrator
 * @date: 2016年12月27日 下午12:49:36
 */
public class ManBuilder implements PersonBuilder {
	Person person;

	public ManBuilder() {
		person = new Person();
	}
	public void buildBody() {
		person.setBody("建造男人的身体");
	}
	public void buildFoot() {
		person.setFoot("建造男人的脚");
	}
	
	public void buildHead() {
		person.setHead("建造男人的头");
	}
	public Person buildPerson() {
		return person;
	}
}
