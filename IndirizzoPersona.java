public class IndirizzoPersona {
	
	//attributi della classe
	private String Nome;
	private String Cognome;
	private String E_mail;
	private String Telefono;
	
	//costruttore
	public IndirizzoPersona ( String Nome, String Cognome, String E_mail, String Telefono ) {
		
		this.Nome=Nome;
		this.Cognome=Cognome;
		this.E_mail=E_mail;
		this.Telefono=Telefono;
	}

	
	//metodi get e set
	public String getNome() {
		return Nome;
	}

	public String getCognome() {
		return Cognome;
	}

	public String getE_mail() {
		return E_mail;
	}

	public void setE_mail(String e_mail) {
		E_mail = e_mail;
	}

	public String getTelefono() {
		return Telefono;
	}

	public void setTelefono(String telefono) {
		Telefono = telefono;
	}
}