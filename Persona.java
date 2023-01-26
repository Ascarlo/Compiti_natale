
public class Persona {

	//attributi
	private String Nome;
	private int Eta;
	
	
	//costruttore
	public Persona (String Nome, int Eta) {
		
		this.Eta=Eta;
		this.Nome=Nome;
	}

	//metodi get
	public String getNome() {
		return Nome;
	}

	public int getEta() {
		return Eta;
	}
	
	
	//metodo che stampa le similitudini che i due oggetti hanno
	public void similitudini (Persona oggetto1, Persona oggetto2) {
		
		if (oggetto1.Eta == oggetto2.Eta && oggetto1.Nome.equals(oggetto2.Nome)) {
			
			System.out.println("le due persone sono uguali in tutto");

		}
		
		else if (oggetto1.Eta == oggetto2.Eta) {
			
			System.out.println("le due persone hanno la stessa et�");
		}
		
		else if (oggetto1.Nome.equals(oggetto2.Nome)) {
			
			System.out.println("le due persone hanno lo stesso nome");
		}
		
		else {
			
			System.out.println("le due persone sono diverse in tutto");
		}
	}
	
	
	//metodo ceh stampa se oggetto1 � pi� vecchio di oggetto2 o viceversa
	public void anzianit� (Persona oggetto1, Persona oggetto2) {
		
		if ( oggetto1.Eta > oggetto2.Eta ) {
			
			System.out.println(oggetto1.Nome + " � pi� vecchio di " + oggetto2.Nome);
		}
		
		else if (oggetto1.Eta < oggetto2.Eta) {
			
			System.out.println(oggetto1.Nome + " � pi� giovane di " + oggetto2.Nome);

		}
		
		else {
			
			System.out.println(oggetto1.Nome + " ha la stessa et� di " + oggetto2.Nome);

		}
	}
}
