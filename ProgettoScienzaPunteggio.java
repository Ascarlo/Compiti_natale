public class ProgettoScienzaPunteggio {
	
	private String NomeProgetto;
	private String ID;
	private String Nome;
	private int Punteggio_Abilita;
	private int Punteggio_Scientifico;
	private int Punteggio_Completezza;
	private int Punteggio_Creativita;
	private int Punteggio_Chiarezza;
	
	
	//costruttore della classe 
	public ProgettoScienzaPunteggio (String NomeProgetto, String ID, String Nome,
			int Punteggio_Abilita, int Punteggio_Scientifico, int Punteggio_Completezza,
			int Punteggio_Creativita, int Punteggio_Chiarezza) {
		
		this.NomeProgetto=NomeProgetto;
		this.ID=ID;
		this.Nome=Nome;
		this.Punteggio_Abilita=Punteggio_Abilita;
		this.Punteggio_Scientifico=Punteggio_Scientifico;
		this.Punteggio_Completezza=Punteggio_Completezza;
		this.Punteggio_Creativita=Punteggio_Creativita;
		this.Punteggio_Chiarezza=Punteggio_Chiarezza;
	}

	//metodi get
	public String getNomeProgetto() {
		return NomeProgetto;
	}

	public String getID() {
		return ID;
	}

	public String getNome() {
		return Nome;
	}

	public int getPunteggio_Abilita() {
		return Punteggio_Abilita;
	}

	public int getPunteggio_Scientifico() {
		return Punteggio_Scientifico;
	}

	public int getPunteggio_Completezza() {
		return Punteggio_Completezza;
	}

	public int getPunteggio_Creativita() {
		return Punteggio_Creativita;
	}

	public int getPunteggio_Chiarezza() {
		return Punteggio_Chiarezza;
	}
	
	
	//metodo per calcolare il punteggio totale del progetto
	public double Punteggio_Totale (int Punteggio_Abilita, int Punteggio_Scientifico, int Punteggio_Completezza,
			int Punteggio_Creativita, int Punteggio_Chiarezza) {
		
		double punteggio_tot =  Punteggio_Abilita + Punteggio_Scientifico + Punteggio_Completezza + Punteggio_Creativita + Punteggio_Chiarezza;
		return punteggio_tot;
	}
	
	
	
}