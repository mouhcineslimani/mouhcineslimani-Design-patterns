package org.mql.dp.structural.adapter.class_adapter;

import org.mql.dp.structural.adapter.Adaptee3;
import org.mql.dp.structural.adapter.Target;

public class Adapter3 extends Adaptee3 implements Target {
	public Adapter3() {
 	}

	@Override
	public void hadler() {
		display();
	}
}
