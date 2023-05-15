package org.mql.dp.structural.adapter.simple;

import javax.swing.JFrame;

public class Client extends JFrame {
	
	public Client() {
		ex01();
	}

	private void ex01() {
		Screen s = new Screen() ; 
		s.add(new CercleAdapter(new Cercle(10,10, 10))) ; 
		s.add(new LineAdapter(new Line(50,50, 100,100))) ; 
		s.add(new RectangleAdapter(new Rectangle(200,200, 10,10))) ; 
		add(s);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		new Client();
	}
}
