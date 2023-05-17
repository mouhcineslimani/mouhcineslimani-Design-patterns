package org.mql.dp.structural.decorator;

import javax.swing.JComponent;
import javax.swing.JTextArea;

public class ConcreateComponent extends Component {

	private JComponent component;

	public ConcreateComponent() {
		component = new JTextArea(3, 40);
	}

	public ConcreateComponent(JComponent component) {
		super();
		this.component = component;
	}

	@Override
	public JComponent operation() {
		return this.component;
	}
}
