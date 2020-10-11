package Dados;

import java.util.ArrayList;
import Negócio.Usuario;
import java.util.Scanner;

public class RepositorioUsuario{
	private int atual = 0;
	private  ArrayList<Usuario> usuario;

	
	
	public RepositorioUsuario () {
		usuario = new ArrayList<>();
	
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
		Scanner scanner = new Scanner(System.in);
		System.out.println("Qual será o nível do usuário? 1- para ADM ou 2 - para usuário comum");
		int nivel = scanner.nextInt();
		if(nivel == 1) {
			login.setAdmin(true);
		}
		else {
			login.setAdmin(false);
		}
		scanner.close();
		usuario.add(login);
		retorno = "USUÁRIO CADASTRADO";
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


}

