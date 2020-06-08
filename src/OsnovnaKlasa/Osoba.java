package OsnovnaKlasa;

public abstract class Osoba {
		static protected int ID=0;
		protected int id;
		protected String ime;
		protected String prezime;
		protected String JMBG;
		protected String pol;
		protected String brojTelefona;
		protected String adresa;
		protected String korisnickoIme;
		protected String lozinka;
	
	public Osoba() {
		this.id=Osoba.ID++;
		this.ime = "";
		this.prezime = "";
		this.JMBG = "";
		this.pol = "";
		this.brojTelefona = "";
		this.adresa = "";
		this.korisnickoIme = "";
		this.lozinka = "";
	}
	public Osoba(String ime,String prezime,String JMBG,String pol,String brojTelefona,String adresa,String korisnickoIme,String lozinka) {
		
		this.ime = ime;
		this.prezime = prezime;
		this.JMBG = JMBG;
		this.pol = pol;
		this.brojTelefona = brojTelefona;
		this.adresa = adresa;
		this.korisnickoIme = korisnickoIme;
		this.lozinka = lozinka;
	}
	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getPretime() {
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
	public String getPol() {
		return pol;
	}

	public void setPol(String pol) {
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
	

	

}
