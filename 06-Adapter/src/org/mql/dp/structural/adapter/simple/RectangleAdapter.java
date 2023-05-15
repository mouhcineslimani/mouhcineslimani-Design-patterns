package org.mql.dp.structural.adapter.simple;

import java.awt.Graphics;

public class RectangleAdapter implements Shape {

	private Rectangle r;

	public RectangleAdapter(Rectangle r) {
		super();
		this.r = r;
	}

	@Override
	public void paint(Graphics g) {
		r.dessiner(g);
	}
}
