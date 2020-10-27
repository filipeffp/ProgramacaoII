package negocio;

import dados.RepositorioUsuario;
import negocio.beans.Usuario;

public class CadastrarUsuario {
	
	private static CadastrarUsuario uniqueInstance;
	private RepositorioUsuario repositorioUsuario;
	
	private CadastrarUsuario () {
		repositorioUsuario= new RepositorioUsuario();
	}
	
	public static synchronized CadastrarUsuario getInstance() {
		if ( uniqueInstance == null )
			uniqueInstance= new CadastrarUsuario();
		return uniqueInstance;
	}
	
	public boolean usuarioLogado(Usuario usuarioSession) {
		boolean isLogado= false;
		Usuario usuarioCadastrado= repositorioUsuario.consultar( usuarioSession.getCpf() );
		if ( usuarioCadastrado != null && usuarioCadastrado.getSenha().equals( usuarioSession.getSenha() ) ) {
			isLogado= true;
		}
		return isLogado;
	}
	public boolean isADM(Usuario usuario) {
		boolean isAdm= false;
		Usuario usuarioCadastrado= repositorioUsuario.consultar( usuario.getCpf() );
		if ( usuarioCadastrado != null && usuarioCadastrado.getSenha().equals( usuario.getSenha() ) ) {
			if(usuarioCadastrado.isAdmin()==true) {
				isAdm= true;
			}
		}
		return isAdm;
	}
	
	public boolean cadastrar(Usuario usuario) {
		boolean isCadastrado= false;
		if ( repositorioUsuario.consultar( usuario.getCpf() ) == null ) {
			repositorioUsuario.cadastrar(usuario);
			isCadastrado= true;
		}
		return isCadastrado;
	}

	
}
