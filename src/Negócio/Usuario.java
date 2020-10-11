package Neg�cio;
import java.util.ArrayList;

public class Usuario {
	private String senha;
	private String log;
	private Militar militar;
	private int atual = 0;
	private  ArrayList<Usuario> usuario;
	
	
	public Usuario(String senha, Militar militar) {
		super();
		usuario = new ArrayList<>();
		this.senha = senha;
		this.militar = militar;
		this.log = militar.getCpf();
	}

	public String cadastrar(Usuario login) {
		String retorno = "";
		boolean cond = true;
		for(int i=0;i<atual;i++) {
			if(usuario.get(atual).getLog() == login.getLog()) {
				retorno = "USU�RIO J� CADASTRADO";
				cond = false;
			}
		}
		if(cond == true){
		usuario.add(login);
		retorno = "USU�RIO CADASTRADO";
		System.out.println(militar.getNome());
		atual++;
		}
		return retorno;
		
	}
	//alterar condi��es de seguran�a depois ex.: pergunta de seguran�a
	public String trocarSenha(Usuario login) {
		String retorno = "USU�RIO N�O CADASTRADO";
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
