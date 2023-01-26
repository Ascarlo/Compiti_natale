import java.util.Scanner;
public class test_ProgettoScienzaPunteggio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner x = new Scanner (System.in);
		Scanner y = new Scanner (System.in);
		
		//ciclo do while
		String rifai;
		do {
			
			//questa variabile rappresenta il punteggio massimo del progetto
			int punteggio_tot = 85;
			
			//input variabili
			System.out.print("nome del progetto: ");
			String Nome_Progetto = y.nextLine();
			
			System.out.print("identificativo del pregetto: ");
			String ID = y.nextLine();
			
			System.out.print("nome del progettista: ");
			String Nome = y.nextLine();
			
			System.out.print("punteggio abilità creativa, massimo 30 pt: ");
			int abilita = x.nextInt();
			
			System.out.print("punteggio scientifico, massimo 15 pt: ");
			int scienze = x.nextInt();
			
			System.out.print("punteggio completezza, massimo 15 pt: ");
			int completezza = x.nextInt();
			
			System.out.print("punteggio creatività, massimo 15 pt: ");
			int creativita = x.nextInt();
			
			System.out.print("punteggio chiarezza, massimo 15 pt: ");
			int chiarezza = x.nextInt();
			
			//oggetto della classe ProgettoScienzaPunteggio
			ProgettoScienzaPunteggio oggetto1 = new ProgettoScienzaPunteggio (Nome_Progetto, ID, Nome, abilita, scienze, completezza,
																			  creativita, chiarezza);
			
			//calcolo del punteggio totale del progetto
			double punteggio = oggetto1.Punteggio_Totale(abilita, scienze, completezza, creativita, chiarezza);
			
			//se l'utente ha inserito un punteggio troppo grande ai punteggi allora verrà rieseguito l'esercizio
			if (punteggio <= 85) {
				
				
				//stampa del punteggio totale
				System.out.println("\npunteggio totale: " + oggetto1.Punteggio_Totale(abilita, scienze, completezza, creativita, chiarezza) +
									" / " + punteggio_tot);
				
				
				//oggetto numero 2 della classe Punteggio per calcolare il punteggio stampabile
				Punteggio oggetto2 = new Punteggio (Nome_Progetto, punteggio_tot, punteggio);
				
				//stampa della valutazione finale
				System.out.printf("\nvalutazione finale: %.2f" , oggetto2.getPunteggio());
				
			}
			
			else {
				System.out.println("\nhai inserito dei valori sbagliati");
			}
			System.out.println("\n");
			System.out.print("vuoi rifare? ");
			rifai=y.nextLine();
		}while(rifai.equals("si"));
	}
}