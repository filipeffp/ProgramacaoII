package Dados;

import java.util.ArrayList;
import Negócio.Usuario;

public class RepositorioUsuarios {
	private ArrayList<Usuario> usuarios;
	
	public RepositorioUsuarios () {
		this.usuarios = new ArrayList<>();
		}
	
	//cadastrar usuarios
	public boolean cadastrarUsuario(Usuario usuario) {
		boolean retorno = true;
		boolean existe = false;
		for(int i=0;i<usuarios.size();i++) {
			if(usuarios.get(i).getLog() == usuario.getLog()) {
				if(usuario.isAtiva() == true) {
				System.out.println("PESSOA JÁ CADASTRADA");
				retorno = false;
				existe = true;
				}else {
					usuario.setAtiva(true);
					System.out.println("PESSOA REATIVADA COM SUCESSO!");
					existe = true;
				}
			}
		}
		if(retorno==true && existe==false) {
		usuarios.add(usuario);
		System.out.println("PESSOA CADASTRADA COM SUCESSO!");
		}
		return retorno;
}
	//remover usuarios
	public boolean removerUsuario(Usuario usuario) {
		boolean retorno = false;
		for(int i=0;i<usuarios.size();i++) {
			if(usuarios.get(i).getLog() == usuario.getLog() && usuarios.get(i).isAtiva() == true) {
				usuario.setAtiva(false);
				System.out.println("PESSOA REMOVIDA COM SUCESSO!");
				retorno = true;
				return retorno;
			}
		}
			System.out.println("PESSOA NÃO CADASTRADA!");
			return retorno;
}
	
}