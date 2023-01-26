import java.util.Scanner;
public class test_IndirizzoPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner y = new Scanner (System.in);
		
		String rifai;
		do {
			
			//inserimento dei dati
			System.out.print("inserire nome: ");
			String nome = y.nextLine();
			
			System.out.print("inserire cognome: ");
			String cognome = y.nextLine();
			
			System.out.print("inserire mail: ");
			String e_mail = y.nextLine();
			
			System.out.print("inserire telefono: ");
			String telefono = y.nextLine();
			
			//creazione oggetto della classe
			IndirizzoPersona oggetto1 = new IndirizzoPersona (nome, cognome, e_mail, telefono);
			
			System.out.print("\n");
			
			//stampa delle variabili
			System.out.println("Nome: " + oggetto1.getNome());
			System.out.println("Cognome: " + oggetto1.getCognome());
			System.out.println("E-mail: " + oggetto1.getE_mail());
			System.out.println("Telefono: " + oggetto1.getTelefono());
			
			System.out.print("\n");
			
			//chiedo all'utente se desisera cambiare mail e telefono
			System.out.println("vuoi modificare i parametri? ");
			if (y.nextLine().equals("si")) {
				
				//modifica dei parametri
				System.out.print("modifica dell'e-mail: ");
				oggetto1.setE_mail(y.nextLine());
				
				System.out.print("modifica del numero di telefono: ");
				oggetto1.setTelefono(y.nextLine());
				
				//stampa delle variabili modificate
				System.out.println("Nome: " + oggetto1.getNome());
				System.out.println("Cognome: " + oggetto1.getCognome());
				System.out.println("E-mail modificata: " + oggetto1.getE_mail());
				System.out.println("Telefono modificato: " + oggetto1.getTelefono());
			}
			
			System.out.print("vuoi rifare? ");
			rifai=y.nextLine();
		}while(rifai.equals("si"));
	}
}