package org.mql.dp.abstract_factory;

import javax.swing.JPanel;

public interface AbstractFactory {
	public JPanel createProductA(String label, int size);
	public JPanel createProductB(String title, Object data[][]);
	public JPanel createProductC(String label, String ...choices);
}
