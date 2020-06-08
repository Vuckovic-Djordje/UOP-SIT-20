package Korisnici;
import OsnovnaKlasa.Osoba;
public class Administrator extends Osoba {
	
	private int plata;
	
	public Administrator() {
		super();
		this.plata=0;
	}
	public Administrator(String ime,String prezime,String JMBG,String pol,String brojTelefona,String adresa,String korisnickoIme,String lozinka,int plata) {
		this.plata=plata;
	}
	public int getPlata() {
		return plata;
	}

	public void setPlata(int plata) {
		this.plata = plata;

	}
}