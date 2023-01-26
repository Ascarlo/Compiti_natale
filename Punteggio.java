public class Punteggio {
	
	//attributi della classe
	private String Descrizione;
	private int Punteggio_max;
	private double Punteggio;
	
	//costruttore della classe
	public Punteggio ( String Descrizione, int Punteggio_max, double Punteggio ) {
		
		this.Descrizione=Descrizione;
		this.Punteggio_max=Punteggio_max;
		this.Punteggio=Punteggio;
	}

	
	//metodi get e set
	public int getPunteggio_max() {
		return Punteggio_max;
	}

	
	//classe per restituire una valutazione con un formato stampabile
	public double getPunteggio() {
		
		double punteggio_stampabile = (Punteggio / Punteggio_max) * 10;
		return punteggio_stampabile;
	}
}