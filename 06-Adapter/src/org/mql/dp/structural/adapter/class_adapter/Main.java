package org.mql.dp.structural.adapter.class_adapter;
 
import org.mql.dp.structural.adapter.Client;
import org.mql.dp.structural.adapter.Target;

public class Main {
	public Main() {
		ex01();
	}

	private void ex01() {
		Target[] targets = { new Adapter1(), new Adapter2(), new Adapter3(), new Adapter3(), new Adapter1(),
				new Adapter2(), new Adapter1(), };

		Client c = new Client();
		c.handle(targets);
	}

	public static void main(String[] args) {
		new Main();
	}
}
