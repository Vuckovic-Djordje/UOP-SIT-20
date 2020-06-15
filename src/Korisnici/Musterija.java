package Korisnici;
import OsnovnaKlasa.Osoba;

public class Musterija extends Osoba {
	private int brojBodova;
	public Musterija() {
		super();
		this.brojBodova=0;
	}
	public Musterija(String ime,String prezime,String JMBG,String pol,String brojTelefona,String adresa,String korisnickoIme,String lozinka,int brojBodova) {
		this.brojBodova=brojBodova;
	}
	public int getBrojBodova() {
		return brojBodova;
	}

	public void setBrojBodova(int brojBodova) {
		this.brojBodova = brojBodova;

	}
	

}
