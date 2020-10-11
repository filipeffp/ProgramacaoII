package Negócio;


public class Usuario {
	protected String senha;
	protected String log;
	protected Militar militar;
	protected boolean admin = false;
	
	
	public Usuario(String senha, Militar militar) {
		super();
		this.senha = senha;
		this.militar = militar;
		this.log = militar.getCpf();
	}


	public boolean isAdmin() {
		return admin;
	}


	public void setAdmin(boolean admin) {
		this.admin = admin;
	}


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}


	public String getLog() {
		return log;
	}


	public void setLog(String log) {
		this.log = log;
	}


	}