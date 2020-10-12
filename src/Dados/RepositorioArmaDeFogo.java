package Dados;

import java.util.ArrayList;
import Neg�cio.ArmaDeFogo;

public class RepositorioArmaDeFogo {
	private ArrayList<ArmaDeFogo> armasDeFogo;
	public RepositorioArmaDeFogo () {
		this.armasDeFogo = new ArrayList<>();
		}
	
	//cadastrar armaDeFogo
		public boolean cadastrarArmaDeFogo(ArmaDeFogo armaDeFogo) {
			boolean retorno = true;
			boolean existe = false;
			for(int i=0;i<armasDeFogo.size();i++) {
				if(armasDeFogo.get(i).getNrSerie() == armaDeFogo.getNrSerie()) {
					if(armaDeFogo.isAtiva() == true) {
					System.out.println("ARMA J� CADASTRADA");
					retorno = false;
					existe = true;
					}else {
						armaDeFogo.setAtiva(true);
						System.out.println("ARMA REATIVADA COM SUCESSO!");
						existe = true;
					}
				}
			}
			if(retorno==true && existe==false) {
			armasDeFogo.add(armaDeFogo);
			System.out.println("ARMA CADASTRADA COM SUCESSO!");
			}
			return retorno;
	}
		//remover armaDeFogo
		public boolean removerArmaDeFogo(ArmaDeFogo armaDeFogo) {
			boolean retorno = false;
			for(int i=0;i<armasDeFogo.size();i++) {
				if(armasDeFogo.get(i).getNrSerie() == armaDeFogo.getNrSerie() && armasDeFogo.get(i).isAtiva() == true) {
					armaDeFogo.setAtiva(false);
					System.out.println("ARMA REMOVIDA COM SUCESSO!");
					retorno = true;
					return retorno;
				}
			}
				System.out.println("ARMA N�O CADASTRADA!");
				return retorno;
	}

}