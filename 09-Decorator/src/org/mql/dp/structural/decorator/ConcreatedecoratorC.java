package org.mql.dp.structural.decorator;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class ConcreatedecoratorC extends Decorator {
	private Color color;

	public ConcreatedecoratorC(Component component, Color color) {
		super(component);
		this.color = color;
	}

	@Override
	public JComponent operation() {
		return addedBehabior(getComponent().operation());
	}

	public JComponent addedBehabior(JComponent component) {
		JPanel p = new JPanel(new FlowLayout(FlowLayout.LEFT));
		p.add(component);
		p.setBorder(new LineBorder(color));
		return p;
	}

}
