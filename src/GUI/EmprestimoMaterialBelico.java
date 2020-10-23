package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JRadioButton;

public class EmprestimoMaterialBelico {

	private JFrame frame;
	private JTextField textFieldEmprestimoModelo;
	private JTextField textFieldEmprestimoNdeSerie;
	private JTextField textFieldEmprestimoCalibre;
	private JTextField textFieldEmprestimoEspecie;
	private JTextField textFieldEmprestimoMunCalibre;
	private JTextField textFieldEmprestimoMunQuantidade;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmprestimoMaterialBelico window = new EmprestimoMaterialBelico();
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
	public EmprestimoMaterialBelico() {
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
		
		textFieldEmprestimoModelo = new JTextField();
		textFieldEmprestimoModelo.setBounds(10, 66, 86, 20);
		frame.getContentPane().add(textFieldEmprestimoModelo);
		textFieldEmprestimoModelo.setColumns(10);
		
		textFieldEmprestimoNdeSerie = new JTextField();
		textFieldEmprestimoNdeSerie.setBounds(10, 137, 86, 20);
		frame.getContentPane().add(textFieldEmprestimoNdeSerie);
		textFieldEmprestimoNdeSerie.setColumns(10);
		
		textFieldEmprestimoCalibre = new JTextField();
		textFieldEmprestimoCalibre.setBounds(10, 204, 86, 20);
		frame.getContentPane().add(textFieldEmprestimoCalibre);
		textFieldEmprestimoCalibre.setColumns(10);
		
		JLabel lblEmprestimoMensagem = new JLabel("EMPR\u00C9STIMO DE MATERIAL B\u00C9LICO");
		lblEmprestimoMensagem.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblEmprestimoMensagem.setForeground(Color.RED);
		lblEmprestimoMensagem.setBounds(62, 11, 362, 14);
		frame.getContentPane().add(lblEmprestimoMensagem);
		
		JLabel lblEmprestimoModelo = new JLabel("Modelo:");
		lblEmprestimoModelo.setBounds(10, 45, 46, 14);
		frame.getContentPane().add(lblEmprestimoModelo);
		
		JLabel lblEmprestimoNdeSerie = new JLabel("N\u00BA de s\u00E9rie:");
		lblEmprestimoNdeSerie.setBounds(10, 114, 69, 14);
		frame.getContentPane().add(lblEmprestimoNdeSerie);
		
		JLabel lblEmprestimoCalibre = new JLabel("Calibre:");
		lblEmprestimoCalibre.setBounds(10, 181, 46, 14);
		frame.getContentPane().add(lblEmprestimoCalibre);
		
		JButton btnEmprestimoRetirar = new JButton("Retirar");
		btnEmprestimoRetirar.setBounds(151, 319, 115, 23);
		frame.getContentPane().add(btnEmprestimoRetirar);
		
		JLabel lblEmprestimoEspecie = new JLabel("Esp\u00E9cie:");
		lblEmprestimoEspecie.setBounds(10, 245, 69, 14);
		frame.getContentPane().add(lblEmprestimoEspecie);
		
		textFieldEmprestimoEspecie = new JTextField();
		textFieldEmprestimoEspecie.setBounds(10, 270, 86, 20);
		frame.getContentPane().add(textFieldEmprestimoEspecie);
		textFieldEmprestimoEspecie.setColumns(10);
		
		JRadioButton rdbtnEmprestimoMunicao = new JRadioButton("Muni\u00E7\u00E3o");
		rdbtnEmprestimoMunicao.setBounds(301, 41, 109, 23);
		frame.getContentPane().add(rdbtnEmprestimoMunicao);
		
		textFieldEmprestimoMunCalibre = new JTextField();
		textFieldEmprestimoMunCalibre.setBounds(324, 84, 86, 20);
		frame.getContentPane().add(textFieldEmprestimoMunCalibre);
		textFieldEmprestimoMunCalibre.setColumns(10);
		
		textFieldEmprestimoMunQuantidade = new JTextField();
		textFieldEmprestimoMunQuantidade.setBounds(324, 137, 86, 20);
		frame.getContentPane().add(textFieldEmprestimoMunQuantidade);
		textFieldEmprestimoMunQuantidade.setColumns(10);
		
		JLabel lblEmprestimoMunCalibre = new JLabel("Calibre:");
		lblEmprestimoMunCalibre.setBounds(268, 87, 46, 14);
		frame.getContentPane().add(lblEmprestimoMunCalibre);
		
		JLabel lblEmprestimoMunQuantidade = new JLabel("Quantidade:");
		lblEmprestimoMunQuantidade.setBounds(236, 140, 78, 14);
		frame.getContentPane().add(lblEmprestimoMunQuantidade);
		
		JButton btnEmprestimoVoltar = new JButton("Voltar");
		btnEmprestimoVoltar.setBounds(321, 319, 89, 23);
		frame.getContentPane().add(btnEmprestimoVoltar);
	}
}
