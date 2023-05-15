package org.mql.dp.structural.adapter.object_adapter;

import org.mql.dp.structural.adapter.Adaptee3;
import org.mql.dp.structural.adapter.Target;

public class Adapter3 implements Target {
	private Adaptee3 a;

	public Adapter3(Adaptee3 a) {
		super();
		this.a = a;
	}

	@Override
	public void hadler() {
		a.display();
	}   
}	
