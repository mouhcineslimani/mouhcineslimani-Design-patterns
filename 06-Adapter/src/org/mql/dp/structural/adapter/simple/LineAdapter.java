package org.mql.dp.structural.adapter.simple;

import java.awt.Graphics;

public class LineAdapter implements Shape {
	private Line l ;

	public LineAdapter(Line l) {
		super();
		this.l = l;
	} 
	
	@Override
	public void paint(Graphics g) {
		l.rander(g);
	}
}
