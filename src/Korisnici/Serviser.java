package Korisnici;
import OsnovnaKlasa.Osoba;
enum Specijalizacija{
	Automehanicar,Auto_elektricar,Vulkanizer,Limar
};
public class Serviser extends Osoba {
	private int plata;
	private Specijalizacija specijalizacija;
	public Serviser() {
		super();
		this.plata=0;
		this.specijalizacija=null;
	}
	public Serviser(String ime,String prezime,String JMBG,String pol,String brojTelefona,String adresa,String korisnickoIme,String lozinka,int plata,Specijalizacija specijalizacija) {
		this.plata=plata;
		this.specijalizacija=specijalizacija;
	}

	public int getPlata() {
		return plata;
	}

	public void setPlata(int plata) {
		this.plata = plata;

	}
	public Specijalizacija getSpecijalizacija() {
		return specijalizacija;
	}

	public void setSpecijalizacija(Specijalizacija specijalizacija) {
		this.specijalizacija = specijalizacija;

	}
}
