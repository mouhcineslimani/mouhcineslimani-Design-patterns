package org.mql.dp.creational.factory_method;

import java.awt.event.ActionListener; 

import javax.swing.AbstractButton;
import javax.swing.JPanel;

public abstract class Creator extends JPanel {
	 
	private static final long serialVersionUID = 1L;

	public Creator() {
 	}
	
	// je chercher une classe mere , et l'implémentation du code qui change dans les classes filles
	// meme type != au dp : abstract factory qui raisonne famille de diff types
	public Creator(String ...labels) {
		for (String label : labels) {
			AbstractButton product = factoryMethod(label);
			add(product);
		}
 	}
	
	public void anOperation(String label) {
		AbstractButton product = factoryMethod(label);
		add(product);
	}
	
	public void anotherOperation(ActionListener listener) {
		for (int i = 0; i <getComponentCount(); i++) {
			AbstractButton product = (AbstractButton) getComponent(i);
			product.addActionListener(listener);
		}
	}
	
	public abstract AbstractButton factoryMethod(String label);
	
}	
