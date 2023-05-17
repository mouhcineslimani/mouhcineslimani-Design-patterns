package org.mql.dp.structural.decorator;

import javax.swing.JComponent;

public class Decorator extends Component {
	private Component component;

	public Decorator(Component component) {
		super();
		this.component = component;
	}

	public Component getComponent() {
		return component;
	}

	@Override
	public JComponent operation() {
		return this.component.operation();
	}
}
