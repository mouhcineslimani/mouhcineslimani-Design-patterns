package org.mql.dp.creational.builder;

import java.util.List;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class Client {
	public Client() {
		// ex01();
		ex02();
	}

	private void ex01() {
		Director director = new Director(new ConcreateBuilderA());
		List<DesignPattern> result = (List<DesignPattern>) director.construct("resources/design-patterns.txt",
				"Creational");

		for (DesignPattern p : result) {
			System.out.println(" - " + p.getName());
		}
	}

	private void ex02() {
		Director director = new Director(new ConcreateBuilderB("ID", "Name", "Category", "Intent"));
		JTable table = (JTable) director.construct("resources/design-patterns.txt", "Interface");
		JFrame f = new JFrame("Design Pattern Builder");
		f.setContentPane(new JScrollPane(table));
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		f.pack();
		f.setLocationRelativeTo(null);
		f.setVisible(true);
	}

	private void KnownUses() {
		try {
			SAXParserFactory factory = SAXParserFactory.newDefaultInstance();
			SAXParser director = factory.newSAXParser();
			DefaultHandler builder = new DefaultHandler() {
				@Override
				public void startDocument() throws SAXException {} // step1 
			};
			director.parse("",  builder);
		} catch (Exception e) {
			System.out.println("Erreur : "+e.getMessage());
 		}
	}

	public static void main(String[] args) {
		new Client();
	}
}
