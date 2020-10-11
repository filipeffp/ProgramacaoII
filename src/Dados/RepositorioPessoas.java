package Dados;

import java.util.ArrayList;
import java.util.Scanner;

import com.sun.xml.internal.ws.api.pipe.NextAction;

import Negócio.Pessoa;
import Negócio.Usuario;

public class RepositorioPessoas {
	private ArrayList<Pessoa> pessoas;
	private int atual = 0;
	
	public RepositorioPessoas () {
		this.pessoas = new ArrayList<>();
		}
	
	public boolean cadastrarPessoa(Pessoa pessoa) {
		boolean retorno = false;
		for(int i=0;i<atual;i++) {
			if(pessoas.get(atual).getCpf() == pessoa.getCpf()) {
				System.out.println("PESSOA JÁ CADASTRADA");
				return retorno;
			}
		}
			pessoas.add(pessoa);
			System.out.println("PESSOA CADASTRADA COM SUCESSO!");
			retorno	= true;
			return retorno;
}
}