package negocio.beans;

import java.time.LocalDate;

public class MunicaoOrdinaria extends Municao {
	private Pessoa proprietario;
	
	//construtores
	public MunicaoOrdinaria(String calibre, String especie, LocalDate dataCarga, LocalDate dataDescarga,
			int quantidade) {
		super(calibre, especie, dataCarga, dataDescarga, quantidade);
	}

	public MunicaoOrdinaria(String calibre, String especie, LocalDate dataCarga, LocalDate dataDescarga, int quantidade,
			Pessoa proprietario) {
		super(calibre, especie, dataCarga, dataDescarga, quantidade);
		this.proprietario = proprietario;
	}

	//m�todos
	public Pessoa getProprietario() {
		return proprietario;
	}

	public void setProprietario(Pessoa proprietario) {
		this.proprietario = proprietario;
	}

}
