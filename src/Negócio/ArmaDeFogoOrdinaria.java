package Negócio;

import java.time.LocalDate;

public class ArmaDeFogoOrdinaria extends ArmaDeFogo {
	private Pessoa proprietario;
	
	//construtores
	public ArmaDeFogoOrdinaria(String calibre, String especie, LocalDate dataCarga, LocalDate dataDescarga, String marca,
			String modelo, String nrSerie, String status) {
		super(calibre, especie, dataCarga, dataDescarga, marca, modelo, nrSerie, status);
	}
	public ArmaDeFogoOrdinaria(String calibre, String especie, LocalDate dataCarga, LocalDate dataDescarga, String marca,
			String modelo, String nrSerie, String status, Pessoa proprietario) {
		super(calibre, especie, dataCarga, dataDescarga, marca, modelo, nrSerie, status);
		this.proprietario = proprietario;
	}
	
	//métodos
	public Pessoa getProprietario() {
		return proprietario;
	}
	public void setProprietario(Pessoa proprietario) {
		this.proprietario = proprietario;
	}
	@Override
	public String toString() {
		return "ArmaDeFogoOrdinaria [proprietario=" + proprietario + "]";
	}
	
}
