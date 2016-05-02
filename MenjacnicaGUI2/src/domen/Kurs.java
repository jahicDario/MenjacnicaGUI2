package domen;

public class Kurs {
	
	private int sifra;
	private int prodajniKurs;
	private int srednjiKurs;
	private int kupovniKurs;
	private String naziv;
	private String skraceniNaziv;
	public int getSifra() {
		return sifra;
	}
	public void setSifra(int sifra) {
		this.sifra = sifra;
	}
	public int getProdajniKurs() {
		return prodajniKurs;
	}
	public void setProdajniKurs(int prodajniKurs) {
		this.prodajniKurs = prodajniKurs;
	}
	public int getSrednjiKurs() {
		return srednjiKurs;
	}
	public void setSrednjiKurs(int srednjiKurs) {
		this.srednjiKurs = srednjiKurs;
	}
	public int getKupovniKurs() {
		return kupovniKurs;
	}
	public void setKupovniKurs(int kupovniKurs) {
		this.kupovniKurs = kupovniKurs;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public String getSkraceniNaziv() {
		return skraceniNaziv;
	}
	public void setSkraceniNaziv(String skraceniNaziv) {
		this.skraceniNaziv = skraceniNaziv;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Kurs){
			Kurs k = (Kurs) obj;
			if(k.getNaziv().equals(getNaziv())){
				return true;
			}
			else{
				return false;
			}
		}
		return false;
	}

}
