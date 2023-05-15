package org.mql.dp.strucural.brigde;

public class Abstraction {

	private Implementor imp;

	public Abstraction(Implementor imp) {
		super();
		this.imp = imp;
	}

	public Abstraction() {
 	}

	public void operation() {
		String[][] data = imp.getData();
		for (int i = 1; i < data.length; i++) {
			System.out.println("Row n° : " + i);
			for (int j = 0; j < data[i].length; j++) {
				System.out.println(" - " + data[0][j] + " : " + data[i][j]);
			}
		}
	}

	public void setImp(Implementor imp) {
		this.imp = imp;
	}

	public Implementor getImp() {
		return imp;
	}
}
