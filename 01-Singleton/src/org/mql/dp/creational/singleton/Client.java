package org.mql.dp.creational.singleton;

import java.awt.Toolkit;

public class Client {
	public Client() {
		ex01();
		knowUses();
	}
	
	public void ex01() {
		//Singleton s1 = new Singleton();
		Singleton s = Singleton.getInstance();
		Singleton s1 = Singleton.getInstance();
		System.out.println(s);
		System.out.println(s1);
	}
	
	private void knowUses() {
		Toolkit tk = Toolkit.getDefaultToolkit(); // boite à outils systemes
		Toolkit tk1 = Toolkit.getDefaultToolkit();
		Toolkit tk2 = Toolkit.getDefaultToolkit();
		System.out.println(tk);
		System.out.println(tk1);
		System.out.println(tk2); 
	}
	
	public static void main(String[] args) {
		new Client();
	}
}
