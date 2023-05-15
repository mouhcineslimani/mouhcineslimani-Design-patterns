package org.mql.dp.structural.adapter.simple;

import javax.swing.JFrame;

public class Client extends JFrame {

	public Client() {
		ex01();
	}

	private void ex01() {
		Screen s = new Screen();
		s.add(new CercleAdapter(new Cercle(200, 200, 50)));
		s.add(new CercleAdapter(new Cercle(120, 200, 60)));
		s.add(new CercleAdapter(new Cercle(300, 200, 70)));
		s.add(new LineAdapter(new Line(0, 0, 100, 100)));
		s.add(new LineAdapter(new Line(250, 300, 400, 400)));
		s.add(new LineAdapter(new Line(160, 60, 300, 300)));
		s.add(new RectangleAdapter(new Rectangle(300, 300, 100, 50)));
		s.add(new RectangleAdapter(new Rectangle(200, 150, 100, 150)));

		add(s);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(600,500);
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		new Client();
	}
}
