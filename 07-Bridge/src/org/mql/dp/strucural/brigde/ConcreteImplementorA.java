package org.mql.dp.strucural.brigde;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;
import java.util.Vector;

public class ConcreteImplementorA implements Implementor {
	private String source;

	public ConcreteImplementorA(String source) {
		super();
		this.source = source;
	}

	@Override
	public String[][] getData() {
		String[][] data = null ; 
		try {
			BufferedReader in = new BufferedReader(new FileReader(source));
			List<String[]> rows = new Vector<String[]>();
			String row = in.readLine() ;
			
			while( row != null )
			{
				rows.add(row.split(";"));
				row = in.readLine();
			}
			
			in.close(); 
			data = new String[rows.size()][]; 
			rows.toArray(data);
		} catch (Exception e) {
			System.out.println("Erreur : "+e.getMessage());
		}
		return data ;
	}
}
