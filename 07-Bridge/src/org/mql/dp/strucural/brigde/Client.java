package org.mql.dp.strucural.brigde;
 

public class Client {
	
	private Abstraction abstraction ;
	
	public Client() {
		abstraction = new RefinedAbstraction();
		//ex01();
		ex02();
		abstraction.operation();
	}

	private void ex01() {
		abstraction.setImp(new ConcreteImplementorA("resources/design-patterns.txt"));
	}
	

	private void ex02() {
		abstraction.setImp(new ConcreateImplementorB("resources/design-patterns.xml"));
	}
	
 

	public static void main(String[] args) {
		new Client();
	}
}
