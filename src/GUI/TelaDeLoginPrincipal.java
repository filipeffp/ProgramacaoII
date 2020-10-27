package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;

import negocio.CadastrarUsuario;
import negocio.beans.Usuario;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

public class TelaDeLoginPrincipal {

	private JFrame frame;
	private JTextField txtLogin;
	private JButton btnCadastrar;
	private JPasswordField passwordLogin;
	private JLabel lblSenha;
	

	/**
	 * Create the application.
	 */
	public TelaDeLoginPrincipal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 375);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtLogin = new JTextField();
		txtLogin.setBounds(132, 112, 158, 20);
		frame.getContentPane().add(txtLogin);
		txtLogin.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Usuario usuario= new Usuario( passwordLogin.getText(), txtLogin.getText(),null,null);
				if ( CadastrarUsuario.getInstance().usuarioLogado(usuario) ) {
					new MenuPrincipal();
					frame.setVisible(false);
				} else {
					JOptionPane.showMessageDialog(null, "Senha ou login invalido");
				}
				
			}
		});
		btnLogin.setBounds(95, 244, 89, 23);
		frame.getContentPane().add(btnLogin);
		
		btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new TelaDeVerificaçãoDeCadastro();
				frame.setVisible(false);
			}
		});
		btnCadastrar.setBounds(236, 244, 112, 23);
		frame.getContentPane().add(btnCadastrar);
		
		passwordLogin = new JPasswordField();
		passwordLogin.setToolTipText("");
		passwordLogin.setBounds(132, 168, 158, 20);
		frame.getContentPane().add(passwordLogin);
		
		JLabel lblCPF = new JLabel("Insira o CPF:");
		lblCPF.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCPF.setBounds(132, 81, 106, 20);
		frame.getContentPane().add(lblCPF);
		
		lblSenha = new JLabel("Insira a senha:");
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSenha.setBounds(132, 143, 106, 14);
		frame.getContentPane().add(lblSenha);
		
		frame.setVisible(true);
	}
}
