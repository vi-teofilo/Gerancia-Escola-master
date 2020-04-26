package view;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class MenuView {
	
	
	// declaração de variaveis 
	private JFrame janela;
	private JPanel painelDaJanela;
	private JMenuBar barraMenu;
	private JMenu menu01;
	private JMenu menu02;
	private JMenuItem itemMenu11;
	private JMenuItem itemMenu12;
	private JMenuItem itemMenu13;
	private JMenuItem itemMenu14;
	private JMenuItem itemMenu21;
	private JMenuItem itemMenu22;

	public MenuView() {
		
	}

	public void iniciaMenu() {
		janela = new JFrame();
		painelDaJanela = (JPanel) janela.getContentPane();
		barraMenu = new JMenuBar();
		menu01 = new JMenu("Cadastro");
		menu02 = new JMenu("Relatorio");
		itemMenu11 = new JMenuItem("Alunos");
		itemMenu12 = new JMenuItem("Funcionários");
		itemMenu13 = new JMenuItem("Cidade");
		itemMenu14 = new JMenuItem("Estado");
		itemMenu21 = new JMenuItem("Alunos");
		itemMenu22 = new JMenuItem("Funcionários");
		
		// Criando Menu
		barraMenu.add(menu01);
		barraMenu.add(menu02);
		menu01.add(itemMenu11);
		menu01.add(itemMenu12);
		menu01.add(itemMenu13);
		menu01.add(itemMenu14);
		menu02.add(itemMenu21);
		menu02.add(itemMenu22);


		// configuração de janela
		janela.setTitle("Início");
		janela.setSize(600, 600);
		janela.getContentPane().setLayout(null);
		janela.setLocationRelativeTo(null);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		painelDaJanela = (JPanel) janela.getContentPane();
		painelDaJanela.setBorder(BorderFactory.createEtchedBorder());

		
		// Linkando menu
		itemMenu11.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent e) {
				new AlunoView1().iniciaAluno();;
			}
		});

		itemMenu21.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent e) {
				new RelatorioView().iniciaGui2();
			}
		});
		
		itemMenu22.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			new RelatorioFuncView().iniciaGui2();	
			}
		});

		itemMenu13.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent e) {
				new CidadeView().cidadeView();

			}
		});
		itemMenu14.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent e) {
				new EstadoView().estadoView();

			}
		});
		itemMenu12.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent e) {
				new FuncionarioView().funcionarioView();
			}
		});
		


		// Adcionando o menu e a visibilidade
		janela.setJMenuBar(barraMenu);
		janela.setVisible(true);
	}
		
		
}
