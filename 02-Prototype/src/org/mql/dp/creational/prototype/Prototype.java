package org.mql.dp.creational.prototype;

public class Prototype implements Cloneable {
	private int id = 1;
	private String name = "Prototype";
	private Date date;

	// on ne veut pas créer des objet par le constructeur : new
	// dupliquer mon objet autonome qui ont la meme structure
	public Prototype() {
		date = new Date();
	}

	public Prototype(int id, String name) {
		this.id = id;
		this.name = name;
		date = new Date();
	}

	public Prototype(int id, String name, Date date) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
	}

	// cette méthode est protected , rend elle public
	// on change le type de reteur
	// exception try catch
	// clonable
	// autome ?
	public Prototype clone() {
		try {
			Prototype prototype = (Prototype) super.clone();
			prototype.date = date.clone();
			return prototype;
		} catch (Exception e) {
			System.out.println("Erreur :" + e.getMessage());
			return null;
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Prototype [id=" + id + ", name=" + name + ", date= "+date+"]";
	}

}
