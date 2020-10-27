package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuPrincipal {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuPrincipal window = new MenuPrincipal();
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
	public MenuPrincipal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 435);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblMenuPrincipal = new JLabel("MENU PRINCIPAL");
		lblMenuPrincipal.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblMenuPrincipal.setForeground(Color.RED);
		lblMenuPrincipal.setBounds(148, 11, 178, 14);
		frame.getContentPane().add(lblMenuPrincipal);
		
		JButton btnMenuArmaDeFogo = new JButton("Cadastro e guarda de arma de fogo");
		btnMenuArmaDeFogo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new CadastroGuardaArmaDeFogo();
				frame.setVisible(false);

			}
		});
		btnMenuArmaDeFogo.setBounds(10, 82, 276, 23);
		frame.getContentPane().add(btnMenuArmaDeFogo);
		
		JButton btnMenuMunicao = new JButton("Cadastro e guarda de muni\u00E7\u00F5es");
		btnMenuMunicao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new CadastroGuardaMunicao();
				frame.setVisible(false);
			}
		});
		btnMenuMunicao.setBounds(10, 142, 276, 23);
		frame.getContentPane().add(btnMenuMunicao);
		
		JButton btnMenuEmprestimo = new JButton("Empr\u00E9stimo de material b\u00E9lico");
		btnMenuEmprestimo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new EmprestimoMaterialBelico();
				frame.setVisible(false);
			}
		});
		btnMenuEmprestimo.setBounds(10, 201, 276, 23);
		frame.getContentPane().add(btnMenuEmprestimo);
		
		JButton btnMenuSaida = new JButton("Sa\u00EDda definitiva de material b\u00E9lico");
		btnMenuSaida.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new SaídaDefinitiva();
				frame.setVisible(false);
			}
		});
		btnMenuSaida.setBounds(10, 264, 276, 23);
		frame.getContentPane().add(btnMenuSaida);
		
		JButton btnMenuHistoricoEmprestado = new JButton("Material b\u00E9lico emprestado");
		btnMenuHistoricoEmprestado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new MaterialBélicoEmprestado();
				frame.setVisible(false);
			}
		});
		btnMenuHistoricoEmprestado.setBounds(10, 326, 276, 23);
		frame.getContentPane().add(btnMenuHistoricoEmprestado);
		
		JButton btnMenuVoltar = new JButton("Voltar");
		btnMenuVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new TelaDeLoginPrincipal();
				frame.setVisible(false);
			}
			
			
		});
		btnMenuVoltar.setBounds(318, 362, 89, 23);
		frame.getContentPane().add(btnMenuVoltar);
		
		frame.setVisible(true);
	}
}
