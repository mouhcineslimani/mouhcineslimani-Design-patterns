package org.mql.dp.creational.builder;

import java.io.BufferedReader;
import java.io.FileReader;

public class Director {

	private Builder builder;

	public Director(Builder builder) {
		this.builder = builder;
	}

	public Object construct(String src, String keyword) {
		try {
			BufferedReader in = new BufferedReader(new FileReader(src));
			String row = in.readLine();

			while (row != null) {
				builder.step1(row.split(";"));
				builder.step2(keyword);
				row = in.readLine();
			}
			builder.step3();
			Object result = builder.getResult();
			in.close();
			return result;
		} catch (Exception ex) {
			System.out.println("Erreur : " + ex.getMessage());
			return null;
		}
	}

}
