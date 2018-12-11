package ch.modul226.airport.model;

public class InternationalesGate extends Gate {

	public static final int KLEIN = 0;
	public static final int GROSS = 1;
	
	private int groesse;
	
	public InternationalesGate(int nummer, int groesse) {
		super(nummer);
		this.groesse = groesse;
	}

	public int getGroesse() {
		return groesse;
	}

	public void setGroesse(int groesse) {
		this.groesse = groesse;
	}
	
}
