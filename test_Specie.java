import java.util.Scanner;
public class test_Specie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner x = new Scanner (System.in);
		Scanner y = new Scanner (System.in);
		
		String rifai;
		do {
			
			Specie oggetto1 = new Specie ();
			
			//inserimento dei valori nell'oggetto
			oggetto1.leggiInput();
			
			//stampa del numero della popolazione dopo gli anni inseriti in input
			System.out.print("quanti anni vuoi che passino? ");
			int tempo = x.nextInt();
			int aumento = oggetto1.prediciPopolazione(tempo);
			
			System.out.println("la specie " + oggetto1.getNome() + " dopo " + tempo + " anni avrà " + aumento + " individuali");
			
			Specie oggetto2 = new Specie ();
			
			System.out.print("\ninserire il nome della seconda specie: ");
			String nome = y.nextLine();
			
			System.out.print("inserire la popolazione attuale della seconda specie: ");
			int popolazione = x.nextInt();
			
			System.out.print("inserire la percentuale del tasso di crescita della seconda specie: ");
			double crescita = x.nextDouble();
			
			oggetto2.setSpecie(nome, popolazione, crescita);
			
			/*controllo se la popolazione di oggetto1 è minore di quella di oggetto 2 e il tasso di crescita di oggetto1 è maggiore
			di oggetto2, così se il tasso di crescita è minore il ciclo while di avanzamento_specie1 non verrà eseguito all'infinito*/
			if (oggetto2.getPopolazione() > oggetto1.getPopolazione() && oggetto1.getTassoCrescita() > oggetto2.getTassoCrescita()) {

				//richiamo del metodo
				oggetto1.avanzamento_specie1(oggetto1, oggetto2);
			}
			
			/*se il tasso di crescita e la popolazaione di oggetto1 è minore di quella di oggetto2
			allora la popolazione di oggetto1 non supererà mai quella di oggetto2*/
			else if (oggetto2.getTassoCrescita() > oggetto1.getTassoCrescita()) {
				
				System.out.println(oggetto1.getNome() + " non supererà mai " + oggetto2.getNome());
			}
			
			/*controllo se la popolazione di oggetto2 è minore di quella di oggetto1 e il tasso di crescita di oggetto2 è maggiore
			di oggetto1, così se il tasso di crescita è minore il ciclo while di avanzamento_specie2 non verrà eseguito all'infinito*/
			if (oggetto1.getPopolazione() > oggetto2.getPopolazione() && oggetto2.getTassoCrescita() > oggetto1.getTassoCrescita()) {
				
				//richiamo del metodo
				oggetto2.avanzamento_specie2(oggetto1, oggetto2);

			}
			
			/*se il tasso di crescita e la popolazaione di oggetto2 è minore di quella di oggetto1
			allora la popolazione di oggetto2 non supererà mai quella di oggetto1*/
			else if (oggetto2.getTassoCrescita() > oggetto1.getTassoCrescita()) {
				
				System.out.println(oggetto1.getNome() + " non supererà mai " + oggetto2.getNome());

			}
			
			
			System.out.print("vuoi rifare? ");
			rifai = y.nextLine();
			
		}while(rifai.equals("si"));
	}
}