package Negócio;

public class ArmaDeFogo {
	private String especie;//pistola, revolver
	private String marca;//taurus, glock, rossi...
	private String modelo;//PT 100,
	private float calibre;//.40, .38, 9mm, 7,62mm
	private String nrSerie;
	private int patrimonio;
	private String status;
	Pessoa proprietario;
	
	final String COFRE = "Armazenada";
	final String EMPRESTADA = "Emprestada";
	final String SAIDA = "Baixada";
	
	
	//construtor arma fora da corporação, que não tem patrimônio
	public ArmaDeFogo(String especie, String marca, String modelo, float calibre, String nrSerie, String status,
			Pessoa proprietario) {
		super();
		this.especie = especie;
		this.marca = marca;
		this.modelo = modelo;
		this.calibre = calibre;
		this.nrSerie = nrSerie;
		this.status = status;
		this.proprietario = proprietario;
	}

	//construtor arma da corporação, com patrimônio e sem propritário
	public ArmaDeFogo(String especie, String marca, String modelo, float calibre, String nrSerie, int patrimonio,
			String status) {
		super();
		this.especie = especie;
		this.marca = marca;
		this.modelo = modelo;
		this.calibre = calibre;
		this.nrSerie = nrSerie;
		this.patrimonio = patrimonio;
		this.status = status;
	}
	
	public String getEspecie() {
		return especie;
	}

	public Pessoa getProprietario() {
		return proprietario;
	}

	public void setProprietario(Pessoa proprietario) {
		this.proprietario = proprietario;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

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

	public float getCalibre() {
		return calibre;
	}

	public void setCalibre(float calibre) {
		this.calibre = calibre;
	}

	public String getNrSerie() {
		return nrSerie;
	}

	public void setNrSerie(String nrSerie) {
		this.nrSerie = nrSerie;
	}

	public int getPatrimonio() {
		return patrimonio;
	}

	public void setPatrimonio(int patrimonio) {
		this.patrimonio = patrimonio;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
		
}
