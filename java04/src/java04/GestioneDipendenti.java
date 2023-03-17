package java04;

public  class GestioneDipendenti {
	

	public static void main(String[] args) {

	Dipendente d1 = new Dipendente("AD99", Dipartimento.PRODUZIONE);
	Dipendente d2 = new Dipendente("AD97", Dipartimento.PRODUZIONE);
	Dipendente d3 = new Dipendente("AD96", Livello.IMPIEGATO, Dipartimento.AMMINISTAZIONE);
	Dipendente d4 = new Dipendente("AD95", Livello.DIRIGENTE, Dipartimento.VENDITE);
	
	}
}
