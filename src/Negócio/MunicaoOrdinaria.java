package Negócio;

import java.time.LocalDate;

public class MunicaoOrdinaria extends Municao {
	private Pessoa proprietario;
	
	//construtores
	public MunicaoOrdinaria(float calibre, String especie, LocalDate dataCarga, LocalDate dataDescarga,
			int quantidade) {
		super(calibre, especie, dataCarga, dataDescarga, quantidade);
	}

	public MunicaoOrdinaria(float calibre, String especie, LocalDate dataCarga, LocalDate dataDescarga, int quantidade,
			Pessoa proprietario) {
		super(calibre, especie, dataCarga, dataDescarga, quantidade);
		this.proprietario = proprietario;
	}

	//métodos
	public Pessoa getProprietario() {
		return proprietario;
	}

	public void setProprietario(Pessoa proprietario) {
		this.proprietario = proprietario;
	}

}
