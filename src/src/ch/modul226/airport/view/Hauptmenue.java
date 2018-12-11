package ch.modul226.airport.view;

import untils.ConsoleReader;
import ch.modul226.airport.model.*;

public class Hauptmenue {
	
	private ConsoleReader cr;
	private Flughafen flughafen;
	
	public Hauptmenue() {
		cr = new ConsoleReader();
		flughafen = new Flughafen();
	}
	
	private void anzeigen() {
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("Airport Scheduler Hauptmenü");
		System.out.println("===========================");
		System.out.println();
		System.out.println("1 Landen");
		System.out.println("2 Starten");
		System.out.println("3 Gatedaten");
		System.out.println();
		System.out.println("4 Ende");
	}
	
	public boolean aktion() {
		while (true) {
			anzeigen();
			
			int eingabe = cr.getInt("Eingabe");
			switch (eingabe) {
			case 1:
				landen();
				return true;
			case 2:
				starten();
				return true;
			case 3:
				gateDatenAnzeigen();
				return true;
			case 4:
				return false;
			default:
				System.out.println("Ungueltige Wahl");
			}
		}
	}
	
	private void landen() {
		System.out.println("\n\nlanden...\n\n");
		Flug flug = flugDatenBeschaffung();
		int gateNummer = flughafen.landen(flug);
		if (gateNummer >= 0) {
			System.out.println("Flugzeug ist an Gate " + gateNummer + " gelandet");
		} else {
			System.out.println("Es wurde kein freies Gate für das Flugzeug gefunden");
		}
	}
	
	private void starten () {
		System.out.println("starten...");
	}
	
	private void gateDatenAnzeigen() {
		System.out.println("Gate Daten anzeigen...");
	}
	
	private Flug flugDatenBeschaffung() {
		Flug flug = new Flug();
		System.out.println();
		System.out.println();
		System.out.println("Bitte Flugdaten eingeben");
		System.out.println("------------------------");
		flug.setNummer(cr.getInput("Flugnummer"));
		flug.setStartzeit(cr.getInput("Startezeit"));
		flug.setLandezeit(cr.getInput("Landezeit"));
		
		flug.setFlugzeug(flugzeugDatenBeschaffung());
		return flug;
	}
	
	private Flugzeug flugzeugDatenBeschaffung() {
		Flugzeug flugzeug = new Flugzeug();
		flugzeug.setTyp(cr.getInt("Flugzeugtyp"));
		flugzeug.setKapazitaet(cr.getInt("Kapazität"));
		flugzeug.setNachtankzeit(cr.getInput("Nachtank Zeit"));
		return flugzeug;
	}
	
	public static void main(String[] args) {

		Hauptmenue menue = new Hauptmenue();
		while (menue.aktion()) {
			
		}		
		
		System.out.println();
		System.out.println("Besten Dank und auf Wiedersehen");
	}

}
