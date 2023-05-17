package org.mql.dp.structural.decorator;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.LineNumberReader;

import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class KnownUses {
	public KnownUses() {
		ex01();
	}

	private void ex01() {
		try {
			InputStream is = new FileInputStream("...");
			BufferedReader in = new BufferedReader(new InputStreamReader(is));
			in.readLine(); // addedBehavior(); 
			LineNumberReader lnr = new LineNumberReader(in);
			int n = lnr.getLineNumber(); // addedBehavior() ; 

		} catch (Exception e) {
			System.out.println("Erreur : " + e.getMessage());
		}
	}

	private void ex02() {
		Border b1 = new EtchedBorder();
		Border b2 = new TitledBorder(b1,"Un titre");
		Border b3 = new CompoundBorder(new EmptyBorder(10,10,10,10), b2);
	}

	public static void main(String[] args) {
		new KnownUses();
	}
}
