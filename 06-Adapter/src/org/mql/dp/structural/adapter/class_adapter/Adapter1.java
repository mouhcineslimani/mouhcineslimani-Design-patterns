package org.mql.dp.structural.adapter.class_adapter;

import org.mql.dp.structural.adapter.Adaptee1;
import org.mql.dp.structural.adapter.Target;

public class Adapter1 extends Adaptee1 implements Target {

	public Adapter1() {
	}

	@Override
	public void hadler() {
		print();
	}
}
