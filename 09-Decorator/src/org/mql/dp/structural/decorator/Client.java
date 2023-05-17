package org.mql.dp.structural.decorator;

import java.awt.Color;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class Client extends JFrame {

	private static final long serialVersionUID = 1L;
	private Component component;

	public Client() {
		super("Design pattern Decorator");
		ex01();
		ex02();
		ex03(Color.gray);
		ex04();
		ex03(Color.black);
		JComponent cmp = component.operation();
		getContentPane().add("Center", cmp);
		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	private void ex01() {
		component = new ConcreateComponent();
	}

	private void ex02() {
		component = new ConcreateDecoratorA(component);
	}

	private void ex03(Color color) {
		component = new ConcreatedecoratorC(component, color);
	}

	private void ex04() {
		component = new ConcreatedecoratorB(component, "Design pattern");
	}

	public static void main(String[] args) {
		new Client();
	}
}
