package org.mql.dp.structural.adapter;

public class Main {
	public Main() {
		ex01();
	}

	private void ex01() {
		Object[] targets = {
				new Adaptee1(),
				new Adaptee2(),
				new Adaptee3(),
				new Adaptee1(),
				new Adaptee2(),
				new Adaptee3(),
		};
		
		ClassicSolution c1 = new ClassicSolution();
		c1.handle(targets);
	}

	public static void main(String[] args) {
		new Main();
	}
}
