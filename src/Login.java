
public class Login {
	private String senha;
	private String log;
	
	
	public Login(String senha, String log) {
		super();
		this.senha = senha;
		this.log = log;
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
