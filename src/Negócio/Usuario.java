package Negócio;

public class Usuario extends Militar {
	private String senha;
	private String log;
	private boolean admin = false;
	private boolean ativa = true;

	public Usuario(String nome, String cpf, String matricula, String senha, boolean admin, boolean ativa) {
		super(nome, cpf, matricula);
		this.senha = senha;
		this.admin = admin;
		this.ativa = ativa;
		this.log = cpf;
	}
	
	public String getLog() {
		return log;
	}

	public void setLog(String log) {
		this.log = log;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public boolean isAdmin() {
		return admin;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
	}

	public boolean isAtiva() {
		return ativa;
	}

	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}

	@Override
	public String toString() {
		return "Usuario [log=" + log + ", admin=" + admin + ", ativa=" + ativa + "]";
	}

}