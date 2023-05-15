package org.mql.dp.creational.factory_method;

import javax.swing.AbstractButton;
import javax.swing.JButton;

public class ButtonCreator extends Creator {
	 
	private static final long serialVersionUID = 1L;

	public ButtonCreator() { 
	}

	public ButtonCreator(String ...labels) {
		super(labels); 
	}

	public AbstractButton factoryMethod(String label) {
		return new JButton(label);
	}
}
