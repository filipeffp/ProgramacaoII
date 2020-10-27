package dados;

import java.util.ArrayList;

import negocio.beans.Usuario;

public class RepositorioUsuario {
	private ArrayList<Usuario> usuarios;

	public RepositorioUsuario() {
		usuarios = new ArrayList<Usuario>();
	}

	public void cadastrar(Usuario usuario) {
		usuarios.add(usuario);
	}
	
	public Usuario consultar(String cpf) {
		Usuario usuario= null;
		if ( cpf != null ) {
			for (Usuario user : usuarios) {
				if ( cpf.equals( user.getCpf()) ) {
					usuario= user;
					break;
				}
			}
		}
		return usuario;
	}

//	// alterar condi��es de seguran�a depois ex.: pergunta de seguran�a
//	public String trocarSenha(Usuario login) {
//		String retorno = "USU�RIO N�O CADASTRADO";
//		for (int i = 0; i < usuario.size(); i++) {
//			if (usuario.get(i).getLog() == login.getLog()) {
//				usuario.get(i).setSenha(login.getSenha());
//				retorno = "SENHA ALTERADA";
//			}
//
//		}
//		return retorno;
//	}

}