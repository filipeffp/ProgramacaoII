package negocio;
import java.time.LocalDate;

import negocio.beans.ArmaDeFogo;
import negocio.beans.Municao;

public class Historico {
	private ArmaDeFogo arma;
	private Municao municao;
	private LocalDate dataCarga;
	private LocalDate dataSaida;
	private LocalDate dataEmprestimo;
	private LocalDate dataRetorno;
	
	//construtores
	public Historico(ArmaDeFogo arma, Municao municao, LocalDate dataCarga, LocalDate dataSaida,
			LocalDate dataEmprestimo, LocalDate dataRetorno) {
		super();
		this.arma = arma;
		this.municao = municao;
		this.dataCarga = dataCarga;
		this.dataSaida = dataSaida;
		this.dataEmprestimo = dataEmprestimo;
		this.dataRetorno = dataRetorno;
	}
	
	//métodos
	
}
