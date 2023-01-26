import java.util.Scanner;
public class test_Punteggio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner x = new Scanner (System.in);
		Scanner y = new Scanner (System.in);
		
		String rifai;
		do {
			
			//inserimento dei dati
			System.out.print("descrizione dell'oggetto da valutare: ");
			String descrizione = y.nextLine();
			
			System.out.print("punteggio massimo: ");
			int punteggio_max = y.nextInt();
			
			System.out.print("punteggio dato: ");
			double punteggio = x.nextDouble();
			
			//creazione dell'oggetto della classe
			Punteggio oggetto1 = new Punteggio (descrizione, punteggio_max, punteggio);
			
			//stampa del punteggio limitato a due decimali
			System.out.printf("\nvalutazione finale: %.2f" , oggetto1.getPunteggio());
			
			System.out.println("\n");
			System.out.print("vuoi rifare? ");
			rifai=y.nextLine();
		}while(rifai.equals("si"));
	}
}