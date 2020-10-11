package Negócio;
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
				retorno = "USUÁRIO JÁ CADASTRADO";
				cond = false;
			}
		}
		if(cond == true){
		usuario.add(login);
		retorno = "USUÁRIO CADASTRADO";
		System.out.println(militar.getNome());
		atual++;
		}
		return retorno;
		
	}
	//alterar condições de segurança depois ex.: pergunta de segurança
	public String trocarSenha(Usuario login) {
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
