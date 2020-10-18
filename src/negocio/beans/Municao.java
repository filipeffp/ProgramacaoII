package negocio.beans;

import java.time.LocalDate;

public abstract class Municao extends MaterialBelico{
	private int quantidade;

	//construtores
	public Municao(String calibre, String especie, LocalDate dataCarga, LocalDate dataDescarga, int quantidade) {
		super(calibre, especie, dataCarga, dataDescarga);
		this.quantidade = quantidade;
	}

	//métodos
	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
}
