package negocio;

import dados.RepositorioArmaDeFogo;
import negocio.beans.ArmaDeFogo;


public class CadastrarArmaDeFogo {
	
	private static CadastrarArmaDeFogo uniqueInstance;
	private RepositorioArmaDeFogo repositorioArmas;
	
	private CadastrarArmaDeFogo () {
		repositorioArmas= new RepositorioArmaDeFogo();
	}
	
	public static synchronized CadastrarArmaDeFogo getInstance() {
		if ( uniqueInstance == null )
			uniqueInstance= new CadastrarArmaDeFogo();
		return uniqueInstance;
	}
	
	public boolean encontrado(ArmaDeFogo arma) {
		boolean encontrado= false;
		ArmaDeFogo armaCadastrada= repositorioArmas.consultar( arma.getNrSerie() );
		if ( armaCadastrada != null && armaCadastrada.getMarca().equals(arma.getMarca())) {
			if(armaCadastrada.getModelo().equals(arma.getModelo())) {
				encontrado= true;
			}
		}
		return encontrado;
	}
	
	public boolean cadastrar(ArmaDeFogo arma) {
		boolean isCadastrado= false;
		if ( repositorioArmas.consultar( arma.getNrSerie() ) == null ) {
			repositorioArmas.cadastrar(arma);
			isCadastrado= true;
		}
		return isCadastrado;
	}
	
	public boolean encontradoRetirado(ArmaDeFogo arma) {
		boolean encontrado= false;
		ArmaDeFogo armaCadastrada= repositorioArmas.status( arma );
		if ( armaCadastrada != null && armaCadastrada.getMarca().equals(arma.getMarca())) {
			if(armaCadastrada.getModelo().equals(arma.getModelo())) {
				if(armaCadastrada.getCalibre().equals(arma.getCalibre())) {
					if(armaCadastrada.getEspecie().equals(arma.getEspecie())){
				encontrado= true;
					}
				}
			}
		}
		return encontrado;
	}
	
	public boolean encontradoDefinitivo(ArmaDeFogo arma) {
		boolean encontrado= false;
		ArmaDeFogo armaCadastrada= repositorioArmas.statusDefinitivo( arma );
		if ( armaCadastrada != null && armaCadastrada.getMarca().equals(arma.getMarca())) {
			if(armaCadastrada.getModelo().equals(arma.getModelo())) {
				if(armaCadastrada.getCalibre().equals(arma.getCalibre())) {
					if(armaCadastrada.getEspecie().equals(arma.getEspecie())){
				encontrado= true;
					}
				}
			}
		}
		return encontrado;
	}

	
}