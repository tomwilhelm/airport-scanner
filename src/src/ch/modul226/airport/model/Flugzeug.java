package ch.modul226.airport.model;

public class Flugzeug {
	
	private int typ;
	private String nachtankzeit;
	private int kapazitaet;
	private boolean istGrossraum;
	
	
	public boolean istGrossraum() {
		return istGrossraum;
	}
	public void setIstGrossraum(boolean istGrossraum) {
		this.istGrossraum = istGrossraum;
	}
	public int getTyp() {
		return typ;
	}
	public void setTyp(int typ) {
		this.typ = typ;
	}
	public String getNachtankzeit() {
		return nachtankzeit;
	}
	public void setNachtankzeit(String nachtankzeit) {
		this.nachtankzeit = nachtankzeit;
	}
	public int getKapazitaet() {
		return kapazitaet;
	}
	public void setKapazitaet(int kapazitaet) {
		this.kapazitaet = kapazitaet;
	}

}