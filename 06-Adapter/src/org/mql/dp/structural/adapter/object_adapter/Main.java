package org.mql.dp.structural.adapter.object_adapter;

import org.mql.dp.structural.adapter.Adaptee1;
import org.mql.dp.structural.adapter.Adaptee2;
import org.mql.dp.structural.adapter.Adaptee3;
import org.mql.dp.structural.adapter.Client;
import org.mql.dp.structural.adapter.Target;

public class Main {
	public Main() {
		ex01();
	}

	private void ex01() {
		Target[] targets = {
				new Adapter1(new Adaptee1()),
				new Adapter2(new Adaptee2()),
				new Adapter3(new Adaptee3()),
				new Adapter3(new Adaptee3()),
				new Adapter1(new Adaptee1()),
				new Adapter2(new Adaptee2()),
				new Adapter1(new Adaptee1()),
		};
		
		Client c = new Client();
		c.handle(targets);
	}

	public static void main(String[] args) {
		new Main();
	}
}
