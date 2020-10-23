package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JRadioButton;

public class ReentradaDeMaterialBélico {

	private JFrame frame;
	private JTextField textFieldReentradaModelo;
	private JTextField textFieldReentradaNdeSerie;
	private JTextField textFieldReentradaCalibre;
	private JTextField textFieldReentradaEspecie;
	private JTextField textFieldReentradaMunCalibre;
	private JTextField textFieldReentradaMunQuantidade;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReentradaDeMaterialBélico window = new ReentradaDeMaterialBélico();
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
	public ReentradaDeMaterialBélico() {
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
		
		textFieldReentradaModelo = new JTextField();
		textFieldReentradaModelo.setBounds(10, 66, 86, 20);
		frame.getContentPane().add(textFieldReentradaModelo);
		textFieldReentradaModelo.setColumns(10);
		
		textFieldReentradaNdeSerie = new JTextField();
		textFieldReentradaNdeSerie.setBounds(10, 137, 86, 20);
		frame.getContentPane().add(textFieldReentradaNdeSerie);
		textFieldReentradaNdeSerie.setColumns(10);
		
		textFieldReentradaCalibre = new JTextField();
		textFieldReentradaCalibre.setBounds(10, 204, 86, 20);
		frame.getContentPane().add(textFieldReentradaCalibre);
		textFieldReentradaCalibre.setColumns(10);
		
		JLabel lblEmprestimoMensagem = new JLabel("REENTRADA DE MATERIAL B\u00C9LICO");
		lblEmprestimoMensagem.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblEmprestimoMensagem.setForeground(Color.RED);
		lblEmprestimoMensagem.setBounds(62, 11, 362, 14);
		frame.getContentPane().add(lblEmprestimoMensagem);
		
		JLabel lblReentradaModelo = new JLabel("Modelo:");
		lblReentradaModelo.setBounds(10, 45, 46, 14);
		frame.getContentPane().add(lblReentradaModelo);
		
		JLabel lblReentradaNdeSerie = new JLabel("N\u00BA de s\u00E9rie:");
		lblReentradaNdeSerie.setBounds(10, 114, 69, 14);
		frame.getContentPane().add(lblReentradaNdeSerie);
		
		JLabel lblReentradaCalibre = new JLabel("Calibre:");
		lblReentradaCalibre.setBounds(10, 181, 46, 14);
		frame.getContentPane().add(lblReentradaCalibre);
		
		JButton btnReentradaReentrar = new JButton("Reentrar");
		btnReentradaReentrar.setBounds(151, 319, 115, 23);
		frame.getContentPane().add(btnReentradaReentrar);
		
		JLabel lblReentradaEspecie = new JLabel("Esp\u00E9cie:");
		lblReentradaEspecie.setBounds(10, 245, 69, 14);
		frame.getContentPane().add(lblReentradaEspecie);
		
		textFieldReentradaEspecie = new JTextField();
		textFieldReentradaEspecie.setBounds(10, 270, 86, 20);
		frame.getContentPane().add(textFieldReentradaEspecie);
		textFieldReentradaEspecie.setColumns(10);
		
		JRadioButton rdbtnReentradaMunicao = new JRadioButton("Muni\u00E7\u00E3o");
		rdbtnReentradaMunicao.setBounds(301, 41, 109, 23);
		frame.getContentPane().add(rdbtnReentradaMunicao);
		
		textFieldReentradaMunCalibre = new JTextField();
		textFieldReentradaMunCalibre.setBounds(324, 84, 86, 20);
		frame.getContentPane().add(textFieldReentradaMunCalibre);
		textFieldReentradaMunCalibre.setColumns(10);
		
		textFieldReentradaMunQuantidade = new JTextField();
		textFieldReentradaMunQuantidade.setBounds(324, 137, 86, 20);
		frame.getContentPane().add(textFieldReentradaMunQuantidade);
		textFieldReentradaMunQuantidade.setColumns(10);
		
		JLabel lblReentradaMunCalibre = new JLabel("Calibre:");
		lblReentradaMunCalibre.setBounds(268, 87, 46, 14);
		frame.getContentPane().add(lblReentradaMunCalibre);
		
		JLabel lblReentradaMunQuantidade = new JLabel("Quantidade:");
		lblReentradaMunQuantidade.setBounds(236, 140, 78, 14);
		frame.getContentPane().add(lblReentradaMunQuantidade);
		
		JButton btnReentradaVoltar = new JButton("Voltar");
		btnReentradaVoltar.setBounds(321, 319, 89, 23);
		frame.getContentPane().add(btnReentradaVoltar);
	}
}
