package Dados;

import java.util.ArrayList;

import Neg�cio.Municao;

public class RepositorioMunicoes {
	private ArrayList<Municao> municoes;
	
	public RepositorioMunicoes (int tamanho) {
		this.municoes = new ArrayList<>(tamanho);
	}
}
