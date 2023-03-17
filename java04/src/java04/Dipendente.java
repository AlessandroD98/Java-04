package java04;

public class Dipendente {

	static double stipendioBase = 1000;
	
	private String matricola;
	private double stipendio;
	private double importoOrarioStraordinario;
	private Livello Liv;
	private Dipartimento Dip;
	
	public Dipendente(String matricola, Dipartimento Dip) {
		this.matricola = matricola;
		this.stipendio = stipendioBase;
		this.importoOrarioStraordinario = 30;
		this.Liv = Livello.OPERAIO;
		this.Dip = Dip;
	}
	
	public Dipendente(String matricola, Livello Liv, Dipartimento Dip) {
		this(matricola, Dip);
		this.Liv = Liv;
		
	}
	
	public Dipendente(String matricola, double importoOrarioStraordinario, Livello Liv, Dipartimento Dip) {
		this(matricola, Liv, Dip);
		this.importoOrarioStraordinario = importoOrarioStraordinario;
		
		}
	
	
	public double setStipendio(Dipendente d) {
		return this.stipendio = calcolaPaga(d);
	}
	
	public double getStipendio() {
		return stipendio;
	}
	
	public String getMatricola() {
		return matricola;
	}
	
	public Object setDipartimento(Dipartimento Dip) {
		return this.Dip = Dip;
	}
	
	public Livello promuovi (Dipendente dipendenteCorrente) {
		if(dipendenteCorrente.Liv == Livello.OPERAIO) {
			 Liv = Livello.IMPIEGATO;
		}else if (dipendenteCorrente.Liv == Livello.IMPIEGATO) {
			 Liv = Livello.QUADRO;
		}else if (dipendenteCorrente.Liv == Livello.QUADRO) {
			 Liv = Livello.DIRIGENTE;
		}else if (dipendenteCorrente.Liv == Livello.DIRIGENTE) {
			System.out.println("Hai gia raggiunto il massimo livello");
		}
		stampaDatiDipendente(dipendenteCorrente, true);
		 return Liv;
	}
	
	
	public void stampaDatiDipendente(Dipendente d) {
		d.stipendio = calcolaPaga(d);
		System.out.println(d.toString());
		
	}
	
	public void stampaDatiDipendente(Dipendente d, Boolean b) {
		d.stipendio = calcolaPaga(d);
		System.out.println("Congratulazioni sei stato promosso: " + "\n" + d.toString());
		
	}
	
	
	
	public  String toString() {
		return " Dipendete n.matricola: " + matricola + "\n" + " Livello: " + Liv + "\n" + " Dipartimento: " + Dip + "\n" + " Stipendio: " + stipendio + "€" + "\n";
 	}
	
	public double calcolaPaga(Dipendente d) {
		if(d.Liv == Livello.IMPIEGATO) {
			return Dipendente.stipendioBase * 1.2;
		} else if (d.Liv == Livello.QUADRO) {
			return Dipendente.stipendioBase * 1.5;
		} else if (d.Liv == Livello.DIRIGENTE) {
			return Dipendente.stipendioBase * 2;
		} else
			return Dipendente.stipendioBase;
		
	}
	
	public double calcolaPaga(Dipendente d, int straordinari ) {
		if(this.Liv == Livello.IMPIEGATO) {
			return Dipendente.stipendioBase * 1.2 + straordinari *d.importoOrarioStraordinario;
		} else if (this.Liv == Livello.QUADRO) {
			return Dipendente.stipendioBase * 1.5 + straordinari * d.importoOrarioStraordinario;
		} else if (this.Liv == Livello.DIRIGENTE) {
			return Dipendente.stipendioBase * 2 + straordinari * d.importoOrarioStraordinario;
		} else
			return Dipendente.stipendioBase;
		
	}
	
}
