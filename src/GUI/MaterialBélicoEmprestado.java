package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;

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
		textFieldEmprestadoHistorico.setBounds(10, 11, 414, 394);
		frame.getContentPane().add(textFieldEmprestadoHistorico);
		textFieldEmprestadoHistorico.setColumns(10);
		
		JButton btnEmprestadoReentrar = new JButton("Reentrar");
		btnEmprestadoReentrar.setBounds(167, 448, 89, 23);
		frame.getContentPane().add(btnEmprestadoReentrar);
	}
}
