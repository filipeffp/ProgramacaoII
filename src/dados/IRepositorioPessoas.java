package Dados;

import Negócio.Pessoa;

public interface IRepositorioPessoas {
	
	boolean cadastrarPessoa(Pessoa pessoa);
	boolean removerPessoa(Pessoa pessoa);
	boolean buscarPessoa(Pessoa pessoa);

}
