package org.mql.dp.structural.composite.file_explorer;

import java.io.File;

import org.mql.dp.structural.composite.Component;
import org.mql.dp.structural.composite.Composite;
import org.mql.dp.structural.composite.Leaf;

public class FileExplorer {
	private Component tree;

	public FileExplorer(String source) {
		tree = createComponent(new File(source));
	}

	public Component createComponent(File f) {
		if (f.isDirectory()) {
			Component cmp = new Composite(f.getName());
			File children[] = f.listFiles();
			for (File child : children) {
				Component component = createComponent(child);
				if (component != null) {
					cmp.add(component);
				}
			}
			return cmp;
		} else if (f.isFile()) { 
			return new Leaf(f.getName());
		}

		return null;
	}

	public Component getTree() {
		return tree;
	}
}
