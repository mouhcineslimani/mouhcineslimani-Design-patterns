package org.mql.dp.structural.adapter.object_adapter;

import org.mql.dp.structural.adapter.Adaptee2;
import org.mql.dp.structural.adapter.Target;

public class Adapter2 implements Target {
	private Adaptee2 a2;

	public Adapter2(Adaptee2 a2) {
		super();
		this.a2 = a2;
	}

	@Override
	public void hadler() {
		a2.log();
	}
}
