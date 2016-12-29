package com.mode.create.builder;

/**
 * @ClassName: PersonBuilder
 * @Description: Builder������һ������ӿڣ��Թ淶��Ʒ����ĸ�����ɳɷֵĽ��졣����ӿڹ涨Ҫʵ�ָ��Ӷ������Щ���ֵĴ����������漰����Ķ��󲿼��Ĵ�������
 * @author: Administrator
 * @date: 2016��12��27�� ����12:53:58
 */
public interface PersonBuilder {
	void buildHead();
	void buildBody();
	void buildFoot();
	Person buildPerson();
}
