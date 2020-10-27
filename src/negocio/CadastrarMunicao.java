package negocio;

import dados.RepositorioMunicoes;
import negocio.beans.Municao;

public class CadastrarMunicao {
	
	private static CadastrarMunicao uniqueInstance;
	private RepositorioMunicoes repositorioMunicao;
	
	private CadastrarMunicao () {
		repositorioMunicao= new RepositorioMunicoes();
	}
	
	public static synchronized CadastrarMunicao getInstance() {
		if ( uniqueInstance == null )
			uniqueInstance= new CadastrarMunicao();
		return uniqueInstance;
	}
	
	public boolean cadastrar(Municao municao) {
		repositorioMunicao.cadastrar(municao);
		return true;
		
	}
	public boolean checar(Municao municao) {
		boolean tem = false;
		if(repositorioMunicao.consultar(municao.getCalibre(), municao.getQuantidade())) {
			tem = true;
		}
		return tem;
	}
	public void retirar(Municao municao) {
		repositorioMunicao.remover(municao);
	}

}
