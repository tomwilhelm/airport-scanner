package ch.modul226.airport.model;

public class Flug {
	
	private String nummer;
	private String startzeit;
	private String landezeit;
	private Flugzeug flugzeug = new Flugzeug();
	
	public boolean istNational() {
		return (nummer.startsWith("LX"));
	}

	
	public Flugzeug getFlugzeug() {
		return flugzeug;
	}

	public String getNummer() {
		return nummer;
	}

	public void setNummer(String nummer) {
		this.nummer = nummer;
	}

	public String getStartzeit() {
		return startzeit;
	}

	public void setStartzeit(String startzeit) {
		this.startzeit = startzeit;
	}

	public String getLandezeit() {
		return landezeit;
	}

	public void setLandezeit(String landezeit) {
		this.landezeit = landezeit;
	}

	public void setFlugzeug(Flugzeug flugzeug) {
		this.flugzeug = flugzeug;
	}

}