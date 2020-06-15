package Klase;
import Klase.Automobil;
import Klase.Servis;
import java.util.ArrayList; 
public class Servisna_Knjizica {
	int id;
	Automobil automobil;
	ArrayList <Servis> sviServisi;
	public Servisna_Knjizica() 
	{
		this.id=0;
		this.automobil=null;
		this.sviServisi=null;
		
	}
	public Servisna_Knjizica(int id,Automobil automobil,ArrayList <Servis> sviServisi) 
	{
		this.id=id;
		this.automobil=automobil;
		this.sviServisi=sviServisi;
		
	}
	public Automobil getAutomobil() {
		return automobil;
	}

	public void setAutomobil(Automobil automobil) {
		this.automobil=automobil;
	}
	public ArrayList <Servis> getsviServisi() {
		return sviServisi;
	}

	public void setSviServisi(ArrayList <Servis> sviServisi) {
		this.sviServisi = sviServisi;
	}
	

}

