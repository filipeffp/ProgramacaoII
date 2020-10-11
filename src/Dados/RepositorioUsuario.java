package Dados;

import java.util.ArrayList;
import Neg�cio.Usuario;
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
				retorno = "USU�RIO J� CADASTRADO";
				cond = false;
			}
		}
		if(cond == true){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Qual ser� o n�vel do usu�rio? 1- para ADM ou 2 - para usu�rio comum");
		int nivel = scanner.nextInt();
		if(nivel == 1) {
			login.setAdmin(true);
		}
		else {
			login.setAdmin(false);
		}
		scanner.close();
		usuario.add(login);
		retorno = "USU�RIO CADASTRADO";
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


}

