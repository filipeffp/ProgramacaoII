package Negócio;

public class Municao {
	private float calibre;
	private int quantidade;
	private Pessoa proprietario;
	
	public Municao(float calibre, int quantidade, Pessoa proprietario) {
		super();
		this.calibre = calibre;
		this.quantidade = quantidade;
		this.proprietario = proprietario;
	}

	public float getCalibre() {
		return calibre;
	}

	public void setCalibre(float calibre) {
		this.calibre = calibre;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Pessoa getProprietario() {
		return proprietario;
	}

	public void setProprietario(Pessoa proprietario) {
		this.proprietario = proprietario;
	}
	
}
