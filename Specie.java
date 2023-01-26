import java.util.Scanner;

public class Specie {
	
	private String nome;
	private int popolazione;
	private double tassoCrescita;
	
	//input degli attributi di una specie in input
	public void leggiInput() {
		
		Scanner tastiera = new Scanner(System.in);
		
		System.out.print("Qual'e' il nome della specie? ");
		nome = tastiera.nextLine();
		
		System.out.print("A quanto ammonta la popolazione? ");
		popolazione = tastiera.nextInt();
		
		System.out.print("Inserisci il tasso di crescita (% crescita per anno): ");
		tassoCrescita = tastiera.nextDouble();
	}
	
	//visualizzazione dei dati
	public void scriviOutput() {
		
		System.out.println("Nome = " + nome);
		System.out.println("Popolazione = " + popolazione);
		System.out.println("Tasso crescita = " + tassoCrescita + " %");
	}
	
	/*
	Restituisce una proiezione della popolazione dopo un numero
	specificato di anni
	*/
	public int prediciPopolazione(int anni) {
		
		int risultato = 0;
		double totalePopolazione = popolazione;
		int contatore = anni;
		
		while ((contatore > 0) && (totalePopolazione > 0)) {
			
			totalePopolazione = (totalePopolazione + (tassoCrescita / 100) * totalePopolazione);
			contatore--;
		}
		
		if (totalePopolazione > 0) {
			
			risultato = (int) totalePopolazione;
			return risultato;
		}
		
		return -1;
	}
	
	//assegnazione di dati ad una specie con nome, tasso di crescita e n popolazione
	public void setSpecie(String nuovoNome, int nuovaPopolazione, double nuovoTassoCrescita) {
		
		nome = nuovoNome;
		
		if (nuovaPopolazione >= 0) {
			
			popolazione = nuovaPopolazione;
		}
		
		else {
			
			System.out.println("ERRORE: si sta usando un numero negativo per la popolazione.");
			System.exit(0);
		}
		
		tassoCrescita = nuovoTassoCrescita;
	}
	
	//metodi get
	public String getNome() {
		
		return nome;
	}
	
	public int getPopolazione() {
		
		return popolazione;
	}
	
	public double getTassoCrescita() {
		
		return tassoCrescita;
	}
	
	
	
	public boolean equals(Specie altroOggetto) {
		
		return (nome.equalsIgnoreCase(altroOggetto.nome)) && (popolazione == altroOggetto.popolazione) && 
				(tassoCrescita == altroOggetto.tassoCrescita);
		
	}
	
	
	//questo metodo calcola in quanti anni il numero di specie di oggetto1 sarà maggiore di oggetto2
	public void avanzamento_specie1 (Specie oggetto1, Specie oggetto2) {
		
		boolean supero = false;
		int contatore = 0;
		
		//il ciclo si ripeterà finchè la popolazione di oggetto1 non sarà maggiore di della popolazione di oggetto2
		while (supero != true) {
			
			contatore ++;
			
			//aumento della popolazione in base al tasso di crescita annuo
			oggetto1.popolazione = (int) (oggetto1.popolazione + (oggetto1.tassoCrescita / 100) * oggetto1.popolazione);
			oggetto2.popolazione = (int) (oggetto2.popolazione + (oggetto2.tassoCrescita / 100) * oggetto2.popolazione);
			
			//il cilclo terminerà quando l'if verrà eseguito
			if (oggetto1.popolazione > oggetto2.popolazione) {
				
				System.out.println("la specie " + oggetto1.nome + " ha superato in popolazione la specie " + oggetto2.nome + 
									" in " + contatore + " anni");
				supero = true;
			}
		}
	}
	
	
	//questo metodo calcola in quanti anni il numero di specie di oggetto2 sarà maggiore di oggetto1
	public void avanzamento_specie2 (Specie oggetto1, Specie oggetto2) {
		
		boolean supero = false;
		int contatore = 0;
		
		//il ciclo si ripeterà finchè la popolazione di oggetto2 non sarà maggiore di della popolazione di oggetto1
		while (supero != true) {
			
			contatore++;
			
			//aumento della popolazione in base al tasso di crescita annuo
			oggetto1.popolazione = (int) (oggetto1.popolazione + (oggetto1.tassoCrescita / 100) * oggetto1.popolazione);
			oggetto2.popolazione = (int) (oggetto2.popolazione + (oggetto2.tassoCrescita / 100) * oggetto2.popolazione);

			//il cilclo terminerà quando l'if verrà eseguito
			if (oggetto1.popolazione < oggetto2.popolazione) {
				
				System.out.println("la specie " + oggetto2.nome + " ha superato in popolazione la specie " + oggetto1.nome + 
									" in " + contatore + " anni");
				supero = true;
			}
		}
	}
}