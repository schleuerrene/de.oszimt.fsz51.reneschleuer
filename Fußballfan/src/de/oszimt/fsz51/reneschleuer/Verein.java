package de.oszimt.fsz51.reneschleuer;

public class Verein {

	private String name;

	public Verein(String name) {
		this.setName(name);
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
}
