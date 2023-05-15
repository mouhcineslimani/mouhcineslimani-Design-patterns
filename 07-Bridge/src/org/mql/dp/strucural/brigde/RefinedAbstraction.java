package org.mql.dp.strucural.brigde;

import java.util.Arrays;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class RefinedAbstraction extends Abstraction {
	// on peut red�finir la classe ou bien �vouluer la classe
	public RefinedAbstraction() {
	}

	public RefinedAbstraction(Implementor imp) {
		super(imp);
	}

	@Override
	public void operation() {
		String[][] data = getImp().getData();
		String rows[][] = Arrays.copyOfRange(data, 1, data.length);

		JTable table = new JTable(rows, data[0]);
		JFrame f = new JFrame("Design Pattern Bridge");
		f.setContentPane(new JScrollPane(table));
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		f.pack();
	}

}
