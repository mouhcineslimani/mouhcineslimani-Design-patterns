package org.mql.dp.strucural.brigde;

import java.util.Iterator;

public class ConcreateImplementorB implements Implementor {
	private XMLNode node;

	public ConcreateImplementorB(String source) {
		node = new XMLNode(source);
	}

	@Override
	public String[][] getData() {
		XMLNode[] rows = node.children();

		String data[][] = new String[rows.length + 1][];
		int i = 0;
		XMLNode attrs[] = rows[0].getAttributes();
		XMLNode children[] = rows[0].children();
		data[0] = new String[attrs.length + children.length];

		for (int j = 0; j < attrs.length; j++) {
			data[i][j] = attrs[j].name();
		}

		for (int j = 0; j < children.length; j++) {
			data[i][attrs.length + j] = children[j].name();
		}

		for (XMLNode row : rows) {
			i++;
			attrs = row.getAttributes();
			children = row.children();
			data[i] = new String[attrs.length + children.length];

			for (int j = 0; j < attrs.length; j++) {
				data[i][j] = attrs[j].value();
			}

			for (int j = 0; j < children.length; j++) {
				data[i][attrs.length + j] = children[j].value();
			}
		}

		return data;
	}
}
