package org.mql.dp.abstract_factory;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Client {
	private AbstractFactory factory;
	
	private Object data[][] = {
			{1,"Singleton","Creational"},
			{4,"Abstract Factory","Creational"},
			{7,"Bridge","Structural"},
			{12,"Proxy","Structural"},
			{18,"Observer","Behavioral"},
	}; 
	
	public Client(AbstractFactory factory) {
		this.factory = factory;
	}
	
	
	public void construct() {
		JPanel a1 = factory.createProductA("Design Pattern", 30);
		JPanel b1 = factory.createProductB("Design patterns", data);
		JPanel c1 = factory.createProductC("Category", "Creational","Structural","Behavioral");
		
		JPanel p = new JPanel(new BorderLayout());
		p.add("North",a1);
		p.add("Center",b1);
		p.add("South",c1);
		
		JFrame f = new JFrame("Abstract Factory");
		f.setContentPane(p);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		f.pack();
	}
	
}
