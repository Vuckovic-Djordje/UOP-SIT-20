package OsnovnaKlasa;

public abstract class Osoba {
		public enum Pol {
		MUSKI,
		ZENSKI
		}
		static protected int ID=0;
		protected int id;
		protected String ime;
		protected String prezime;
		protected String JMBG;
		protected Pol pol;
		protected String brojTelefona;
		protected String adresa;
		protected String korisnickoIme;
		protected String lozinka;
		protected boolean obrisan;
	
	public Osoba() {
		
		this.id=Osoba.ID++;
		this.ime = "";
		this.prezime = "";
		this.JMBG = "";
		this.pol = Pol.MUSKI;
		this.brojTelefona = "";
		this.adresa = "";
		this.korisnickoIme = "";
		this.lozinka = "";
		this.obrisan=false;
	}
	public Osoba(String ime,String prezime,String JMBG,Pol pol,String brojTelefona,String adresa,String korisnickoIme,String lozinka,boolean obrisan) {
		
		this.id=Osoba.ID++;
		this.ime = ime;
		this.prezime = prezime;
		this.JMBG = JMBG;
		this.pol = pol;
		this.brojTelefona = brojTelefona;
		this.adresa = adresa;
		this.korisnickoIme = korisnickoIme;
		this.lozinka = lozinka;
		this.obrisan=obrisan;
	}
	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	
	public String getJMBG() {
		return JMBG;
	}

	public void setJMBG(String JMBG) {
		this.JMBG = JMBG;
	}
	public Pol getPol() {
		return pol;
	}

	public void setPol(Pol pol) {
		this.pol = pol;
	}
	public String getBrojTelefona() {
		return brojTelefona;
	}

	public void setBrojTelefona(String brojTelefona) {
		this.brojTelefona = brojTelefona;
	}
	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}
	public String getKorisnickoIme() {
		return korisnickoIme;
	}

	public void setKorisnickoIme(String korisnickoIme) {
		this.korisnickoIme = korisnickoIme;
	}
	public String getLozinka() {
		return lozinka;
	}

	public void setLozinka(String lozinka) {
		this.lozinka = lozinka;
	}
	public boolean isObrisan() {
		return obrisan;
	}

	public void setObrisan(boolean obrisan) {
		this.obrisan = obrisan;
	}
	

	

}
