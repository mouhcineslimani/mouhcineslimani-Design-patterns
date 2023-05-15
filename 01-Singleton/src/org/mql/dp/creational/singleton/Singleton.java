package org.mql.dp.creational.singleton;

public class Singleton {
	
	private static Singleton instance ; 
	
	static { 
		// wiring 
		instance = new Singleton();
	}
	
	private Singleton() {
	}
	
	public static Singleton getInstance() {
		return instance;
	}
}
