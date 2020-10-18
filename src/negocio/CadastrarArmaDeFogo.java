package negocio;

import dados.RepositorioArmaDeFogo;
import negocio.beans.ArmaDeFogo;

public class CadastrarArmaDeFogo {
	private RepositorioArmaDeFogo armasDeFogo;

	public CadastrarArmaDeFogo(RepositorioArmaDeFogo armasDeFogo) {
		super();
		this.armasDeFogo = armasDeFogo;
	}
	
	public void cadastrar(ArmaDeFogo arma) {
		if(arma == null) {
		//avisar que a arma é nula
		}else {
			if(existe(arma)) {
				this.armasDeFogo.cadastrarArmaDeFogo(arma);
			}
		}
		
	}
	public boolean existe(ArmaDeFogo arma) {
		return this.armasDeFogo.existe(arma);
		
	}

}
