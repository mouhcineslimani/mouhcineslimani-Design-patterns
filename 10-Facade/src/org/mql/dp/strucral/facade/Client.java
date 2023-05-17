package org.mql.dp.strucral.facade;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;

public class Client extends JFrame {

	private static final long serialVersionUID = 1L;

	public Client() {
		TableFacade table = new TableFacade("Design pattern", "Id", "Name", "Category");

		table.addRow("5", "Builder", "Creational");
		table.addRow("1", "Singleton", "Creational");
		table.addRow("2", "Prototype", "Creational");
		table.addRow("3", "Factory Method", "Creational");
		table.addRow("4", "Abstract Factory", "Creational");

		table.setCellBackground(1, 2, Color.yellow);
		table.setColumnBackground(1, Color.cyan);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setContentPane(table);
		pack();
		setVisible(true);

	}

	private void ex01() {

	}

	private void ex02() {

	}

	public static void main(String[] args) {

		new Client();
	}

}
