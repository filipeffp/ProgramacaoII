package Negócio;

import java.time.LocalDate;

public abstract class MaterialBelico {
	protected float calibre;//.40, .38, 9mm, 7,62mm
	protected String especie;//pistola, revolver
	protected LocalDate dataCarga;
	protected LocalDate dataDescarga;
	
	//construtores
	public MaterialBelico(float calibre, String especie, LocalDate dataCarga, LocalDate dataDescarga) {
		super();
		this.calibre = calibre;
		this.especie = especie;
		this.dataCarga = dataCarga;
		this.dataDescarga = dataDescarga;
	}
		
	//métodos
	public float getCalibre() {
		return calibre;
	}
	public void setCalibre(float calibre) {
		this.calibre = calibre;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public LocalDate getDataCarga() {
		return dataCarga;
	}
	public void setDataCarga(LocalDate dataCarga) {
		this.dataCarga = dataCarga;
	}
	public LocalDate getDataDescarga() {
		return dataDescarga;
	}
	public void setDataDescarga(LocalDate dataDescarga) {
		this.dataDescarga = dataDescarga;
	}

	@Override
	public String toString() {
		return "MaterialBelico [calibre=" + calibre + ", especie=" + especie + ", dataCarga=" + dataCarga
				+ ", dataDescarga=" + dataDescarga + "]";
	}
	
}
