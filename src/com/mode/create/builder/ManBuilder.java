package com.mode.create.builder;

/**
 * @ClassName: ManBuilder
 * @Description: ConcreteBuilder��ʵ��Builder�ӿڣ���Բ�ͬ����ҵ�߼������廯���Ӷ���ĸ����ֵĴ����� �ڽ��������ɺ��ṩ��Ʒ��ʵ������
 * @author: Administrator
 * @date: 2016��12��27�� ����12:49:36
 */
public class ManBuilder implements PersonBuilder {
	Person person;

	public ManBuilder() {
		person = new Person();
	}
	public void buildBody() {
		person.setBody("�������˵�����");
	}
	public void buildFoot() {
		person.setFoot("�������˵Ľ�");
	}
	
	public void buildHead() {
		person.setHead("�������˵�ͷ");
	}
	public Person buildPerson() {
		return person;
	}
}
