package Negócio;

public class Pessoa {
	private String nome;
	private String cpf;
	private boolean ativa = true;
	
	public Pessoa(String nome, String cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public boolean isAtiva() {

		// TODO Auto-generated method stub
		return false;
	}



	public void setAtiva(boolean ativa) {
		this.ativa = ativa;

	}
	
}
