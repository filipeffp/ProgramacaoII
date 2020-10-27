package dados;

import java.util.ArrayList;

import negocio.beans.ArmaDeFogo;


public class RepositorioArmaDeFogo implements IRepositorioArmaDeFogo{
	private ArrayList<ArmaDeFogo> armasDeFogo;
	
	public RepositorioArmaDeFogo () {
		this.armasDeFogo = new ArrayList<ArmaDeFogo>();
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
		public ArmaDeFogo consultar(String nDeSerie) {
			ArmaDeFogo arma= null;
			if ( nDeSerie != null ) {
				for (ArmaDeFogo gun : armasDeFogo) {
					if ( nDeSerie.equals( gun.getNrSerie()) ) {
						arma= gun;
						break;
					}

				}
			}
			return arma;
		}
		
		public void cadastrar(ArmaDeFogo arma) {
			armasDeFogo.add(arma);
		}
		
		public ArmaDeFogo status(ArmaDeFogo arma) {
			ArmaDeFogo armaFinal= null;
			String aux = "ausente";
			String aux2 = "dispensado";
			if ( arma.getNrSerie() != null ) {
				int cont = 0;
				for (ArmaDeFogo gun : armasDeFogo) {
					if ( arma.getNrSerie().equals( gun.getNrSerie())) {
						if(arma.getCalibre().equals(gun.getCalibre())) {
							if(arma.getMarca().equals(gun.getMarca())) {
								if(arma.getModelo().equals(gun.getModelo())) {
									if(arma.getEspecie().equals(gun.getEspecie())) {
										if(!armasDeFogo.get(cont).getStatus().equals(aux)) {
											if(!armasDeFogo.get(cont).getStatus().equals(aux2)) {
												armaFinal= gun;
												armasDeFogo.get(cont).setStatus("ausente");
												break;
										}
										}
									}
									}
					
							}
							}
						}
					cont++;
					}
			}
			return armaFinal;
		}
		
		public ArmaDeFogo statusDefinitivo(ArmaDeFogo arma) {
			ArmaDeFogo armaFinal= null;
			String aux = "ausente";
			String aux2 = "dispensado";
			if ( arma.getNrSerie() != null ) {
				int cont = 0;
				for (ArmaDeFogo gun : armasDeFogo) {
					if ( arma.getNrSerie().equals( gun.getNrSerie())) {
						if(arma.getCalibre().equals(gun.getCalibre())) {
							if(arma.getMarca().equals(gun.getMarca())) {
								if(arma.getModelo().equals(gun.getModelo())) {
									if(arma.getEspecie().equals(gun.getEspecie())) {
										if(!armasDeFogo.get(cont).getStatus().equals(aux)) {
											if(!armasDeFogo.get(cont).getStatus().equals(aux2)) {
												armaFinal= gun;
												armasDeFogo.get(cont).setStatus("dispensado");
												break;
										}
										}
						}
					
								}
							}
							}
						}
					cont++;
					}
			}
			return armaFinal;
		}

}