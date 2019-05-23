package com.infotel.metier;

public class Magasin {

	private long idMagasin;
	private String nomMagasin;
	private int codeMagasin;
	private double prixLocal;
	public long getIdMagasin() {
		return idMagasin;
	}
	public void setIdMagasin(long idMagasin) {
		this.idMagasin = idMagasin;
	}
	public String getNomMagasin() {
		return nomMagasin;
	}
	public void setNomMagasin(String nomMagasin) {
		this.nomMagasin = nomMagasin;
	}
	public int getCodeMagasin() {
		return codeMagasin;
	}
	public void setCodeMagasin(int codeMagasin) {
		this.codeMagasin = codeMagasin;
	}
	public double getPrixLocal() {
		return prixLocal;
	}
	public void setPrixLocal(double prixLocal) {
		this.prixLocal = prixLocal;
	}
	@Override
	public String toString() {
		return "Magasin [idMagasin=" + idMagasin + ", nomMagasin=" + nomMagasin + ", codeMagasin=" + codeMagasin
				+ ", prixLocal=" + prixLocal + "]";
	}
	
	
}
