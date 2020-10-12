package Dados;

import Negócio.Usuario;

public interface IRepositorioUsuarios {
	
	boolean cadastrarUsuario(Usuario usuario);
	boolean removerUsuario(Usuario usuario);
	boolean buscarUsuario(Usuario usuario);

}
