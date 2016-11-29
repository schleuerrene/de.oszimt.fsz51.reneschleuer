package de.oszimt.fsz51.reneschleuer;

public class Fußballfan {

	private String name;
	private Verein verein;

	public Fußballfan(String name) {
		this.setName(name);
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setVerein(Verein verein) {
		this.verein = verein;
	}
	
	public Verein getVerein() {
		return this.verein;
	}
	
	public void removeVerein() {
		this.verein = null;
	}
}
