package org.mql.dp.structural.composite;

import org.mql.dp.structural.composite.abstract_factory.AbstractFactory;

public class Leaf extends Component {

	public Leaf(String name) {
		super(name);
	}

	@Override
	public void operation() {
		System.out.println(" - " + getName());
	}

	 @Override
	public Object construct() {
		return factory.getLeaf(this);
	}

	@Override
	public void setFactory(AbstractFactory factory) {
		this.factory = factory;
	}
	 

}
