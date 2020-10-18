package dados;

import negocio.beans.Usuario;

public interface IRepositorioUsuarios {
	
	boolean cadastrarUsuario(Usuario usuario);
	boolean removerUsuario(Usuario usuario);
	boolean buscarUsuario(Usuario usuario);

}
