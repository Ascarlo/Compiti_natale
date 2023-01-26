import java.util.Scanner;
public class test_indovina {
	
	public static void main(String[] args) {
			
		Scanner x = new Scanner(System.in);
			
		System.out.print("Inserisci la parola da indovinare: ");
		String incognita = x.next();
			
		Indovina oggetto1 = new Indovina(incognita);
			
		do {
			System.out.println("Scegli una lettera");
			String par = x.next();
				
			char c = par.charAt(0);
				
			oggetto1.Cerca(c);
				
			oggetto1.get_ParolaScoperta();
				
		}while(oggetto1.Indovinato());
			
		oggetto1.to_String();
	}

}