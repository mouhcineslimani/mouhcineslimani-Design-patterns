package org.mql.dp.structural.composite;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

import org.mql.dp.structural.composite.abstract_factory.StringFactory;
import org.mql.dp.structural.composite.abstract_factory.TreeNodeFactory;
import org.mql.dp.structural.composite.file_explorer.FileExplorer;

public class Client {

	private Component tree;

	public Client() {
		ex02();
		// operation();
		construct2();
	}

	private void construct1() {
		tree.setFactory(new StringFactory());
		System.out.println(tree.construct());
	}
	
	private void construct2() {
		tree.setFactory(new TreeNodeFactory());
		DefaultMutableTreeNode treeNode = (DefaultMutableTreeNode) tree.construct();
		DefaultTreeModel model = new DefaultTreeModel(treeNode);
		JTree jt = new JTree(model);

		JFrame f = new JFrame("Composite + Abstract Factory");
		f.setContentPane(new JScrollPane(jt));
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		f.setSize(500,500);
		f.setLocationRelativeTo(null);
		 
	}

	private void ex01() {
		Component a = new Composite("A");
		Component b = new Composite("B");
		Component c = new Composite("C");
		Component e = new Composite("E");
		Component g = new Composite("G");
		Component i = new Composite("I");

		a.add(b);
		a.add(c);

		b.add(new Leaf("D"));
		b.add(e);

		e.add(new Leaf("F"));
		e.add(g);

		g.add(new Leaf("H"));

		c.add(i);

		i.add(new Leaf("J"));
		i.add(new Leaf("K"));

		tree = a; // a c'est la racine

	}

	public void operation() {
		tree.operation();
	}

	private void ex02() {
		FileExplorer fe = new FileExplorer("..");
		tree = fe.getTree();
	}

	public static void main(String[] args) {
		new Client();
	}
}
