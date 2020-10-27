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
import java.awt.Color;

public class TelaDeVerificaçãoDeCadastro {

	private JFrame frame;
	private JTextField txtVerificacaoCPF;
	private JPasswordField passwordVerificacao;
	private JLabel lblVerificacaoSenha;
	private JLabel lblVerificacaoMensagem;
	private JButton btnVerificacaoVoltar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaDeVerificaçãoDeCadastro window = new TelaDeVerificaçãoDeCadastro();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaDeVerificaçãoDeCadastro() {
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
		
		txtVerificacaoCPF = new JTextField();
		txtVerificacaoCPF.setBounds(132, 112, 158, 20);
		frame.getContentPane().add(txtVerificacaoCPF);
		txtVerificacaoCPF.setColumns(10);
		
		JButton btnVerificacaoLogin = new JButton("Login");
		btnVerificacaoLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Usuario usuario= new Usuario( passwordVerificacao.getText() , txtVerificacaoCPF.getText(), null,null);

				if ( CadastrarUsuario.getInstance().usuarioLogado(usuario) && CadastrarUsuario.getInstance().isADM(usuario)) {
					new TelaDeCadastro();
					frame.setVisible(false);
				} 
				else if(CadastrarUsuario.getInstance().usuarioLogado(usuario)&&!CadastrarUsuario.getInstance().isADM(usuario)){
					JOptionPane.showMessageDialog(null, "Este usuário não é ADM");
				}
				else {
					JOptionPane.showMessageDialog(null, "Senha ou login invalido");
				}
				
			}
		});
		btnVerificacaoLogin.setBounds(167, 244, 89, 23);
		frame.getContentPane().add(btnVerificacaoLogin);
		
		passwordVerificacao = new JPasswordField();
		passwordVerificacao.setToolTipText("");
		passwordVerificacao.setBounds(132, 168, 158, 20);
		frame.getContentPane().add(passwordVerificacao);
		
		JLabel lblVerificacaoCPF = new JLabel("Insira o CPF:");
		lblVerificacaoCPF.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblVerificacaoCPF.setBounds(132, 81, 106, 20);
		frame.getContentPane().add(lblVerificacaoCPF);
		
		lblVerificacaoSenha = new JLabel("Insira a senha:");
		lblVerificacaoSenha.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblVerificacaoSenha.setBounds(132, 143, 106, 14);
		frame.getContentPane().add(lblVerificacaoSenha);
		
		lblVerificacaoMensagem = new JLabel("Apenas usu\u00E1rios ADM podem realizar cadastros de usu\u00E1rio:");
		lblVerificacaoMensagem.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblVerificacaoMensagem.setForeground(Color.RED);
		lblVerificacaoMensagem.setBounds(42, 11, 370, 14);
		frame.getContentPane().add(lblVerificacaoMensagem);
		
		btnVerificacaoVoltar = new JButton("Voltar");
		btnVerificacaoVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new TelaDeLoginPrincipal();
				frame.setVisible(false);	
			}
		});
		btnVerificacaoVoltar.setBounds(167, 302, 89, 23);
		frame.getContentPane().add(btnVerificacaoVoltar);
		frame.setVisible(true);
	}
}

