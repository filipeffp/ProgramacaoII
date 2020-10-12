package Dados;

import java.util.ArrayList;
import Neg�cio.Usuario;
import java.util.Scanner;

public class RepositorioUsuario{
	private  ArrayList<Usuario> usuario;

	
	
	public RepositorioUsuario () {
		usuario = new ArrayList<>();
	
	}

	public String cadastrar(Usuario login) {
		String retorno = "";
		boolean cond = true;
		for(int i=0;i<usuario.size();i++) {
			if(usuario.get(i).getLog().equals(login.getLog())) {
				retorno = "USU�RIO J� CADASTRADO";
				cond = false;
			}
		}
		if(cond == true){

		usuario.add(login);
		retorno = "USU�RIO CADASTRADO";
		}
		return retorno;
		
	}
	//alterar condi��es de seguran�a depois ex.: pergunta de seguran�a
	public String trocarSenha(Usuario login) {
		String retorno = "USU�RIO N�O CADASTRADO";
		for(int i=0;i<usuario.size();i++) {
			if(usuario.get(i).getLog() == login.getLog()) {
				usuario.get(i).setSenha(login.getSenha());
				retorno = "SENHA ALTERADA";
			}
			
		
		}
		return retorno;
	}
	public int tamanho() {
		return usuario.size();
	}
	public String cpf(int i) {
		return usuario.get(i).getLog();
	}
	public String senha(int i) {
		return usuario.get(i).getSenha();
	}
	public boolean admin(int i) {
		return usuario.get(i).isAdmin();
	}
	public void add(Usuario add) {
		usuario.add(add);
	}


}

