package main;
import gui.Prijava;
import Klase.*;
import Korisnici.*;
public class ServisAutomobila {
	public static String Administratori_fajl = "administratori.txt";
	public static String Serviseri_fajl = "serviseri.txt";
	public static String Musterije = "musterije.txt";

	public static void main(String[] args) {
		Administrator.ucitajAdministratore("administratori.txt");
		Serviser.ucitajServisere("serviseri.txt");
		Musterija.ucitajMusterije("musterije.txt");
		Prijava p=new Prijava();
		p.setVisible(true);
	}

}
