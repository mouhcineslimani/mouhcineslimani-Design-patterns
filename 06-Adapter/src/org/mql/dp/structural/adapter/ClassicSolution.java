package org.mql.dp.structural.adapter;

import java.lang.annotation.Target;
import java.util.Iterator;

public class ClassicSolution {
	public ClassicSolution() {
	}
	
	/*
	 * le problème 1 : mes objects n'ont pas une mm classe 
	 */
	public void handle(Object targest[]) {
		for (Object target : targest) {
			if(target instanceof Adaptee1)
			{
				((Adaptee1)target).print();
			}
			else if(target instanceof Adaptee2)
			{
				((Adaptee2)target).log();
			}
			else if(target instanceof Adaptee3)
			{
				((Adaptee3)target).display();
			}
		}
	}
}
