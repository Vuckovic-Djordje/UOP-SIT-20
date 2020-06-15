package Klase;
import Klase.Deo;
import Korisnici.Musterija;
import Korisnici.Serviser;
import Klase.Automobil;
import java.util.ArrayList;
import java.time.LocalDateTime;
public class Servis {
	int id;
	Serviser serviser;
	Automobil automobil;
	LocalDateTime termin;
	String status;
	String opis;
	ArrayList <Deo> sviDelovi;
	public Servis() 
	{
		this.id=0;
		this.serviser=null;
		this.automobil=null;
		this.termin=null;
		this.status="";
		this.opis="";
		this.sviDelovi=null;	
	}
	public Servis(int id,Serviser serviser,Automobil automobil,LocalDateTime termin,String status,String opis,ArrayList <Deo> sviDelovi)
	{
		this.id=id;
		this.serviser=serviser;
		this.automobil=automobil;
		this.termin=termin;
		this.status="Zakazan";
		this.opis=opis;
		this.sviDelovi=sviDelovi;		
	}
	
	public Serviser getServiser() {
		return serviser;
	}

	public void setServiser(Serviser serviser) {
		this.serviser = serviser;
	}
	public Automobil getAutomobil() {
		return automobil;
	}

	public void setAutomobil(Automobil automobil) {
		this.automobil=automobil;
	}
	public LocalDateTime getTermin() {
		return termin;
	}

	public void setTermin(LocalDateTime termin) {
		this.termin = termin;
	}
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getOpis() {
		return opis;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}
	public ArrayList<Deo> getSvoDelovi() {
		return sviDelovi;
	}

	public void setSviDelovi(ArrayList<Deo> sviDelovi) {
		this.sviDelovi = sviDelovi;
	}

}
