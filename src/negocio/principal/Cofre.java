package negocio.principal;

import java.time.LocalDate;

import dados.IRepositorioArmaDeFogo;
import negocio.ArmaDeFogo;
import negocio.Militar;

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
	
	public void emprestarArma(ArmaDeFogo armaDeFogo, Militar militar, LocalDate dataEmprestimo) {
	
	}
	
	public void devolverArma(ArmaDeFogo armaDeFogo, Militar militar, LocalDate dataDevolucao) {
		
	}
}
