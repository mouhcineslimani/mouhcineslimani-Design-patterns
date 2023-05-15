package org.mql.dp.structural.adapter.simple;

import java.awt.Graphics;
import java.util.List;
import java.util.Vector;

import javax.swing.JPanel;

public class Screen extends JPanel {

	private static final long serialVersionUID = 1L;
	private List<Shape> shapes;

	public Screen() {
		shapes = new Vector<Shape>();
	}
	
	public void add(Shape s) {
		shapes.add(s);
	}

	@Override
	protected void paintComponent(Graphics g) { 
		super.paintComponent(g);
		for (Shape s : shapes) {
			s.paint(g);
		}
	}
}
