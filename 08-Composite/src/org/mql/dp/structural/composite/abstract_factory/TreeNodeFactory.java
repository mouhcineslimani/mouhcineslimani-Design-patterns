package org.mql.dp.structural.composite.abstract_factory;

import javax.swing.tree.DefaultMutableTreeNode;

import org.mql.dp.structural.composite.Composite;
import org.mql.dp.structural.composite.Leaf;

public class TreeNodeFactory implements AbstractFactory {

	public TreeNodeFactory() {
	}

	@Override
	public Object getLeaf(Leaf leaf) {
		return new DefaultMutableTreeNode(leaf.getName());
	}

	@Override
	public Object getComposite(Composite composite) {
		DefaultMutableTreeNode node = new DefaultMutableTreeNode(composite.getName());
		int n = composite.size();

		for (int i = 0; i < n; i++) {
			node.add((DefaultMutableTreeNode)composite.get(i).construct());
		}

		return node;
	}
}
