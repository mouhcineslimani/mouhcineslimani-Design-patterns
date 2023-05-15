package org.mql.dp.structural.adapter.simple;

import java.awt.Graphics;

public class Cercle {
	private int x, y;
	private int ray;

	public Cercle(int x, int y, int ray) {
		super();
		this.x = x;
		this.y = y;
		this.ray = ray;
	}

	public void draw(Graphics g) {
		g.drawOval(x - ray, y - ray, ray * 2, ray * 2);
	}
}
