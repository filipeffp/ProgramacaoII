package Dados;

import Neg�cio.Usuario;

public interface IRepositorioUsuarios {
	
	boolean cadastrarUsuario(Usuario usuario);
	boolean removerUsuario(Usuario usuario);
	boolean buscarUsuario(Usuario usuario);

}
