package org.mql.dp.creational.builder;

public interface Builder {

	public void step1(String ...row);

	public void step2(String keyword);

	public void step3();

	public Object getResult();
}
