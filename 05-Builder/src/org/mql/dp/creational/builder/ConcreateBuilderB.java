package org.mql.dp.creational.builder;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ConcreateBuilderB implements Builder {
	private JTable result;
	private DefaultTableModel model; // MVC , C=> listener
	private String[] row;

	public ConcreateBuilderB(String... titles) {
		model = new DefaultTableModel(titles, 0);
	}

	@Override
	public void step1(String... row) {
		this.row = row;
	}

	@Override
	public void step2(String keyword) {
		if (row[3].toLowerCase().contains(keyword.toLowerCase())) {
			model.addRow(row);
		}
	}

	@Override
	public void step3() {
		result = new JTable(model);
	}

	@Override
	public Object getResult() {
		return this.result;
	}

}
