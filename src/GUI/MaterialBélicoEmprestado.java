package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField;
import javax.swing.DropMode;
import javax.swing.JTextPane;

import negocio.CadastrarArmaDeFogo;

public class MaterialBélicoEmprestado {

	private JFrame frame;
	public JTextPane textPaneEmprestadoHistorico;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MaterialBélicoEmprestado window = new MaterialBélicoEmprestado();
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
	public MaterialBélicoEmprestado() {
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
		
		JButton btnEmprestadoReentrar = new JButton("Reentrar");
		btnEmprestadoReentrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ReentradaDeMaterialBélico();
				frame.setVisible(false);
			}
		});
		btnEmprestadoReentrar.setBounds(167, 448, 89, 23);
		frame.getContentPane().add(btnEmprestadoReentrar);
		
		JButton btnEmprestadoVoltar = new JButton("Voltar");
		btnEmprestadoVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new MenuPrincipal();
				frame.setVisible(false);
			}
		});
		btnEmprestadoVoltar.setBounds(335, 448, 89, 23);
		frame.getContentPane().add(btnEmprestadoVoltar);
		
		textPaneEmprestadoHistorico = new JTextPane();
		textPaneEmprestadoHistorico.setBounds(10, 11, 414, 409);
		frame.getContentPane().add(textPaneEmprestadoHistorico);
		textPaneEmprestadoHistorico.setText(CadastrarArmaDeFogo.getInstance().varrer());
		frame.setVisible(true);
	}
}
