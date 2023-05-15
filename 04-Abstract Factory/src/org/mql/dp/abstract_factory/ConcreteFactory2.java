package org.mql.dp.abstract_factory;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Label;
import java.util.Arrays;

import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea; 

public class ConcreteFactory2 implements AbstractFactory {

	private String titles[];
	
	public ConcreteFactory2(String ...titles) {
		this.titles = titles;
	}

	@Override
	public JPanel createProductA(String label, int size) {
		JPanel p = new JPanel(new FlowLayout(FlowLayout.LEFT));
		p.add(new Label(label + ":"));
		p.add(new JScrollPane(new JTextArea(3,size)));
		return p;
	}

	@Override
	public JPanel createProductB(String title, Object[][] data) {
		JPanel p = new JPanel(new BorderLayout());
		p.add("North",new Label(title+ ":")); 
		
		p.add("Center", new JScrollPane( new JTable(data,titles)));
 		return p;
	}

	@Override
	public JPanel createProductC(String label, String... choices) {
		JPanel p = new JPanel(new FlowLayout(FlowLayout.LEFT));
		p.add(new Label(label + ":"));
		ButtonGroup g = new ButtonGroup(); 
		for (String choice : choices) {
			JRadioButton b = new JRadioButton(choice);
			g.add(b);
			p.add(b);
		} 
		return p;
	}

}