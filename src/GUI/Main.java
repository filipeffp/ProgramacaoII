package GUI;

import java.awt.EventQueue;

import negocio.CadastrarUsuario;
import negocio.beans.Usuario;

public class Main {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					// Carga de usuario
					CadastrarUsuario.getInstance().cadastrar( new Usuario("123","1234","333","Admin",true));
					
					
					
					
					
					
					
					
					new TelaDeLoginPrincipal();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


}
