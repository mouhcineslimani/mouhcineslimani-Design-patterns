package org.mql.dp.structural.composite;

import org.mql.dp.structural.composite.abstract_factory.AbstractFactory;

public abstract class Component {
	private String name;

	// associer à notre componenet Le Design Pattern "Abstract Factory"

	protected AbstractFactory factory;

	public Component(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	// les méthodes de composition
	public void add(Component child) {
	}

	public void remove(Component child) {
	}

	public Component get(int index) {
		return null;
	}

	public int size() {
		return 0;
	}

	public abstract void operation();

	public abstract Object construct();
	
	abstract public void setFactory(AbstractFactory factory);
}
