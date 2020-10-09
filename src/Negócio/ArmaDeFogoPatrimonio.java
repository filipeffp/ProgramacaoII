package Negócio;

import java.time.LocalDate;

public class ArmaDeFogoPatrimonio extends ArmaDeFogo {
	private String patrimonio;
	private Militar responsavel;
	private LocalDate dataEmprestimo;
	private LocalDate dataDevolucao;
	
	//construtores
	public ArmaDeFogoPatrimonio(float calibre, String especie, LocalDate dataCarga, LocalDate dataDescarga,
			String marca, String modelo, String nrSerie, String status, String patrimonio, Militar responsavel) {
		super(calibre, especie, dataCarga, dataDescarga, marca, modelo, nrSerie, status);
		this.patrimonio = patrimonio;
		this.responsavel = responsavel;
	}

	//métodos
	public String getPatrimonio() {
		return patrimonio;
	}
	
	public void setPatrimonio(String patrimonio) {
		this.patrimonio = patrimonio;
	}
	
	public Militar getResponsavel() {
		return responsavel;
	}
	
	public void setResponsavel(Militar responsavel) {
		this.responsavel = responsavel;
	}
	
	

}
