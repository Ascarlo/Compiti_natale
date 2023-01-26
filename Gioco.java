public class Gioco {

	String Parola;
	
	public Gioco (String parola) {
		
		this.Parola=parola;
	}
	
	
	/*public String indovina(char c) {
			
		for (int i = 0; i < Parola.length(); i++) {
			
			if (Parola.charAt(i) == c) {
				
				
			}
		}
	}*/
	
	public String getParolaDaIndovinare() {
		
		return Parola;
	}
	
	/*public String getParolaScoperta() {
		
		for (int i = 0; i < Parola.length(); i++) {
			
			System.out.print('?');
		}
	}
	
	public int getNumeroTentativi() {
		
		
	}
	
	public boolean isIndovinata() {
		
		
	}*/
}