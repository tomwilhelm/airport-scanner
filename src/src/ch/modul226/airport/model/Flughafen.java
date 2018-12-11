package ch.modul226.airport.model;

public class Flughafen {
	
	private Gate[] gates;
	private String name;
	
	public Flughafen() {
		this.name = "JFK";
		this.gates = new Gate[10];
		
		//fünf nationale gates
		gates[0] = new NationalesGate(1);
		gates[1] = new NationalesGate(2);
		gates[2] = new NationalesGate(3);
		gates[3] = new NationalesGate(4);
		gates[4] = new NationalesGate(5);
		
		//ein kleines internatonales gate
		gates[5] = new InternationalesGate(6, InternationalesGate.KLEIN);
		
		//vier grosse internationale gates
		gates[6] = new InternationalesGate(7, InternationalesGate.GROSS);
		gates[6] = new InternationalesGate(8, InternationalesGate.GROSS);
		gates[6] = new InternationalesGate(9, InternationalesGate.GROSS);
		gates[6] = new InternationalesGate(10, InternationalesGate.GROSS);
	}
	
	public int landen(Flug flug) {
		for (short i = 0; i < 10; i++) {						//schleife über alle gates
			if (gates[i].istFrei()) {							//nur freie gates
				if (flug.istNational()) {						//nationaler flug passt immer
					gates[i].landen(flug);
					return i + 1;
				}
				else {											//internationaler FLug
					if (flug.getFlugzeug().istGrossraum()) {	//grossraumflugzeug
						if (gates[i] instanceof InternationalesGate && ((InternationalesGate )gates[i]).getGroesse() == InternationalesGate.GROSS) {
							gates[i].landen(flug);
							return i + 1;						//gate ist gross->OK, passt
						}
					}
					else {										//kain Grossraum
						gates[i].landen(flug);
						return i+1;								//gate passt immer
					}
				}
			}
		}
		return -1;
	}
	
	public void starten(int gateNummer) {
	}
	
	public void gateStatus(int gateNumber) {
	}

}