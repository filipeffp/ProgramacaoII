
public class ArmaDeFogo {
	private String especie;//pistola, revólver
	private String marca;//taurus, glock, rossi...
	private String modelo;//PT 100,
	private float calibre;
	private String nrSerie;
	private int patrimonio;
	private String status;
	//adicionar a classe pessoa como atributo
	
	final String COFRE = "Armazenada";
	final String EMPRESTADA = "Emprestada";
	final String SAIDA = "Baixada";
	
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
