package ch.modul226.airport.model;

public class Gate {
	
	private int nummer;
	private Flug flug;
	
	public Gate(int nummer) {
		this.nummer = nummer;
	}
	
	public boolean istFrei() {
		return (this.flug == null);
	}
	
	public Flugzeug getFlugzeug() {
		if (this.flug == null) {
			return null;
		}
		return flug.getFlugzeug();
	}

	public void landen(Flug flug) {
		this.flug = flug;
	}
	
	public void starten() {
		this.flug = null;
	}

	public int getNummer() {
		return nummer;
	}

	public void setNummer(int nummer) {
		this.nummer = nummer;
	}

	public Flug getFlug() {
		return flug;
	}

	public void setFlug(Flug flug) {
		this.flug = flug;
	}

}