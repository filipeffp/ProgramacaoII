package Dados;

import java.util.ArrayList;
import Negócio.Usuario;
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
				retorno = "USUÁRIO JÁ CADASTRADO";
				cond = false;
			}
		}
		if(cond == true){

		usuario.add(login);
		retorno = "USUÁRIO CADASTRADO";
		}
		return retorno;
		
	}
	//alterar condições de segurança depois ex.: pergunta de segurança
	public String trocarSenha(Usuario login) {
		String retorno = "USUÁRIO NÃO CADASTRADO";
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

