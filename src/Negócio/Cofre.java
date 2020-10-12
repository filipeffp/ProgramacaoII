package Negócio;

import Dados.IRepositorioArmaDeFogo;

public class Cofre {
	
	private IRepositorioArmaDeFogo repositorio;
	
	public Cofre(IRepositorioArmaDeFogo instanciaInterface) {
		this.repositorio = instanciaInterface;
	}
	
	public void cadastrarArma(ArmaDeFogo armaDeFogo) {
        this.repositorio.cadastrarArmaDeFogo(armaDeFogo);
	}
	
	public void removerArma(ArmaDeFogo armaDeFogo) {
        this.repositorio.removerArmaDeFogo(armaDeFogo);
	}
	
	public void buscarArma(ArmaDeFogo armaDeFogo) {
        this.repositorio.buscarArmaDeFogo(armaDeFogo);
	}
}
