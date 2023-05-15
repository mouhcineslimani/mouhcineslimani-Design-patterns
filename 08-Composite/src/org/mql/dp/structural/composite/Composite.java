package org.mql.dp.structural.composite;

import java.util.LinkedList;
import java.util.List;

import org.mql.dp.structural.composite.abstract_factory.AbstractFactory;

public class Composite extends Component {

	private List<Component> children;

	public Composite(String name) {
		super(name);
		children = new LinkedList<Component>();
	}

	@Override
	public void add(Component child) {
		children.add(child);
	}

	@Override
	public void remove(Component child) {
		children.remove(child);
	}

	@Override
	public Component get(int index) {
		return children.get(index);
	}

	@Override
	public int size() {
		return children.size();
	}

	@Override
	public void operation() {
		System.out.println("<" + getName() + ">");
		for (Component child : children) {
			child.operation();
		}
	}

	@Override
	public Object construct() {
		return factory.getComposite(this);
	}

	@Override
	public void setFactory(AbstractFactory factory) {
		this.factory = factory;
		for (Component child : children) {
			child.setFactory(factory);
		}
	}

}
