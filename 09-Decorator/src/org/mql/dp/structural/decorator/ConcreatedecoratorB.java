package org.mql.dp.structural.decorator;

import java.awt.FlowLayout;

import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ConcreatedecoratorB extends Decorator {
	private String label;

	public ConcreatedecoratorB(Component component, String label) {
		super(component);
		this.label = label + ":";
	}

	@Override
	public JComponent operation() {
		return addedBehavior(getComponent().operation());
	}

	public JComponent addedBehavior(JComponent component) {
		JPanel p = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JLabel l = new JLabel(label);
		p.add(l);
		p.add(component);
		return p;
	}

}
