package org.mql.dp.strucural.brigde;

import java.util.Vector;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLNode {

	private Node node; // est un wrapper

	public XMLNode(Node node) {
		this.node = node;
	}

	public XMLNode(String source) {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newDefaultInstance();
		try {
			DocumentBuilder builder = factory.newDocumentBuilder(); // factory est un factory bin et newDocumentBuiler
																	// est un factory method
			Document document = builder.parse(source);
			// pour savoir les != nodes existe en faisant (Node.)
			// pour avoir tous les données , passer par les nodes
			System.out.println(document.getDocumentElement().getNodeName());
			node = document.getFirstChild();
			while (node.getNodeType() != Node.ELEMENT_NODE)
				node = node.getNextSibling();
			System.out.println(node.getNodeName());
		} catch (Exception e) {
			System.out.println("Erreur : " + e.getMessage()); // ce n'est pas une bonne pratique mais c'est mieux
																// d'utiliser le journalisation
		}
		/**
		 * inconvinient du dom parser est : on peut avoir des big data ce qui va
		 * entraine endommager la ram solution est : sax
		 */
	}

	public XMLNode[] children() {
		NodeList list = node.getChildNodes();
		Vector<XMLNode> nodes = new Vector<XMLNode>();
		for (int i = 0; i < list.getLength(); i++) {
			if (list.item(i).getNodeType() == Node.ELEMENT_NODE)
				nodes.add(new XMLNode(list.item(i)));
		}
		return nodes.toArray(new XMLNode[nodes.size()]);
	}

	public XMLNode child(String name) {
		NodeList list = node.getChildNodes();
		for (int i = 0; i < list.getLength(); i++) {
			if (list.item(i).getNodeName().equals(name))
				return new XMLNode(list.item(i));
		}
		return null;
	}

	public String value() {
		if (node.getNodeType() == Node.ELEMENT_NODE)
			return node.getFirstChild().getNodeValue();
		return node.getNodeValue();
	}

	public String name() {
		return node.getNodeName();
	}

	public boolean isElement() {
		return node.getNodeType() == Node.ELEMENT_NODE;
	}

	public String attribute(String name) {
		NamedNodeMap attrs = node.getAttributes();
		return attrs.getNamedItem(name).getNodeValue();
	}

	public int intAttribute(String name) {
		NamedNodeMap attrs = node.getAttributes();
		try {
			return Integer.parseInt(attrs.getNamedItem(name).getNodeValue());
		} catch (Exception e) {
			return -1;
		}
	}

	public XMLNode[] getAttributes() {
		NamedNodeMap attrs = node.getAttributes();
		XMLNode nodes[] = new XMLNode[attrs.getLength()];
		for (int i = 0; i < nodes.length; i++) {
			nodes[i] = new XMLNode(attrs.item(i));
		}
		return nodes;
	}

	public void print() {
		System.out.println(node.getNodeName() + " , " + node.getNodeType() + " , " + node.getNodeValue());
	}

}