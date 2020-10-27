package GUI;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import negocio.CadastrarUsuario;
import negocio.beans.Usuario;

public class TelaDeCadastro {

	private JFrame frame;
	private JTextField textCadastroNome;
	private JTextField textCadastroMatricula;
	private JTextField textCadastroCPF;
	private JPasswordField passwordCadastro;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaDeCadastro window = new TelaDeCadastro();
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
	public TelaDeCadastro() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 540);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textCadastroNome = new JTextField();
		textCadastroNome.setBounds(0, 94, 169, 20);
		frame.getContentPane().add(textCadastroNome);
		textCadastroNome.setColumns(10);
		
		textCadastroMatricula = new JTextField();
		textCadastroMatricula.setBounds(0, 150, 169, 20);
		frame.getContentPane().add(textCadastroMatricula);
		textCadastroMatricula.setColumns(10);
		
		textCadastroCPF = new JTextField();
		textCadastroCPF.setBounds(0, 206, 169, 20);
		frame.getContentPane().add(textCadastroCPF);
		textCadastroCPF.setColumns(10);
		
		passwordCadastro = new JPasswordField();
		passwordCadastro.setBounds(0, 262, 169, 20);
		frame.getContentPane().add(passwordCadastro);
		
	    
		JRadioButton rdbtnCadastroAdmSim = new JRadioButton("Sim");
		rdbtnCadastroAdmSim.setBounds(0, 325, 58, 23);
		frame.getContentPane().add(rdbtnCadastroAdmSim);
		
		
		JRadioButton rdbtnCadastroAdmNao = new JRadioButton("N\u00E3o");
		rdbtnCadastroAdmNao.setBounds(60, 325, 109, 23);
		frame.getContentPane().add(rdbtnCadastroAdmNao);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setBounds(10, 69, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblCadastroMatricula = new JLabel("Matricula:");
		lblCadastroMatricula.setBounds(10, 125, 76, 14);
		frame.getContentPane().add(lblCadastroMatricula);
		
		JLabel lblCadastroCPF = new JLabel("CPF:");
		lblCadastroCPF.setBounds(10, 181, 46, 14);
		frame.getContentPane().add(lblCadastroCPF);
		
		JLabel lblCadastroSenha = new JLabel("Senha:");
		lblCadastroSenha.setBounds(10, 237, 46, 14);
		frame.getContentPane().add(lblCadastroSenha);
		
		JLabel lblCadastroADM = new JLabel("Usu\u00E1rio ser\u00E1 ADM?");
		lblCadastroADM.setBounds(10, 304, 123, 14);
		frame.getContentPane().add(lblCadastroADM);
		
		JLabel lblCadastroRelatorio = new JLabel("");
		lblCadastroRelatorio.setBounds(128, 384, 283, 37);
		lblCadastroRelatorio.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCadastroRelatorio.setForeground(Color.RED);
		frame.getContentPane().add(lblCadastroRelatorio);
		
		JLabel lblCadastroMensagem = new JLabel("CADASTRO");
		lblCadastroMensagem.setBounds(165, 11, 101, 31);
		lblCadastroMensagem.setFont(new Font("Tahoma", Font.PLAIN, 18));
		frame.getContentPane().add(lblCadastroMensagem);
		
		JButton btnCadastroCadastrar = new JButton("Cadastrar");
		btnCadastroCadastrar.setBounds(147, 444, 109, 23);
		btnCadastroCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int valor;
				try {
					valor = Integer.parseInt(textCadastroCPF.getText());
					
				}catch(NumberFormatException ex) {
					JOptionPane.showMessageDialog(null, "Digite apenas números !");
				}
				
				if(passwordCadastro == null||textCadastroCPF == null || textCadastroMatricula == null || textCadastroNome == null ||!rdbtnCadastroAdmSim.isSelected()&&!rdbtnCadastroAdmNao.isSelected()) {
					JOptionPane.showMessageDialog(null, "Preencha todos os dados !");		
				}
				else {
				int valor2 = Integer.parseInt(textCadastroCPF.getText());
				Usuario usuario= new Usuario( passwordCadastro.getText() , textCadastroCPF.getText(), textCadastroMatricula.getText(), textCadastroNome.getText());
				if(rdbtnCadastroAdmSim.isSelected()) {
						usuario.setAdmin(true);
				}
				if ( CadastrarUsuario.getInstance().cadastrar(usuario) ) {
					new TelaDeLoginPrincipal();
					frame.setVisible(false);
				} else {
					JOptionPane.showMessageDialog(null, "CPF já cadastrado");
				}
				}
			
				
			}
		});
		frame.getContentPane().add(btnCadastroCadastrar);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(20, 324, 4, 22);
		frame.getContentPane().add(textArea);
		
		JButton btnCadastroVoltar = new JButton("Voltar");
		btnCadastroVoltar.setBounds(335, 444, 89, 23);
		btnCadastroVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new TelaDeVerificaçãoDeCadastro();
				frame.setVisible(false);	
			}
		});
		frame.getContentPane().add(btnCadastroVoltar);
		
		ButtonGroup group = new ButtonGroup();
		group.add(rdbtnCadastroAdmSim);
		group.add(rdbtnCadastroAdmNao);
		frame.setVisible(true);
	}
}
