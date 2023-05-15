package org.mql.dp.abstract_factory;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Label;
import java.util.Arrays;

import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class ConcreteFactory1 implements AbstractFactory {

	public ConcreteFactory1() {
	}

	@Override
	public JPanel createProductA(String label, int size) {
		JPanel p = new JPanel(new FlowLayout(FlowLayout.LEFT));
		p.add(new Label(label + ":"));
		p.add(new JTextField(size));
		return p;
	}

	@Override
	public JPanel createProductB(String title, Object[][] data) {
		JPanel p = new JPanel(new BorderLayout());
		p.add("North",new Label(title+ ":"));
		String items[] = new String[data.length]; 
		
		for (int i = 0; i < data.length; i++) {
			items[i] = Arrays.toString(data[i]);
		}
		
		p.add("Center", new JScrollPane( new JList<String>(items)));
 		return p;
	}

	@Override
	public JPanel createProductC(String label, String... choices) {
		JPanel p = new JPanel(new FlowLayout(FlowLayout.LEFT));
		p.add(new Label(label + ":"));
		p.add(new JComboBox<String>(choices));
		return p;
	}

}
