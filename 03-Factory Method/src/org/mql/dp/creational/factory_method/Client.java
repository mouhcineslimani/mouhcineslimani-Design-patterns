package org.mql.dp.creational.factory_method;

import javax.swing.JFrame;

public class Client extends JFrame {
 
	private static final long serialVersionUID = 1L;
	
	public Client() {
		super("Factory Method");
		//ex01();
		//ex02();
		ex03();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
		setVisible(true);
	}
	
	private void ex01() {
		setContentPane(new ButtonCreator("Creational","Structural","Behavioral"));
	}
	
	private void ex02() {
		setContentPane(new CheckboxCreator("Creational","Structural","Behavioral"));
	}
	
	private void ex03() {
		setContentPane(new RadioButtonCreator("Creational","Structural","Behavioral"));
	}
	
	public static void main(String[] args) {
		new Client();
	}
	
}
