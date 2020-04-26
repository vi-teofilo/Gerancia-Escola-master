package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import controller.AlunoController;

public class RelatorioView {
	private JFrame janela;
	private JPanel painelDaJanela;
	private JButton exibir;
	private JTextArea area;

	AlunoController aluno = new AlunoController();

	public RelatorioView() {

	}

	public RelatorioView(JFrame janela, JPanel painelDaJanela, JButton exibir, JTextArea area) {

		this.janela = janela;
		this.painelDaJanela = painelDaJanela;
		this.exibir = exibir;
		this.area = area;
	}

	public JFrame getJanela() {
		return janela;
	}

	public void setJanela(JFrame janela) {
		this.janela = janela;
	}

	public JPanel getPainelDaJanela() {
		return painelDaJanela;
	}

	public void setPainelDaJanela(JPanel painelDaJanela) {
		this.painelDaJanela = painelDaJanela;
	}

	public JButton getExibir() {
		return exibir;
	}

	public void setExibir(JButton exibir) {
		this.exibir = exibir;
	}

	public JTextArea getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area.append(area);
	}

	public void inicializar() {
		janela = new JFrame();
		painelDaJanela = (JPanel) janela.getContentPane();
		exibir = new JButton();
		area = new JTextArea();

	}

	public void iniciaGui2() {
		inicializar();

		// configuração de janela
		janela.setTitle("Relatorio de Aluno");
		janela.setSize(500, 670);
		janela.getContentPane().setLayout(null);
		janela.setLocationRelativeTo(null);
		janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		painelDaJanela = (JPanel) janela.getContentPane();
		painelDaJanela.setBorder(BorderFactory.createEtchedBorder());

		// configurar area
		area.setBounds(10, 10, 463, 570);
		area.setText(aluno.listarTodos());
		area.setEditable(false);
		area.setAutoscrolls(true);

		// configuração botão
		exibir.setText("Fechar");
		exibir.setBounds(180, 585, 120, 30);
		exibir.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				janela.dispose();
			}
		});

		// inclusão no painel
		painelDaJanela.add(area);
		painelDaJanela.add(exibir);

		janela.setVisible(true);

		aluno.listarTodos();
		new AlunoController().listarTodos();
	}

}