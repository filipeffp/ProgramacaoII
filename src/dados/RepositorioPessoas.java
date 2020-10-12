package dados;

import java.util.ArrayList;

import negocio.Pessoa;

public class RepositorioPessoas implements IRepositorioPessoas {
	private ArrayList<Pessoa> pessoas;
	
	public RepositorioPessoas () {
		this.pessoas = new ArrayList<>();
		}
	
	//cadastrar pessoas
	public boolean cadastrarPessoa(Pessoa pessoa) {
		boolean retorno = true;
		boolean existe = false;
		for(int i=0;i<pessoas.size();i++) {
			if(pessoas.get(i).getCpf() == pessoa.getCpf()) {
				if(pessoa.isAtiva() == true) {
				System.out.println("PESSOA JÁ CADASTRADA");
				retorno = false;
				existe = true;
				}else {
					pessoa.setAtiva(true);
					System.out.println("PESSOA REATIVADA COM SUCESSO!");
					existe = true;
				}
			}
		}
		if(retorno==true && existe==false) {
		pessoas.add(pessoa);
		System.out.println("PESSOA CADASTRADA COM SUCESSO!");
		}
		return retorno;
}
	//remover pessoas
	public boolean removerPessoa(Pessoa pessoa) {
		boolean retorno = false;
		for(int i=0;i<pessoas.size();i++) {
			if(pessoas.get(i).getCpf() == pessoa.getCpf() && pessoas.get(i).isAtiva() == true) {
				pessoa.setAtiva(false);
				System.out.println("PESSOA REMOVIDA COM SUCESSO!");
				retorno = true;
				return retorno;
			}
		}
			System.out.println("PESSOA NÃO CADASTRADA!");
			return retorno;
}
	public boolean buscarPessoa(Pessoa pessoa) {
		boolean retorno = false;
		for(int i=0;i<pessoas.size();i++) {
			if(pessoas.get(i).getCpf() == pessoa.getCpf() && pessoas.get(i).isAtiva() == true) {
				retorno = true;
				System.out.println("Pessoa encontrada!");
			}else {
				System.out.println("Pessoa não encontrada!");
			}
	}
		return retorno;	
	}
}