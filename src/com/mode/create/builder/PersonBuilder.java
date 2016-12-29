package com.mode.create.builder;

/**
 * @ClassName: PersonBuilder
 * @Description: Builder（给出一个抽象接口，以规范产品对象的各个组成成分的建造。这个接口规定要实现复杂对象的哪些部分的创建，并不涉及具体的对象部件的创建。）
 * @author: Administrator
 * @date: 2016年12月27日 下午12:53:58
 */
public interface PersonBuilder {
	void buildHead();
	void buildBody();
	void buildFoot();
	Person buildPerson();
}
