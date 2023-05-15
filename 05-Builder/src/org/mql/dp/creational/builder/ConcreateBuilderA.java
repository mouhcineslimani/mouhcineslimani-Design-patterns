package org.mql.dp.creational.builder;

import java.util.List;
import java.util.Vector;

public class ConcreateBuilderA implements Builder {
	private List<DesignPattern> result;
	private DesignPattern pattern;

	public ConcreateBuilderA() {
		result = new Vector<DesignPattern>();
	}

	@Override
	public void step1(String... row) {
		if (row != null && row.length >= 4) {
			pattern = new DesignPattern(0, row[1], row[2], row[3]);
			try {
				pattern.setId(Integer.parseInt(row[0]));
			} catch (Exception e) {
				System.out.println("Erreur : " + e.getMessage());
			}
		} else
			pattern = null;
	}

	@Override
	public void step2(String keyword) {
		
		if( pattern != null && pattern.getCategory().toLowerCase().contains(keyword.toLowerCase())) 
		{
			result.add(pattern);
		}
	}

	@Override
	public void step3() {
		int n = result.size();
		for (int i = 0; i < n ; i++) {
			int min = i ; 
			for (int j = i+1 ; j < n; j++) {
				if( result.get(j).getName().compareTo(result.get(min).getName()) < 0)
				{
					min = j ;
				}
			}
			DesignPattern tmp = result.get(i);
			result.set(i,result.get(min));
			result.set(min, tmp);
		}
	}

	@Override
	public Object getResult() {
		return this.result;
	}

}
