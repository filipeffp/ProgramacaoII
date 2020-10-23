package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JRadioButton;

public class SaídaDefinitiva {

	private JFrame frame;
	private JTextField textFieldDefinitivoModelo;
	private JTextField textFieldDefinitivoNdeSerie;
	private JTextField textFieldDefinitivoCalibre;
	private JTextField textFieldDefinitivoEspecie;
	private JTextField textFieldDefinitivoMunCalibre;
	private JTextField textFieldDefinitivoMunQuantidade;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SaídaDefinitiva window = new SaídaDefinitiva();
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
	public SaídaDefinitiva() {
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
		
		textFieldDefinitivoModelo = new JTextField();
		textFieldDefinitivoModelo.setBounds(10, 66, 86, 20);
		frame.getContentPane().add(textFieldDefinitivoModelo);
		textFieldDefinitivoModelo.setColumns(10);
		
		textFieldDefinitivoNdeSerie = new JTextField();
		textFieldDefinitivoNdeSerie.setBounds(10, 137, 86, 20);
		frame.getContentPane().add(textFieldDefinitivoNdeSerie);
		textFieldDefinitivoNdeSerie.setColumns(10);
		
		textFieldDefinitivoCalibre = new JTextField();
		textFieldDefinitivoCalibre.setBounds(10, 204, 86, 20);
		frame.getContentPane().add(textFieldDefinitivoCalibre);
		textFieldDefinitivoCalibre.setColumns(10);
		
		JLabel lblDefinitivoMensagem = new JLabel("SA\u00CDDA DEFINITIVA DE MATERIAL B\u00C9LICO");
		lblDefinitivoMensagem.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblDefinitivoMensagem.setForeground(Color.RED);
		lblDefinitivoMensagem.setBounds(62, 11, 362, 14);
		frame.getContentPane().add(lblDefinitivoMensagem);
		
		JLabel lblDefinitivoModelo = new JLabel("Modelo:");
		lblDefinitivoModelo.setBounds(10, 45, 46, 14);
		frame.getContentPane().add(lblDefinitivoModelo);
		
		JLabel lblDefinitivoNdeSerie = new JLabel("N\u00BA de s\u00E9rie:");
		lblDefinitivoNdeSerie.setBounds(10, 114, 69, 14);
		frame.getContentPane().add(lblDefinitivoNdeSerie);
		
		JLabel lblDefinitivoCalibre = new JLabel("Calibre:");
		lblDefinitivoCalibre.setBounds(10, 181, 46, 14);
		frame.getContentPane().add(lblDefinitivoCalibre);
		
		JButton btnDefinitivoRetirar = new JButton("Retirar");
		btnDefinitivoRetirar.setBounds(151, 319, 115, 23);
		frame.getContentPane().add(btnDefinitivoRetirar);
		
		JLabel lblDefinitivoEspecie = new JLabel("Esp\u00E9cie:");
		lblDefinitivoEspecie.setBounds(10, 245, 69, 14);
		frame.getContentPane().add(lblDefinitivoEspecie);
		
		textFieldDefinitivoEspecie = new JTextField();
		textFieldDefinitivoEspecie.setBounds(10, 270, 86, 20);
		frame.getContentPane().add(textFieldDefinitivoEspecie);
		textFieldDefinitivoEspecie.setColumns(10);
		
		JRadioButton rdbtnDefinitivoMunicao = new JRadioButton("Muni\u00E7\u00E3o");
		rdbtnDefinitivoMunicao.setBounds(301, 41, 109, 23);
		frame.getContentPane().add(rdbtnDefinitivoMunicao);
		
		textFieldDefinitivoMunCalibre = new JTextField();
		textFieldDefinitivoMunCalibre.setBounds(324, 84, 86, 20);
		frame.getContentPane().add(textFieldDefinitivoMunCalibre);
		textFieldDefinitivoMunCalibre.setColumns(10);
		
		textFieldDefinitivoMunQuantidade = new JTextField();
		textFieldDefinitivoMunQuantidade.setBounds(324, 137, 86, 20);
		frame.getContentPane().add(textFieldDefinitivoMunQuantidade);
		textFieldDefinitivoMunQuantidade.setColumns(10);
		
		JLabel lblDefinitivoMunCalibre = new JLabel("Calibre:");
		lblDefinitivoMunCalibre.setBounds(268, 87, 46, 14);
		frame.getContentPane().add(lblDefinitivoMunCalibre);
		
		JLabel lblDefinitivoMunQuantidade = new JLabel("Quantidade:");
		lblDefinitivoMunQuantidade.setBounds(236, 140, 78, 14);
		frame.getContentPane().add(lblDefinitivoMunQuantidade);
		
		JButton btnDefinitivoVoltar = new JButton("Voltar");
		btnDefinitivoVoltar.setBounds(321, 319, 89, 23);
		frame.getContentPane().add(btnDefinitivoVoltar);
	}
}