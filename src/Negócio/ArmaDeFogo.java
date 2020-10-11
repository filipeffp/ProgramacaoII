package Negócio;

import java.time.LocalDate;

public class ArmaDeFogo extends MaterialBelico {

	private String marca;//taurus, glock, rossi...
	private String modelo;//PT 100,
	private String nrSerie;
	private String status;
	private boolean ativa = true;
	
	//constantes
	final String COFRE = "Armazenada";
	final String EMPRESTADA = "Emprestada";
	final String SAIDA = "Baixada";
	
	//construtores
	public ArmaDeFogo(String calibre, String especie, LocalDate dataCarga, LocalDate dataDescarga, String marca,
			String modelo, String nrSerie, String status) {
		super(calibre, especie, dataCarga, dataDescarga);
		this.marca = marca;
		this.modelo = modelo;
		this.nrSerie = nrSerie;
		this.status = status;
	}

	//métodos
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getNrSerie() {
		return nrSerie;
	}
	public void setNrSerie(String nrSerie) {
		this.nrSerie = nrSerie;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public boolean isAtiva() {
		return ativa;
	}

	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}
	
}
