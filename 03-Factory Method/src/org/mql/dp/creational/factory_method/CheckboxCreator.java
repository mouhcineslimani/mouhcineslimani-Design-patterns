package org.mql.dp.creational.factory_method;

import javax.swing.AbstractButton;
import javax.swing.JCheckBox; 

public class CheckboxCreator extends Creator {
	private static final long serialVersionUID = 1L;

	public CheckboxCreator() { 
	}

	public CheckboxCreator(String ...labels) {
		super(labels); 
	}

	public AbstractButton factoryMethod(String label) {
		return new JCheckBox(label);
	}
}
