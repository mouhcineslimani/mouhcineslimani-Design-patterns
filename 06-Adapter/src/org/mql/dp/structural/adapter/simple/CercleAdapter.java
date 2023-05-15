package org.mql.dp.structural.adapter.simple;

import java.awt.Graphics;

public class CercleAdapter implements Shape {
	private Cercle c;

	public CercleAdapter(Cercle c) {
		super();
		this.c = c;
	}

	@Override
	public void paint(Graphics g) {
		c.draw(g);
	}

}
