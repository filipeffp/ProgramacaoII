package dados;

import java.util.ArrayList;

import negocio.beans.Municao;


public class RepositorioMunicoes{
	private ArrayList<Municao> municoes;
	
	public RepositorioMunicoes() {
		this.municoes = new ArrayList<Municao>();
	}

	public void cadastrar(Municao municao) {
		municoes.add(municao);
	}
	public boolean consultar(String calibre,int quantidade) {
		boolean municao= false;
		if ( calibre != null && quantidade != 0) {
			for (Municao ammo : municoes) {
				if ( calibre.equals( ammo.getCalibre()) ) {
					if(quantidade <= ammo.getQuantidade()) {
					municao= true;
					break;
					}
				}
			}
		}
		return municao;
	}
	public void remover(Municao municao) {
		for(int i=0;i<municoes.size();i++) {
			if(municoes.get(i).getCalibre().equals(municao.getCalibre())) {
				if(municoes.get(i).getQuantidade()>= municao.getQuantidade()) {
					municoes.get(i).setQuantidade(municoes.get(i).getQuantidade()-municao.getQuantidade());
				}
			}
		}
		
	}
	
}

