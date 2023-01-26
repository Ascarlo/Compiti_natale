
public class Indovina {
		
	private String Parola;
	private int Tentativi;
	private int Sbagliato;
	private String DaTrovare;
		
	public Indovina(String parola) {
			
		this.Parola = parola;
		this.Tentativi = 0;
		this.Sbagliato = 0;
		
		for(int i = 0; i < parola.length(); i++) {
				
			DaTrovare = DaTrovare + "?";
		}
	}
	
	public String get_ParolaScoperta(){
		return DaTrovare;
	}


	public int get_NumeroTentativi() {
	return Tentativi;
	}
	
	
	
	public void Cerca(char x) {
			
		System.out.println(DaTrovare);
			
		for(int i = 0; i < Parola.length(); i++) {
				
			if(Parola.charAt(i) == x) {
				
				DaTrovare.replace(DaTrovare.charAt(i), x);
			}
			
			else {
				
				Sbagliato++;
			}
		}
		
		Tentativi++;
	}
	
	public boolean Indovinato() {
			
		if(DaTrovare.equals(Parola)) {
				
			return false;
		}
		else {
			
			return true;
		}

	}
	
	
	public void to_String() {
			
		System.out.println("La parola da scoprire era " + Parola + " , dopo " + Tentativi + " tentativi di cui " + Sbagliato + " incorretti hai indovinato");
	}
}