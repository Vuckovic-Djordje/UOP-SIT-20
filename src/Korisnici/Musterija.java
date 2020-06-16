package Korisnici;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

import OsnovnaKlasa.Osoba;


public class Musterija extends Osoba {
	private int brojBodova;
	private static ArrayList<Musterija> musterije;
	public Musterija() {
		super();
		this.brojBodova=0;
		ArrayList<Musterija> musterije=new ArrayList<Musterija>();
	}
	public Musterija(String ime,String prezime,String JMBG,Pol pol,String brojTelefona,String adresa,String korisnickoIme,String lozinka,int brojBodova) {
		this.brojBodova=brojBodova;
	}
	public int getBrojBodova() {
		return brojBodova;
	}

	public void setBrojBodova(int brojBodova) {
		this.brojBodova = brojBodova;

	}
	@Override
	public String toString() {
		return "Adinistrator \nIme: " + ime +
						"\nPrezime: " + prezime +
						"\nJMBG: " + JMBG +
						"\nBroj telefona: " + brojTelefona +
						"\nAdresa: " + adresa +
						"\nPol: " + pol +
						"\nBroj bodova: " + brojBodova +
						"\nKorisnicko Ime: " + korisnickoIme + 
						"\nLozinka: " + lozinka +
						"\nObrisan: " + obrisan;
	}
	public static void ucitajMusterije(String imeFajla) {
		try {
			File musterijaFile = new File("src/fajlovi/" + imeFajla);
			BufferedReader br = new BufferedReader(new FileReader(musterijaFile));
			String line = null;
			while ((line = br.readLine()) != null) {
				String[] split = line.split("\\|");
				String ime = split[0];
				String prezime = split[1];
				String JMBG=split[2];
				String brojTelefona=split[3];
				String adresa=split[4];
				int polInt = Integer.parseInt(split[5]);
				Pol pol = Pol.values()[polInt];
				int brojBodova=Integer.parseInt(split[6]);
				String korisnickoIme = split[7];
				String lozinka = split[8];
				boolean obrisan = Boolean.parseBoolean(split[9]);
				Musterija musterija = new Musterija(ime,prezime,JMBG,pol,brojTelefona,adresa,korisnickoIme,lozinka,brojBodova);
				musterije.add(musterija);
			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void snimiZaposlene(String imeFajla) {
		try {
			File musterijafilew = new File("src/fajlovi/" + imeFajla);
			BufferedWriter br = new BufferedWriter(new FileWriter(musterijafilew));
			String tekst = "";
			for (Musterija musterija : musterije) {
				tekst += musterija.getIme() + "|" + musterija.getPrezime() + "|"+musterija.getJMBG()+ "|" + "|" 
			+ musterija.getBrojTelefona() + "|" + musterija.getAdresa()+ "|" + musterija.getPol().ordinal() + "|" +musterija.getBrojBodova()+"|"
			+musterija.getKorisnickoIme() + "|" + musterija.getLozinka() + "|" + musterija.isObrisan() + "\n";
			}
			br.write(tekst);
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

}
