package Dados;

import java.util.ArrayList;

import Neg�cio.Municao;
import Neg�cio.Pessoa;

public class RepositorioPessoas {
	private ArrayList<Pessoa> pessoas;
	
	public RepositorioPessoas (int tamanho) {
		this.pessoas = new ArrayList<>(tamanho);
	}
}