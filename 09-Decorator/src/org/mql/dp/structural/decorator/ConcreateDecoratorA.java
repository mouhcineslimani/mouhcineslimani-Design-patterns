package org.mql.dp.structural.decorator;

import javax.swing.JComponent;
import javax.swing.JScrollPane;

public class ConcreateDecoratorA extends Decorator {

	public ConcreateDecoratorA(Component component) {
		super(component);
	}
	
	@Override
	public JComponent operation() {
		return  addBehavior(getComponent().operation());
	}
	
	public JComponent addBehavior(JComponent component) {
		return new JScrollPane(component);
	}

}
