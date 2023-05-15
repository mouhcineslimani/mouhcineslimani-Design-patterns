package org.mql.dp.structural.adapter.class_adapter;

import org.mql.dp.structural.adapter.Adaptee2;
import org.mql.dp.structural.adapter.Target;

public class Adapter2 extends Adaptee2 implements Target {
	public Adapter2() {
	}

	@Override
	public void hadler() {
		log();
	}
}
