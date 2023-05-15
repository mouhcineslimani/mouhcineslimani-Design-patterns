package org.mql.dp.structural.adapter;

public class Client {

	public Client() {
	}
	
	public void handle(Target targets[]) {
		for (Target target : targets) {
			target.hadler();
		}
	}
}
