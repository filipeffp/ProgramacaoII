package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.event.ChangeListener;

import negocio.CadastrarArmaDeFogo;
import negocio.CadastrarMunicao;
import negocio.beans.ArmaDeFogo;
import negocio.beans.Municao;
import negocio.beans.MunicaoPatrimonio;

import javax.swing.event.ChangeEvent;
import java.beans.PropertyChangeListener;
import java.time.LocalDate;
import java.beans.PropertyChangeEvent;

public class EmprestimoMaterialBelico {

	private JFrame frame;
	private JTextField textFieldEmprestimoModelo;
	private JTextField textFieldEmprestimoNdeSerie;
	private JTextField textFieldEmprestimoCalibre;
	private JTextField textFieldEmprestimoEspecie;
	private JTextField textFieldEmprestimoMunCalibre;
	private JTextField textFieldEmprestimoMunQuantidade;
	private	JRadioButton rdbtnEmprestimoMunicao;
	private final Action action = new SwingAction();
	private JTextField textFieldEmprestimoMarca;

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
		
		rdbtnEmprestimoMunicao = new JRadioButton("Muni\u00E7\u00E3o");
		rdbtnEmprestimoMunicao.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(textFieldEmprestimoModelo.isEnabled()) {
					textFieldEmprestimoModelo.disable();
					textFieldEmprestimoModelo.setText(null);
					textFieldEmprestimoCalibre.disable();
					textFieldEmprestimoCalibre.setText(null);
					textFieldEmprestimoEspecie.disable();
					textFieldEmprestimoEspecie.setText(null);
					textFieldEmprestimoNdeSerie.disable();
					textFieldEmprestimoNdeSerie.setText(null);
					textFieldEmprestimoMarca.disable();
					textFieldEmprestimoMarca.setText(null);
					textFieldEmprestimoMunCalibre.enable();
					textFieldEmprestimoMunQuantidade.enable();
					}
					else{
					textFieldEmprestimoModelo.enable();
					textFieldEmprestimoCalibre.enable();
					textFieldEmprestimoEspecie.enable();
					textFieldEmprestimoNdeSerie.enable();
					textFieldEmprestimoMarca.enable();
					textFieldEmprestimoMunCalibre.disable();
					textFieldEmprestimoMunQuantidade.disable();
					textFieldEmprestimoMunCalibre.setText(null);
					textFieldEmprestimoMunQuantidade.setText(null);
					}
				
			}
		});
		
		JButton btnEmprestimoRetirar = new JButton("Retirar");
		btnEmprestimoRetirar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnEmprestimoMunicao.isSelected()) {
					if(textFieldEmprestimoMunCalibre.getText().isEmpty()||textFieldEmprestimoMunQuantidade.getText().isEmpty()) {
						JOptionPane.showMessageDialog(null, "Preencha todos os dados devidos !");
						}
					
				else {
					int valor;
					try {
						valor = Integer.parseInt(textFieldEmprestimoMunCalibre.getText());
						valor = Integer.parseInt(textFieldEmprestimoMunQuantidade.getText());
					}catch(NumberFormatException ex) {
						JOptionPane.showMessageDialog(null, "Digite apenas números !");
					}
					
				
						LocalDate date = LocalDate.now();
				
						Municao municao = new MunicaoPatrimonio(textFieldEmprestimoMunCalibre.getText(), "Munição", date, null, Integer.parseInt(textFieldEmprestimoMunQuantidade.getText()), null);
						if(CadastrarMunicao.getInstance().checar(municao)) {
							CadastrarMunicao.getInstance().retirar(municao);
							JOptionPane.showMessageDialog(null, "Retirado");
							new MenuPrincipal();
							frame.setVisible(false);
						}
						else {
							JOptionPane.showMessageDialog(null, "Material não encontrado !");
						}
					
					
					
				}
				}
				else {
					if(textFieldEmprestimoCalibre.getText().isEmpty()||textFieldEmprestimoEspecie.getText().isEmpty()||textFieldEmprestimoModelo.getText().isEmpty()||textFieldEmprestimoNdeSerie.getText().isEmpty()||textFieldEmprestimoMarca.getText().isEmpty()) {
						JOptionPane.showMessageDialog(null, "Preencha todos dados devidos !");
						}
					else {
						int valor;
						try {
							valor = Integer.parseInt(textFieldEmprestimoCalibre.getText());
							valor = Integer.parseInt(textFieldEmprestimoNdeSerie.getText());
						}catch(NumberFormatException ex) {
							JOptionPane.showMessageDialog(null, "Digite apenas números !(Nº de série / Calibre");
						}
						valor = Integer.parseInt(textFieldEmprestimoCalibre.getText());
						valor = Integer.parseInt(textFieldEmprestimoNdeSerie.getText());
						LocalDate date = LocalDate.now();
						ArmaDeFogo arma = new ArmaDeFogo(textFieldEmprestimoCalibre.getText(), textFieldEmprestimoEspecie.getText(), date, null, textFieldEmprestimoMarca.getText(), textFieldEmprestimoModelo.getText(), textFieldEmprestimoNdeSerie.getText(), "ativa");
						if(CadastrarArmaDeFogo.getInstance().encontradoRetirado(arma)) {
							
							JOptionPane.showMessageDialog(null, "Retirado");
							new MenuPrincipal();
							frame.setVisible(false);
							
						}
						
						else {
							JOptionPane.showMessageDialog(null, "Material não encontrado !");
						}
					}
					
					
				}
			}
		});
		btnEmprestimoRetirar.setBounds(151, 319, 115, 23);
		frame.getContentPane().add(btnEmprestimoRetirar);
		
		JLabel lblEmprestimoEspecie = new JLabel("Esp\u00E9cie:");
		lblEmprestimoEspecie.setBounds(10, 245, 69, 14);
		frame.getContentPane().add(lblEmprestimoEspecie);
		
		textFieldEmprestimoEspecie = new JTextField();
		textFieldEmprestimoEspecie.setBounds(10, 270, 86, 20);
		frame.getContentPane().add(textFieldEmprestimoEspecie);
		textFieldEmprestimoEspecie.setColumns(10);
		

	

	
	
	
	

		rdbtnEmprestimoMunicao.setBounds(301, 41, 109, 23);
		frame.getContentPane().add(rdbtnEmprestimoMunicao);
		
		textFieldEmprestimoMunCalibre = new JTextField();
		textFieldEmprestimoMunCalibre.setEnabled(false);
	
		textFieldEmprestimoMunCalibre.setBounds(324, 84, 86, 20);
		frame.getContentPane().add(textFieldEmprestimoMunCalibre);
		textFieldEmprestimoMunCalibre.setColumns(10);
		
		textFieldEmprestimoMunQuantidade = new JTextField();
		textFieldEmprestimoMunQuantidade.setEnabled(false);
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
		btnEmprestimoVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new MenuPrincipal();
				frame.setVisible(false);
			}
		});
		btnEmprestimoVoltar.setBounds(321, 319, 89, 23);
		frame.getContentPane().add(btnEmprestimoVoltar);
		
		textFieldEmprestimoMarca = new JTextField();
		textFieldEmprestimoMarca.setBounds(118, 66, 86, 20);
		frame.getContentPane().add(textFieldEmprestimoMarca);
		textFieldEmprestimoMarca.setColumns(10);
		
		JLabel lblEmprestimoMarca = new JLabel("Marca:");
		lblEmprestimoMarca.setBounds(113, 45, 46, 14);
		frame.getContentPane().add(lblEmprestimoMarca);
		frame.setVisible(true);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
