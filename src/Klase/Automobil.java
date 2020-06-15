package Klase;
import Korisnici.Musterija;
import java.util.ArrayList;
public class Automobil {
	int id;
	Musterija vlasnik;
	String marka;
	String model;
	int godinaProizvodnje;
	int zapreminaMotora;
	int snagaMotora;
	String vrstaGoriva;
	ArrayList <Deo> sviDelovi;
	public Automobil() 
	{
		this.id=0;
		this.vlasnik=new Musterija();
		this.marka="";
		this.model="";
		this.godinaProizvodnje=0;
		this.zapreminaMotora=0;
		this.snagaMotora=0;
		this.vrstaGoriva="";
		this.sviDelovi=null;
		}
	public Automobil(int id,Musterija vlasnik,String marka,String model,int godinaProizvodnje,
			int zapreminaMotora,int snagaMotora,String vrstaGoriva,ArrayList <Deo> sviDelovi) 
	{
		super();
		this.id=id;
		this.vlasnik=vlasnik;
		this.marka=marka;
		this.model=model;
		this.godinaProizvodnje=godinaProizvodnje;
		this.zapreminaMotora=zapreminaMotora;
		this.snagaMotora=snagaMotora;
		this.vrstaGoriva=vrstaGoriva;
		this.sviDelovi=sviDelovi;
		}
	public Musterija getVlasnik() {
		return vlasnik;
	}

	public void setVlasnik(Musterija vlasnik) {
		this.vlasnik = vlasnik;
	}
	public int getGodinaProizvodnje() {
		return godinaProizvodnje;
	}

	public void setGodinaProizvodnje(int godinaProizvodnje) {
		this.godinaProizvodnje = godinaProizvodnje;
	}
	public int getZapreminaMotora() {
		return zapreminaMotora;
	}

	public void setZapreminaMotora(int zapreminaMotora) {
		this.zapreminaMotora = zapreminaMotora;
	}
	public int getSnagaMotora() {
		return snagaMotora;
	}

	public void setSnagaMotora(int snagaMotora) {
		this.snagaMotora = snagaMotora;
	}
	public String getVrstaGoriva() {
		return vrstaGoriva;
	}

	public void setVrstaGoriva(String vrstaGoriva) {
		this.vrstaGoriva = vrstaGoriva;
	}
	public ArrayList<Deo> getSvoDelovi() {
		return sviDelovi;
	}

	public void setSviDelovi(ArrayList<Deo> sviDelovi) {
		this.sviDelovi = sviDelovi;
	}
	
	

}
