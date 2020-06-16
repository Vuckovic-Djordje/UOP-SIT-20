package Korisnici;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

import OsnovnaKlasa.Osoba;
public class Serviser extends Osoba {
	enum Specijalizacija{
		AUTOMEHANICAR,
		AUTO_ELEKTRICAR,
		VULKANIZER,
		LIMAR
	};
	private int plata;
	private Specijalizacija specijalizacija;
	private static ArrayList<Serviser> serviseri;
	public Serviser() {
		super();
		this.plata=0;
		this.specijalizacija=Specijalizacija.AUTOMEHANICAR;
		this.serviseri=new ArrayList<Serviser>();
	}
	public Serviser(String ime,String prezime,String JMBG,Pol pol,String brojTelefona,String adresa,String korisnickoIme,String lozinka,int plata,Specijalizacija specijalizacija) {
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
	@Override
	public String toString() {
		return "Adinistrator \nIme: " + ime +
						"\nPrezime: " + prezime +
						"\nJMBG: " + JMBG +
						"\nBroj telefona: " + brojTelefona +
						"\nAdresa: " + adresa +
						"\nPol: " + pol +
						"\nPlata: " + plata +
						"\nSpecijalizacija: " + specijalizacija +
						"\nKorisnicko Ime: " + korisnickoIme + 
						"\nLozinka: " + lozinka +
						"\nObrisan: " + obrisan;
	}
	public static void ucitajServisere(String imeFajla) {
		try {
			File serviserFile = new File("src/fajlovi/" + imeFajla);
			BufferedReader br = new BufferedReader(new FileReader(serviserFile));
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
				int spec = Integer.parseInt(split[7]);
				Specijalizacija specijalizacija = Specijalizacija.values()[spec];
				String korisnickoIme = split[8];
				String lozinka = split[9];
				boolean obrisan = Boolean.parseBoolean(split[10]);
				Serviser serviser = new Serviser(ime,prezime,JMBG,pol,brojTelefona,adresa,korisnickoIme,lozinka,plata,specijalizacija);
				serviseri.add(serviser);
			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void snimiZaposlene(String imeFajla) {
		try {
			File serviserfilew = new File("src/fajlovi/" + imeFajla);
			BufferedWriter br = new BufferedWriter(new FileWriter(serviserfilew));
			String tekst = "";
			for (Serviser serviser : serviseri) {
				tekst += serviser.getIme() + "|" + serviser.getPrezime() + "|"+serviser.getJMBG()+ "|" + "|" 
			+ serviser.getBrojTelefona() + "|" + serviser.getAdresa()+ "|" + serviser.getPol().ordinal() + "|" 
			+serviser.getPlata()+ "|" +serviser.getKorisnickoIme() + "|" + serviser.getLozinka() + "|" + serviser.isObrisan() + "\n";
			}
			br.write(tekst);
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
