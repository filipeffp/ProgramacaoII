package Dados;

import java.util.ArrayList;

import Negócio.Municao;
import Negócio.Pessoa;

public class RepositorioPessoas {
	private ArrayList<Pessoa> pessoas;
	
	public RepositorioPessoas (int tamanho) {
		this.pessoas = new ArrayList<>(tamanho);
	}
}