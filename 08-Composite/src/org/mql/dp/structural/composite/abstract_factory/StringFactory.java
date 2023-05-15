package org.mql.dp.structural.composite.abstract_factory;

import org.mql.dp.structural.composite.Composite;
import org.mql.dp.structural.composite.Leaf;

public class StringFactory implements AbstractFactory {

	public StringFactory() {
	}

	@Override
	public Object getLeaf(Leaf leaf) {
		return " " + leaf.getName() + " ";
	}

	@Override
	public Object getComposite(Composite composite) {
		String s = " "+ composite.getName() + " (";
		int n = composite.size();

		for (int i = 0; i < n; i++) {
			s += composite.get(i).construct();
		}

		return s + ")";
	}

}
