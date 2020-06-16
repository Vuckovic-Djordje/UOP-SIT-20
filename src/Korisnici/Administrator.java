package Korisnici;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

import OsnovnaKlasa.Osoba;
public class Administrator extends Osoba {
	
	private int plata;
	private static ArrayList<Administrator> administratori;
	public Administrator() {
		super();
		this.plata=0;
		this.administratori=new ArrayList<Administrator>();
	}
	public Administrator(String ime,String prezime,String JMBG,Pol pol,String brojTelefona,String adresa,String korisnickoIme,String lozinka,int plata) {
		this.plata=plata;
		this.administratori=new ArrayList<Administrator>();
		
	}
	public int getPlata() {
		return plata;
	}

	public void setPlata(int plata) {
		this.plata = plata;

	}
	public ArrayList<Administrator> getAdministratore() {
		return administratori;
	}

	public void dodajProdavca(Administrator administrator) {
		this.administratori.add(administrator);
	}
	public static void ucitajAdministratore(String imeFajla) {
		try {
			File adminFile = new File("src/fajlovi/" + imeFajla);
			BufferedReader br = new BufferedReader(new FileReader(adminFile));
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
				int plata=Integer.parseInt(split[6]);
				String korisnickoIme = split[7];
				String lozinka = split[8];
				boolean obrisan = Boolean.parseBoolean(split[9]);
				Administrator administrator = new Administrator(ime,prezime,JMBG,pol,brojTelefona,adresa,korisnickoIme,lozinka,plata) ;
				administratori.add(administrator);
			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	public String toString() {
		return "Administrator \nIme: " + ime +
						"\nPrezime: " + prezime +
						"\nJMBG: " + JMBG +
						"\nBroj telefona: " + brojTelefona +
						"\nAdresa: " + adresa +
						"\nPol: " + pol +
						"\nPlata: " + plata +
						"\nKorisnicko Ime: " + korisnickoIme + 
						"\nLozinka: " + lozinka +
						"\nObrisan: " + obrisan;
	}
	 

	public void snimiZaposlene(String imeFajla) {
		try {
			File adminfilew = new File("src/fajlovi/" + imeFajla);
			BufferedWriter br = new BufferedWriter(new FileWriter(adminfilew));
			String tekst = "";
			for (Administrator administrator : administratori) {
				tekst += administrator.getIme() + "|" + administrator.getPrezime() + "|" 
			+administrator.getJMBG()+ "|" + administrator.getBrojTelefona() + "|" + administrator.getAdresa()+ "|" 
			+ administrator.getPol().ordinal() +"|"+administrator.getPlata()+"|"+ administrator.getKorisnickoIme() + "|" 
			+ administrator.getLozinka() + "|" + administrator.isObrisan() + "\n";
			}
			br.write(tekst);
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}