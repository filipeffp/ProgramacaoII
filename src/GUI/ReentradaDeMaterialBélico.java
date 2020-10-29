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

public class ReentradaDeMaterialBélico {

	private JFrame frame;
	private JTextField textFieldReentradaModelo;
	private JTextField textFieldReentradaNdeSerie;
	private JTextField textFieldReentradaCalibre;
	private JTextField textFieldReentradaEspecie;
	private JTextField textFieldReentradaMunCalibre;
	private JTextField textFieldReentradaMunQuantidade;
	private	JRadioButton rdbtnReentradaMunicao;
	private final Action action = new SwingAction();
	private JTextField textFieldReentradaMarca;

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
		
		JLabel lblReentradaMensagem = new JLabel("Reentrada de Material B\u00E9lico");
		lblReentradaMensagem.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblReentradaMensagem.setForeground(Color.RED);
		lblReentradaMensagem.setBounds(109, 11, 362, 14);
		frame.getContentPane().add(lblReentradaMensagem);
		
		JLabel lblReentradaModelo = new JLabel("Modelo:");
		lblReentradaModelo.setBounds(10, 45, 46, 14);
		frame.getContentPane().add(lblReentradaModelo);
		
		JLabel lblReentradaNdeSerie = new JLabel("N\u00BA de s\u00E9rie:");
		lblReentradaNdeSerie.setBounds(10, 114, 69, 14);
		frame.getContentPane().add(lblReentradaNdeSerie);
		
		JLabel lblReentradaCalibre = new JLabel("Calibre:");
		lblReentradaCalibre.setBounds(10, 181, 46, 14);
		frame.getContentPane().add(lblReentradaCalibre);
		
		rdbtnReentradaMunicao = new JRadioButton("Muni\u00E7\u00E3o");
		rdbtnReentradaMunicao.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(textFieldReentradaModelo.isEnabled()) {
					textFieldReentradaModelo.disable();
					textFieldReentradaModelo.setText(null);
					textFieldReentradaCalibre.disable();
					textFieldReentradaCalibre.setText(null);
					textFieldReentradaEspecie.disable();
					textFieldReentradaEspecie.setText(null);
					textFieldReentradaNdeSerie.disable();
					textFieldReentradaNdeSerie.setText(null);
					textFieldReentradaMarca.disable();
					textFieldReentradaMarca.setText(null);
					textFieldReentradaMunCalibre.enable();
					textFieldReentradaMunQuantidade.enable();
					}
					else{
					textFieldReentradaModelo.enable();
					textFieldReentradaCalibre.enable();
					textFieldReentradaEspecie.enable();
					textFieldReentradaNdeSerie.enable();
					textFieldReentradaMarca.enable();
					textFieldReentradaMunCalibre.disable();
					textFieldReentradaMunQuantidade.disable();
					textFieldReentradaMunCalibre.setText(null);
					textFieldReentradaMunQuantidade.setText(null);
					}
				
			}
		});
		
		JButton btnReentradaRetirar = new JButton("Reentrar");
		btnReentradaRetirar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnReentradaMunicao.isSelected()) {
					if(textFieldReentradaMunCalibre.getText().isEmpty()||textFieldReentradaMunQuantidade.getText().isEmpty()) {
						JOptionPane.showMessageDialog(null, "Preencha todos os dados devidos !");
						}
					
				else {
					int valor;
					try {
						valor = Integer.parseInt(textFieldReentradaMunCalibre.getText());
						valor = Integer.parseInt(textFieldReentradaMunQuantidade.getText());
					}catch(NumberFormatException ex) {
						JOptionPane.showMessageDialog(null, "Digite apenas números !");
					}
					
				
						LocalDate date = LocalDate.now();
				
						Municao municao = new MunicaoPatrimonio(textFieldReentradaMunCalibre.getText(), "Munição", date, null, Integer.parseInt(textFieldReentradaMunQuantidade.getText()), null);
						if(CadastrarMunicao.getInstance().checar(municao)) {
							CadastrarMunicao.getInstance().retirar(municao);
							JOptionPane.showMessageDialog(null, "Reentrada feita");
							new MenuPrincipal();
							frame.setVisible(false);
						}
						else {
							JOptionPane.showMessageDialog(null, "Material não encontrado !");
						}
					
					
					
				}
				}
				else {
					if(textFieldReentradaCalibre.getText().isEmpty()||textFieldReentradaEspecie.getText().isEmpty()||textFieldReentradaModelo.getText().isEmpty()||textFieldReentradaNdeSerie.getText().isEmpty()||textFieldReentradaMarca.getText().isEmpty()) {
						JOptionPane.showMessageDialog(null, "Preencha todos dados devidos !");
						}
					else {
						int valor;
						try {
							valor = Integer.parseInt(textFieldReentradaCalibre.getText());
							valor = Integer.parseInt(textFieldReentradaNdeSerie.getText());
						}catch(NumberFormatException ex) {
							JOptionPane.showMessageDialog(null, "Digite apenas números !(Nº de série / Calibre");
						}
						valor = Integer.parseInt(textFieldReentradaCalibre.getText());
						valor = Integer.parseInt(textFieldReentradaNdeSerie.getText());
						LocalDate date = LocalDate.now();
						ArmaDeFogo arma = new ArmaDeFogo(textFieldReentradaCalibre.getText(), textFieldReentradaEspecie.getText(), date, null, textFieldReentradaMarca.getText(), textFieldReentradaModelo.getText(), textFieldReentradaNdeSerie.getText(), "ativa");
						if(CadastrarArmaDeFogo.getInstance().encontradoReentrada(arma)) {
							
							JOptionPane.showMessageDialog(null, "Reentrada feita");
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
		btnReentradaRetirar.setBounds(151, 319, 115, 23);
		frame.getContentPane().add(btnReentradaRetirar);
		
		JLabel lblReentradaEspecie = new JLabel("Esp\u00E9cie:");
		lblReentradaEspecie.setBounds(10, 245, 69, 14);
		frame.getContentPane().add(lblReentradaEspecie);
		
		textFieldReentradaEspecie = new JTextField();
		textFieldReentradaEspecie.setBounds(10, 270, 86, 20);
		frame.getContentPane().add(textFieldReentradaEspecie);
		textFieldReentradaEspecie.setColumns(10);
		

	

	
	
	
	

		rdbtnReentradaMunicao.setBounds(301, 41, 109, 23);
		frame.getContentPane().add(rdbtnReentradaMunicao);
		
		textFieldReentradaMunCalibre = new JTextField();
		textFieldReentradaMunCalibre.setEnabled(false);
	
		textFieldReentradaMunCalibre.setBounds(324, 84, 86, 20);
		frame.getContentPane().add(textFieldReentradaMunCalibre);
		textFieldReentradaMunCalibre.setColumns(10);
		
		textFieldReentradaMunQuantidade = new JTextField();
		textFieldReentradaMunQuantidade.setEnabled(false);
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
		btnReentradaVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new MenuPrincipal();
				frame.setVisible(false);
			}
		});
		btnReentradaVoltar.setBounds(321, 319, 89, 23);
		frame.getContentPane().add(btnReentradaVoltar);
		
		textFieldReentradaMarca = new JTextField();
		textFieldReentradaMarca.setBounds(118, 66, 86, 20);
		frame.getContentPane().add(textFieldReentradaMarca);
		textFieldReentradaMarca.setColumns(10);
		
		JLabel lblReentradaMarca = new JLabel("Marca:");
		lblReentradaMarca.setBounds(113, 45, 46, 14);
		frame.getContentPane().add(lblReentradaMarca);
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
