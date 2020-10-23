package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;

public class CadastroGuardaArmaDeFogo {

	private JFrame frame;
	private JTextField textFieldCadastroArmaModelo;
	private JTextField textFieldCadastroArmaNdeSerie;
	private JTextField textFieldCadastroArmaCalibre;
	private JTextField textFieldCadastroArmaEspecie;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroGuardaArmaDeFogo window = new CadastroGuardaArmaDeFogo();
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
	public CadastroGuardaArmaDeFogo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 407);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textFieldCadastroArmaModelo = new JTextField();
		textFieldCadastroArmaModelo.setBounds(10, 66, 86, 20);
		frame.getContentPane().add(textFieldCadastroArmaModelo);
		textFieldCadastroArmaModelo.setColumns(10);
		
		textFieldCadastroArmaNdeSerie = new JTextField();
		textFieldCadastroArmaNdeSerie.setBounds(10, 137, 86, 20);
		frame.getContentPane().add(textFieldCadastroArmaNdeSerie);
		textFieldCadastroArmaNdeSerie.setColumns(10);
		
		textFieldCadastroArmaCalibre = new JTextField();
		textFieldCadastroArmaCalibre.setBounds(10, 204, 86, 20);
		frame.getContentPane().add(textFieldCadastroArmaCalibre);
		textFieldCadastroArmaCalibre.setColumns(10);
		
		JLabel lblCadastroArmaMensagem = new JLabel("CADASTRO/GUARDA DE ARMAS DE FOGO");
		lblCadastroArmaMensagem.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCadastroArmaMensagem.setForeground(Color.RED);
		lblCadastroArmaMensagem.setBounds(62, 11, 362, 14);
		frame.getContentPane().add(lblCadastroArmaMensagem);
		
		JLabel lblCadastroArmaModelo = new JLabel("Modelo:");
		lblCadastroArmaModelo.setBounds(10, 45, 46, 14);
		frame.getContentPane().add(lblCadastroArmaModelo);
		
		JLabel lblCadastroArmaNdeSerie = new JLabel("N\u00BA de s\u00E9rie:");
		lblCadastroArmaNdeSerie.setBounds(10, 114, 69, 14);
		frame.getContentPane().add(lblCadastroArmaNdeSerie);
		
		JLabel lblCadastroArmaCalibre = new JLabel("Calibre:");
		lblCadastroArmaCalibre.setBounds(10, 181, 46, 14);
		frame.getContentPane().add(lblCadastroArmaCalibre);
		
		JButton btnCadastroArmaCadastrar = new JButton("Cadastrar");
		btnCadastroArmaCadastrar.setBounds(151, 319, 115, 23);
		frame.getContentPane().add(btnCadastroArmaCadastrar);
		
		JLabel lblCadastroArmaEspecie = new JLabel("Esp\u00E9cie:");
		lblCadastroArmaEspecie.setBounds(10, 245, 69, 14);
		frame.getContentPane().add(lblCadastroArmaEspecie);
		
		textFieldCadastroArmaEspecie = new JTextField();
		textFieldCadastroArmaEspecie.setBounds(10, 270, 86, 20);
		frame.getContentPane().add(textFieldCadastroArmaEspecie);
		textFieldCadastroArmaEspecie.setColumns(10);
		
		JButton btnCadastroArmaVoltar = new JButton("Voltar");
		btnCadastroArmaVoltar.setBounds(335, 319, 89, 23);
		frame.getContentPane().add(btnCadastroArmaVoltar);
	}
}
