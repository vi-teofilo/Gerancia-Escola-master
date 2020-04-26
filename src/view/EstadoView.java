package view;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import controller.AlunoController;
import controller.EstadoController;
import controller.FuncionarioController;

public class EstadoView {
	private JTextField txtuf;
	private JTextField txtestado;
	private JLabel lblestado;
	private JLabel lbluf;
	private JButton botaoCadastrar;
	private JButton botaoCancelar;
	private JFrame janela;
	private JPanel painelDaJanela;
	private JPanel painel4;
   EstadoController esd =new EstadoController();
	
	public void estadoView() {		
		
		
		txtestado = new JTextField();
		txtuf = new JTextField();
		try {
			javax.swing.text.MaskFormatter uf = new javax.swing.text.MaskFormatter("AA");
			txtuf= new javax.swing.JFormattedTextField(uf);
		} catch (Exception e1) {
		}
		
		lbluf = new JLabel();
		lblestado = new JLabel();
		botaoCadastrar = new JButton("Registrar");
		botaoCancelar = new JButton("Cancelar ");
		janela = new JFrame();
		painelDaJanela=(JPanel) janela.getContentPane();
		painel4 = new JPanel();

		
		lblestado.setText("Estado:");
		lblestado.setBounds(15,45, 220, 20);
		
		lbluf.setText("UF:");
		lbluf.setBounds(265, 45, 220, 20);
		
		txtestado.setBounds(65, 45, 190, 25);
		txtuf.setBounds(285, 45, 50, 25);
		
		botaoCancelar.setText("Cancelar");
		botaoCancelar.setBounds(70, 100, 90, 25);
		
        botaoCancelar.addActionListener(new ActionListener() {
			
		
			public void actionPerformed(ActionEvent e) {
				
				janela.dispose();
			}
		});
		
        botaoCadastrar.setText("Cadastrar");
		botaoCadastrar.setBounds(180, 100, 90, 25);
        
		botaoCadastrar.addActionListener(new ActionListener() {
			
			
			
			public void actionPerformed(ActionEvent e) {
				
				esd.cadastrar(txtestado.getText().toUpperCase(), txtuf.getText().toUpperCase());
				
				if(esd.isLimpar()) {
					esd.setLimpar(false);
					txtestado.setText("");
			}
			}});	
		
//		configuração do JPanel 4
		painel4.setBounds(4, 5, 365, 150);
		painel4.setLayout(new GridLayout(1,0,0,0));
		painel4.setBorder(new TitledBorder("Estado"));
		painelDaJanela.setLayout(null);
		painelDaJanela.add(painel4);
		
//		configurar a tela 
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setSize(390, 200);
		janela.setVisible(true);
		janela.setLocationRelativeTo(null);
		
		painelDaJanela.add(lbluf);
		painelDaJanela.add(txtuf);
		painelDaJanela.add(botaoCadastrar);
		painelDaJanela.add(botaoCancelar);
		painelDaJanela.add(lblestado);
		painelDaJanela.add(txtestado);
		painelDaJanela.add(painel4);
	}
	
}	

	
	


