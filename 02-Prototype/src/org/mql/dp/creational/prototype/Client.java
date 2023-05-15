package org.mql.dp.creational.prototype;

public class Client {

	public Client() {
		ex01();
	}

	private void ex01() {
		Prototype prototype = new Prototype(); 
		Prototype p1 = prototype.clone();
		System.out.println("prototype : "+prototype);
		System.out.println("p1 : " +p1); 
		System.out.println("Aprés la modification : ");
		p1.setName("P1");
		p1.getDate().setYear(2024);
		System.out.println("prototype : "+prototype);
		System.out.println("p1 : "+p1);
		/*
		 * NB: autonomie
		 * il faut faire la meme chose pour les autres classe ( clonage par réf ) 
		 */
	}

	public static void main(String[] args) {
		new Client();
	}
}
