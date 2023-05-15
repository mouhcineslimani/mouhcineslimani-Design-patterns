package org.mql.dp.structural.composite.abstract_factory;

import org.mql.dp.structural.composite.Composite;
import org.mql.dp.structural.composite.Leaf;

public interface AbstractFactory {
	
	public Object getLeaf(Leaf leaf);
	public Object getComposite(Composite composite);
}
