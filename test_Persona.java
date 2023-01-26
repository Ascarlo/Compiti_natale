import java.util.Scanner;
public class test_Persona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner x = new Scanner (System.in);
		Scanner y = new Scanner (System.in);
		
		String rifai;
		do {
		
			System.out.print("inserire il nome della prima persona: ");
			String nome1 = y.nextLine();
			
			System.out.print("inserire l'età della prima persona: ");
			int eta1 = x.nextInt();
			
			
			Persona oggetto1 = new Persona (nome1, eta1);
			
			System.out.print("inserire il nome della seconda persona: ");
			String nome2 = y.nextLine();
			
			System.out.print("inserire l'età della seconda persona: ");
			int eta2 = x.nextInt();
			
			
			Persona oggetto2 = new Persona (nome2, eta2);
			
			System.out.println("\n");
			
			//richiamo dei metodi di stampa
			oggetto1.similitudini(oggetto1, oggetto2);
			oggetto1.anzianità(oggetto1, oggetto2);

			System.out.print("vuoi rifare? ");
			rifai = y.nextLine();
			
		}while(rifai.equals("si"));
	}
}