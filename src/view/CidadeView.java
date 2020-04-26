package view;


import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import controller.CidadeController;



public class CidadeView {
	
	private JTextField txtcidade;
	private JLabel lblcidade;
	private JButton botaoCadastrar;
	private JButton botaoCancelar;
	private JFrame janela;
	private JPanel painelDaJanela;
	private JPanel painel4;
	CidadeController cc =new CidadeController();
	
	public void cidadeView() {		
		
//		Criar as instancia 
		txtcidade = new JTextField();
		lblcidade = new JLabel();
		botaoCadastrar = new JButton("Registrar");
		botaoCancelar = new JButton("Cancelar ");
		janela = new JFrame();
		painelDaJanela=(JPanel) janela.getContentPane();
		painel4 = new JPanel();

		
		lblcidade.setText("Cidade:");
		lblcidade.setBounds(20, 62, 350, 20);
		
		txtcidade.setBounds(65, 60, 190, 25);
		
		botaoCancelar.setText("Cancelar");
		botaoCancelar.setBounds(40, 120, 90, 20);
//		tratamento do botão cancelar 
		
		botaoCancelar.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				
				janela.dispose();
			}
		});
		
		botaoCadastrar.setText("Cadastrar");
		botaoCadastrar.setBounds(150, 120, 90, 20);
		

//		ação do botão cadastrar 
		
		botaoCadastrar.addActionListener(new ActionListener() {
			
			
		
			public void actionPerformed(ActionEvent e) {
				
				cc.cadastrar(txtcidade.getText().toUpperCase());
				
				if(cc.isLimpar()) {
					cc.setLimpar(false);
					txtcidade.setText("");
			}
			}});		
		
//		configuração do JPanel 4
		painel4.setBounds(4, 5, 300, 150);
		painel4.setLayout(new GridLayout(1,0,0,0));
		painel4.setBorder(new TitledBorder("Cidade"));
		painelDaJanela.setLayout(null);
		painelDaJanela.add(painel4);
		
//		configurar a tela 
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setSize(320, 200);
		janela.setVisible(true);
		janela.setLocationRelativeTo(null);
		
		painelDaJanela.add(botaoCadastrar);
		painelDaJanela.add(botaoCancelar);
		painelDaJanela.add(lblcidade);
		painelDaJanela.add(txtcidade);
		painelDaJanela.add(painel4);
		
	}
	
	
	
}
