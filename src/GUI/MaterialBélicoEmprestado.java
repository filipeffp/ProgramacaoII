package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MaterialBélicoEmprestado {

	private JFrame frame;
	private JTextField textFieldEmprestadoHistorico;

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
		
		textFieldEmprestadoHistorico = new JTextField();
		textFieldEmprestadoHistorico.setEditable(false);
		textFieldEmprestadoHistorico.setBounds(10, 11, 414, 394);
		frame.getContentPane().add(textFieldEmprestadoHistorico);
		textFieldEmprestadoHistorico.setColumns(10);
		
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
		frame.setVisible(true);
	}
}
