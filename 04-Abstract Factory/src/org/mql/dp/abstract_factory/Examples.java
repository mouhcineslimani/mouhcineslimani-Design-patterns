package org.mql.dp.abstract_factory;

public class Examples {

	public Examples() {
		exp01();
	}

	private void exp01() {

	}

	private void exp02() {
		
	}

	public static void main(String[] args) {
		//Client c1 =  new Client(new ConcreteFactory1());
		//c1.construct();
		Client c2 = new Client(new ConcreteFactory2("N°","Name","Category"));
		c2.construct();
	}
}
