package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CadastroGuardaMunicao {

	private JFrame frame;
	private JTextField textCadastroMunicaoQuantidade;
	private JTextField textFieldCadastroMunicaoCalibre;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroGuardaMunicao window = new CadastroGuardaMunicao();
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
	public CadastroGuardaMunicao() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 280);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textCadastroMunicaoQuantidade = new JTextField();
		textCadastroMunicaoQuantidade.setBounds(10, 89, 86, 20);
		frame.getContentPane().add(textCadastroMunicaoQuantidade);
		textCadastroMunicaoQuantidade.setColumns(10);
		
		textFieldCadastroMunicaoCalibre = new JTextField();
		textFieldCadastroMunicaoCalibre.setBounds(10, 145, 86, 20);
		frame.getContentPane().add(textFieldCadastroMunicaoCalibre);
		textFieldCadastroMunicaoCalibre.setColumns(10);
		
		JLabel lblCadastroMunicaoMensagem = new JLabel("CADASTRO/GUARDA DE MUNI\u00C7\u00C3O");
		lblCadastroMunicaoMensagem.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCadastroMunicaoMensagem.setForeground(Color.RED);
		lblCadastroMunicaoMensagem.setBounds(62, 11, 362, 14);
		frame.getContentPane().add(lblCadastroMunicaoMensagem);
		
		JLabel lblCadastroMunicaoQuantidade = new JLabel("Quantidade:");
		lblCadastroMunicaoQuantidade.setBounds(10, 61, 69, 14);
		frame.getContentPane().add(lblCadastroMunicaoQuantidade);
		
		JLabel lblCadastroMunicaoCalibre = new JLabel("Calibre:");
		lblCadastroMunicaoCalibre.setBounds(10, 120, 46, 14);
		frame.getContentPane().add(lblCadastroMunicaoCalibre);
		
		JButton btnCadastroMunicaoCadastrar = new JButton("Cadastrar");
		btnCadastroMunicaoCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCadastroMunicaoCadastrar.setBounds(153, 197, 115, 23);
		frame.getContentPane().add(btnCadastroMunicaoCadastrar);
	}
}
