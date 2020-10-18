package dados;

import java.util.ArrayList;

import negocio.beans.ArmaDeFogo;

public class RepositorioArmaDeFogo implements IRepositorioArmaDeFogo{
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
					System.out.println("ARMA JÁ CADASTRADA");
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
				System.out.println("ARMA NÃO CADASTRADA!");
				return retorno;
	}
		//procurar arma de fogo true == arma existe e está ativa, ou false não existe ou não está ativa.
		@Override
		public boolean buscarArmaDeFogo(ArmaDeFogo armaDeFogo) {
			boolean retorno = false;
			for(int i=0;i<armasDeFogo.size();i++) {
				if(armasDeFogo.get(i).getNrSerie() == armaDeFogo.getNrSerie() && armasDeFogo.get(i).isAtiva() == true) {
					retorno = true;
					System.out.println("Arma encontrada!");
				}else {
					System.out.println("Arma não encontrada!");
				}
		}
			return retorno;	
		}
		
		//Verificar se a arma existe
		public boolean existe(ArmaDeFogo arma) {
			boolean existe = false;
				if(armasDeFogo.contains(arma)) {
				existe = true;
			}
			return existe;
		}
}