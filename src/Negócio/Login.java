package Negócio;
import java.util.ArrayList;

public class Login {
	private String senha;
	private String log;
	private int atual = 0;
	private  ArrayList<Login> usuario;
	
	
	public Login(String senha, String log) {
		super();
		usuario = new ArrayList<>();
		this.senha = senha;
		this.log = log;
	}


	public String cadastrar(Login login) {
		String retorno = "";
		boolean cond = true;
		for(int i=0;i<atual;i++) {
			if(usuario.get(atual).getLog() == login.getLog()) {
				retorno = "USUÁRIO JÁ CADASTRADO";
				cond = false;
			}
		}
		if(cond == true){
		usuario.add(login);
		retorno = "USUÁRIO CADASTRADO";
		atual++;
		}
		return retorno;
		
	}
	public String trocarSenha(Login login) {
		String retorno = "USUÁRIO NÃO CADASTRADO";
		for(int i=0;i<atual;i++) {
			if(usuario.get(atual).getLog() == login.getLog()) {
				usuario.get(atual).setSenha(login.getSenha());
				retorno = "SENHA ALTERADA";
			}
		
		}
		return retorno;
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
