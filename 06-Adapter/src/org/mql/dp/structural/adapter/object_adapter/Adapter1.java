package org.mql.dp.structural.adapter.object_adapter;

import org.mql.dp.structural.adapter.Adaptee1;
import org.mql.dp.structural.adapter.Target;

public class Adapter1 implements Target {
	
	private Adaptee1 a ; 
	
	public Adapter1() {
		// TODO Auto-generated constructor stub
	}

	public Adapter1(Adaptee1 a) {
		super();
		this.a = a;
	}

	@Override
	public void hadler() { 
		a.print();
	}
	
}	
