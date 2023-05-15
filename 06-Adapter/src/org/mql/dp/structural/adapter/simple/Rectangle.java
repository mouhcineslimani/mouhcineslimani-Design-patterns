package org.mql.dp.structural.adapter.simple;

import java.awt.Graphics;

public class Rectangle {
	private int x, y;
	private int width, height;

	public Rectangle(int x, int y, int width, int height) {
		super();
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	public void dessiner(Graphics g) {
		g.drawRect(x, y, width, height);
	}

}
