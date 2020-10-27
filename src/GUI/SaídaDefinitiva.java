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

public class SaídaDefinitiva {

	private JFrame frame;
	private JTextField textFieldDefinitivoModelo;
	private JTextField textFieldDefinitivoNdeSerie;
	private JTextField textFieldDefinitivoCalibre;
	private JTextField textFieldDefinitivoEspecie;
	private JTextField textFieldDefinitivoMunCalibre;
	private JTextField textFieldDefinitivoMunQuantidade;
	private	JRadioButton rdbtnDefinitivoMunicao;
	private final Action action = new SwingAction();
	private JTextField textFieldDefinitivoMarca;

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
		
		JLabel lblDefinitivoMensagem = new JLabel("Sa\u00EDda Definitiva de Material B\u00E9lico");
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
		
		rdbtnDefinitivoMunicao = new JRadioButton("Muni\u00E7\u00E3o");
		rdbtnDefinitivoMunicao.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(textFieldDefinitivoModelo.isEnabled()) {
					textFieldDefinitivoModelo.disable();
					textFieldDefinitivoModelo.setText(null);
					textFieldDefinitivoCalibre.disable();
					textFieldDefinitivoCalibre.setText(null);
					textFieldDefinitivoEspecie.disable();
					textFieldDefinitivoEspecie.setText(null);
					textFieldDefinitivoNdeSerie.disable();
					textFieldDefinitivoNdeSerie.setText(null);
					textFieldDefinitivoMarca.disable();
					textFieldDefinitivoMarca.setText(null);
					textFieldDefinitivoMunCalibre.enable();
					textFieldDefinitivoMunQuantidade.enable();
					}
					else{
					textFieldDefinitivoModelo.enable();
					textFieldDefinitivoCalibre.enable();
					textFieldDefinitivoEspecie.enable();
					textFieldDefinitivoNdeSerie.enable();
					textFieldDefinitivoMarca.enable();
					textFieldDefinitivoMunCalibre.disable();
					textFieldDefinitivoMunQuantidade.disable();
					textFieldDefinitivoMunCalibre.setText(null);
					textFieldDefinitivoMunQuantidade.setText(null);
					}
				
			}
		});
		
		JButton btnDefinitivoRetirar = new JButton("Retirar");
		btnDefinitivoRetirar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnDefinitivoMunicao.isSelected()) {
					if(textFieldDefinitivoMunCalibre.getText().isEmpty()||textFieldDefinitivoMunQuantidade.getText().isEmpty()) {
						JOptionPane.showMessageDialog(null, "Preencha todos os dados devidos !");
						}
					
				else {
					int valor;
					try {
						valor = Integer.parseInt(textFieldDefinitivoMunCalibre.getText());
						valor = Integer.parseInt(textFieldDefinitivoMunQuantidade.getText());
					}catch(NumberFormatException ex) {
						JOptionPane.showMessageDialog(null, "Digite apenas números !");
					}
					
				
						LocalDate date = LocalDate.now();
				
						Municao municao = new MunicaoPatrimonio(textFieldDefinitivoMunCalibre.getText(), "Munição", date, null, Integer.parseInt(textFieldDefinitivoMunQuantidade.getText()), null);
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
					if(textFieldDefinitivoCalibre.getText().isEmpty()||textFieldDefinitivoEspecie.getText().isEmpty()||textFieldDefinitivoModelo.getText().isEmpty()||textFieldDefinitivoNdeSerie.getText().isEmpty()||textFieldDefinitivoMarca.getText().isEmpty()) {
						JOptionPane.showMessageDialog(null, "Preencha todos dados devidos !");
						}
					else {
						int valor;
						try {
							valor = Integer.parseInt(textFieldDefinitivoCalibre.getText());
							valor = Integer.parseInt(textFieldDefinitivoNdeSerie.getText());
						}catch(NumberFormatException ex) {
							JOptionPane.showMessageDialog(null, "Digite apenas números !(Nº de série / Calibre");
						}
						valor = Integer.parseInt(textFieldDefinitivoCalibre.getText());
						valor = Integer.parseInt(textFieldDefinitivoNdeSerie.getText());
						LocalDate date = LocalDate.now();
						ArmaDeFogo arma = new ArmaDeFogo(textFieldDefinitivoCalibre.getText(), textFieldDefinitivoEspecie.getText(), date, null, textFieldDefinitivoMarca.getText(), textFieldDefinitivoModelo.getText(), textFieldDefinitivoNdeSerie.getText(), "ativa");
						if(CadastrarArmaDeFogo.getInstance().encontradoDefinitivo(arma)) {
							
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
		btnDefinitivoRetirar.setBounds(151, 319, 115, 23);
		frame.getContentPane().add(btnDefinitivoRetirar);
		
		JLabel lblDefinitivoEspecie = new JLabel("Esp\u00E9cie:");
		lblDefinitivoEspecie.setBounds(10, 245, 69, 14);
		frame.getContentPane().add(lblDefinitivoEspecie);
		
		textFieldDefinitivoEspecie = new JTextField();
		textFieldDefinitivoEspecie.setBounds(10, 270, 86, 20);
		frame.getContentPane().add(textFieldDefinitivoEspecie);
		textFieldDefinitivoEspecie.setColumns(10);
		

	

	
	
	
	

		rdbtnDefinitivoMunicao.setBounds(301, 41, 109, 23);
		frame.getContentPane().add(rdbtnDefinitivoMunicao);
		
		textFieldDefinitivoMunCalibre = new JTextField();
		textFieldDefinitivoMunCalibre.setEnabled(false);
	
		textFieldDefinitivoMunCalibre.setBounds(324, 84, 86, 20);
		frame.getContentPane().add(textFieldDefinitivoMunCalibre);
		textFieldDefinitivoMunCalibre.setColumns(10);
		
		textFieldDefinitivoMunQuantidade = new JTextField();
		textFieldDefinitivoMunQuantidade.setEnabled(false);
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
		btnDefinitivoVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new MenuPrincipal();
				frame.setVisible(false);
			}
		});
		btnDefinitivoVoltar.setBounds(321, 319, 89, 23);
		frame.getContentPane().add(btnDefinitivoVoltar);
		
		textFieldDefinitivoMarca = new JTextField();
		textFieldDefinitivoMarca.setBounds(118, 66, 86, 20);
		frame.getContentPane().add(textFieldDefinitivoMarca);
		textFieldDefinitivoMarca.setColumns(10);
		
		JLabel lblDefinitivoMarca = new JLabel("Marca:");
		lblDefinitivoMarca.setBounds(113, 45, 46, 14);
		frame.getContentPane().add(lblDefinitivoMarca);
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