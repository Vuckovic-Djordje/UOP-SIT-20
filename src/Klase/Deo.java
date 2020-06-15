package Klase;
public class Deo {
	int id;
	String marka;
	String model;
	String naziv;
	int cena;
	public Deo() 
	{
		this.id=0;
		this.marka="";
		this.model="";
		this.cena=0;
		
	}
	public Deo(int id,String marka,String model,String naziv,int cena) 
	{
		super();
		this.id=id;
		this.marka=marka;
		this.model=model;
		this.cena=cena;
		
	}
	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public int getCena() {
		return cena;
	}

	public void setCena(int cena) {
		this.cena = cena;
	}
}
