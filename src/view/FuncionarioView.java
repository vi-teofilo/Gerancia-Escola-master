package view;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import controller.AlunoController;
import controller.FuncionarioController;

public class FuncionarioView {
	private JComboBox jCom;
	private JFrame janela;
	private JPanel painelDaJanela;
	private JPanel painel4;

	private JLabel lblNome;
	private JLabel lblcpf;
	private JLabel lblMateria;
	private JLabel lblnumero;
	private JLabel lblcidade;
	private JLabel lblestado;
	private JLabel lbllogradouro;
	private JLabel lblrg;
	private JLabel lblBairro;
	private JLabel lblSalario;
	private JLabel lblComplemento;
	private JLabel lblOcupacao;
	private JLabel lblRamal;
	private JLabel lblTelefone;
	private JLabel lblTurno;
	private JLabel lblIncluirMateria;
	private JLabel lblDataNasc;

	private JTextField txtNome;
	private JTextField txtcpf;
	private JTextField txtSalario;
	private JTextField txtMateria;
	private JTextField txtrg;
	private JTextField txtLogradouro;
	private JTextField txtNumero;
	private JTextField txtComplemento;
	private JTextField txtBairro;
	private JTextField txtTelefone;
	private JTextField txtRamal;
	private JTextField jtfIncluirMateria;
	private JTextField txtDataNasc;

	private JComboBox cboxCidade;
	private JComboBox cboxEstado;

	private JButton botaoCadastrar;
	private JButton botaoCancelar;
	private JButton botaoIncluir;
	private JButton botaoExcluir;
	private JRadioButton rbtDiurno;
	private JRadioButton rbtNoturno;
	private ButtonGroup grpRadio;

	private JTable tabela;

	private JScrollPane painelDeScroll;

	private String[] colunas = new String[] { "Materia" };
	private String[][] dados = new String[][] {};

	FuncionarioController func = new FuncionarioController();

	public FuncionarioView() {

	}

	public void funcionarioView() {
//		criar as instancia das classes 

		janela = new JFrame();
		painelDaJanela = (JPanel) janela.getContentPane();
		painel4 = new JPanel();

		lblOcupacao = new JLabel();
		jCom = new JComboBox();
		janela = new JFrame();
		lblDataNasc = new JLabel();
		lblNome = new JLabel("Nome:");
		lblcpf = new JLabel("CPF: ");
		lblSalario = new JLabel("Salário: ");
		lblMateria = new JLabel("Materia");
		txtNome = new JTextField();
		txtcpf = new JTextField();
		txtSalario = new JTextField();
		txtMateria = new JTextField();
		txtDataNasc = new JTextField();
		lblNome = new JLabel();
		txtNome = new JTextField();
		lblrg = new JLabel();
		txtrg = new JTextField();
		lblcpf = new JLabel();
		txtcpf = new JTextField();
		lbllogradouro = new JLabel();
		txtLogradouro = new JTextField();
		lblnumero = new JLabel();
		txtNumero = new JTextField();
		lblComplemento = new JLabel();
		txtComplemento = new JTextField();
		lblBairro = new JLabel();
		txtBairro = new JTextField();
		lblcidade = new JLabel();
		lblestado = new JLabel();
		cboxEstado = new JComboBox();
		cboxCidade = new JComboBox();
		lblTelefone = new JLabel();
		txtTelefone = new JTextField();
		lblRamal = new JLabel();
		txtRamal = new JTextField();
		rbtDiurno = new JRadioButton("Diurno");
		rbtNoturno = new JRadioButton("Noturno");
		grpRadio = new ButtonGroup();
		lblTurno = new JLabel("Turno");
		jtfIncluirMateria = new JTextField();
		botaoIncluir = new JButton("Incluír");
		botaoExcluir = new JButton("Excluír");
		botaoCadastrar = new JButton("Cadastrar");
		botaoCancelar = new JButton("Cancelar");
		lblIncluirMateria = new JLabel("Materia:");
		

		jCom.setBounds(120, 30, 370, 25);
		jCom.setBackground(Color.WHITE);
		jCom.addItem("");
		jCom.addItem("Professor");
		jCom.addItem("Secretaria");
		jCom.addItem("Faxineira");
		jCom.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if (jCom.getSelectedIndex() == 1) {
					exibirCProfessor();
				} else if (jCom.getSelectedIndex() == 2) {
					exibirCSecretaria();
				} else if (jCom.getSelectedIndex() == 3) {
					exibirCFaxineira();
				}
			}

		});

//			tratamento das Jlabel
		// combo
		lblOcupacao.setText("Funcionário: ");
		lblOcupacao.setBounds(20, 35, 100, 20);
		// Nome
		lblNome.setText("Nome: ");
		lblNome.setBounds(20, 80, 100, 20);

		// Rg
		lblrg.setText("RG: ");
		lblrg.setBounds(20, 115, 80, 20);

		// CPF
		lblcpf.setText("CPF:");
		lblcpf.setBounds(170, 115, 100, 20);

		lblSalario.setText("Salario:");
		lblSalario.setBounds(20, 150, 80, 20);

		// telefone
		lblTelefone.setText("Telefone: ");
		lblTelefone.setBounds(170, 150, 150, 20);
		// Logradouro
		lbllogradouro.setText("Logradouro: ");
		lbllogradouro.setBounds(20, 180, 80, 20);
		// número
		lblnumero.setText("Nº:");
		lblnumero.setBounds(475, 180, 400, 20);
		// complemento
		lblComplemento.setText("Complemento:");
		lblComplemento.setBounds(20, 248, 120, 20);
		// bairro
		lblBairro.setText("Bairro:");
		lblBairro.setBounds(265, 248, 80, 20);

		// Cidade
		lblcidade.setText("Cidade: ");
		lblcidade.setBounds(20, 212, 80, 20);
//		lblcidade.setVisible(false);

		// Estado
		lblestado.setText("Estado: ");
		lblestado.setBounds(244, 212, 120, 20);
		cboxEstado.setBounds(290, 212, 60, 25);
		// Ramal
		lblRamal.setText("Ramal");
		lblRamal.setBounds(30, 390, 120, 20);
		// data
		lblDataNasc.setText("Data Nascimento: ");
		lblDataNasc.setBounds(330, 150, 120, 20);
		
//			tratamento dos txt
		try {
			javax.swing.text.MaskFormatter dt = new javax.swing.text.MaskFormatter("##/##/####");
			txtDataNasc = new javax.swing.JFormattedTextField(dt);
		} catch (Exception e) {
		}
		txtDataNasc.setBounds(430, 145, 120, 25);
		
		txtNome.setBounds(70, 80, 370, 25);

		try {
			javax.swing.text.MaskFormatter dt = new javax.swing.text.MaskFormatter("###.###.###-##");
			txtcpf = new javax.swing.JFormattedTextField(dt);
		} catch (Exception e) {
		}
		txtcpf.setBounds(200, 110, 140, 25);

		try {
			javax.swing.text.MaskFormatter dt = new javax.swing.text.MaskFormatter("##.###.###-#");
			txtrg = new javax.swing.JFormattedTextField(dt);
		} catch (Exception e) {
		}
		txtrg.setBounds(70, 110, 92, 25);

		try {
			javax.swing.text.MaskFormatter dt = new javax.swing.text.MaskFormatter("R$#.###,##");
			txtSalario = new javax.swing.JFormattedTextField(dt);
		} catch (Exception e) {
		}
		txtSalario.setBounds(70, 145, 90, 25);

		try {
			javax.swing.text.MaskFormatter dt = new javax.swing.text.MaskFormatter("(##)####-####");
			txtTelefone = new javax.swing.JFormattedTextField(dt);
		} catch (Exception e) {
		}
		txtTelefone.setBounds(225, 145, 100, 25);

		txtLogradouro.setBounds(90, 178, 370, 25);

		txtNumero.setBounds(490, 178, 50, 25);

		txtComplemento.setBounds(100, 245, 160, 25);

		txtBairro.setBounds(300, 245, 170, 25);

		String quebra[] = func.pegarEstado().split(";");

		for (int i = 0; i < quebra.length; i++) {
			cboxEstado.addItem(quebra[i]);
		}

		cboxEstado.setSelectedIndex(-1);

		cboxEstado.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				preencherCidades();
			}

		});

		cboxCidade.setSelectedIndex(-1);
		cboxCidade.setBounds(70, 210, 170, 25);
//		cboxCidade.setVisible(false);

		try {
			javax.swing.text.MaskFormatter dt = new javax.swing.text.MaskFormatter("####");
			txtRamal = new javax.swing.JFormattedTextField(dt);
		} catch (Exception e) {
		}
		txtRamal.setBounds(120, 390, 100, 25);
		lblRamal.setVisible(false);
		txtRamal.setVisible(false);

		// Criando Grupo
		grpRadio.add(rbtDiurno);
		grpRadio.add(rbtNoturno);
		lblTurno.setBounds(20, 390, 120, 20);
		rbtDiurno.setBounds(110, 390, 100, 20);
		rbtNoturno.setBounds(110, 410, 100, 20);
		lblTurno.setVisible(false);
		rbtDiurno.setVisible(false);
		rbtNoturno.setVisible(false);

		DefaultTableModel modelo = new DefaultTableModel(dados, colunas);
		tabela = new JTable(modelo);
		tabela.setEnabled(true);
		painelDeScroll = new JScrollPane(tabela);
		painelDeScroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

		// configuração de tamanho dos componentes da tela
		painelDeScroll.setBounds(30, 330, 360, 95);
		tabela.setBounds(10, 30, 300, 95);

		
		botaoIncluir.setBounds(200, 300, 100, 20);
		botaoExcluir.setBounds(300, 300, 100, 20);
		lblIncluirMateria.setBounds(20, 300, 70, 20);
		jtfIncluirMateria.setBounds(70, 299, 110, 25);
//		txtMateria.setBounds(100,300, 160, 25);

		painelDeScroll.setVisible(false);
		botaoIncluir.setVisible(false);
		botaoIncluir.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				adicionaLinha();
			}
		});
		botaoExcluir.setVisible(false);
		botaoExcluir.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				excluirLinha();
			}
		});

		lblIncluirMateria.setVisible(false);
		jtfIncluirMateria.setVisible(false);
		
		botaoCancelar.setBounds(200, 470, 100, 25);
		botaoCancelar.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				
				janela.dispose();
			}
		});

		botaoCadastrar.setBounds(320, 470, 100, 25);
		botaoCadastrar.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				
				try {
					FuncionarioController func = new FuncionarioController();
					func.funcionario(txtDataNasc.getText(), txtNome.getText(), txtcpf.getText(),
							txtrg.getText(), txtTelefone.getText(),txtSalario.getText(), txtLogradouro.getText(), txtBairro.getText(),
							cboxEstado.getSelectedIndex(),cboxCidade.getSelectedIndex(),
							txtComplemento.getText(), txtNumero.getText());
					if (FuncionarioController.isLimparTela()) {
						FuncionarioController.setLimparTela(false);
						limparTela();
						}
					} catch (NullPointerException e2) {
					JOptionPane.showMessageDialog(null, "Preencha todos os campos.");
			}
			}});	

		// configuração de janela
		janela.setTitle("Cadastro");
		janela.setSize(600, 400);
		janela.getContentPane().setLayout(null);
		janela.setLocationRelativeTo(null);
		janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		painelDaJanela = (JPanel) janela.getContentPane();
		painelDaJanela.setBorder(BorderFactory.createEtchedBorder());
		painelDaJanela.add(painel4);


		// Inclusao dos elementos

		painelDaJanela.add(lblIncluirMateria);
		painelDaJanela.add(jtfIncluirMateria);
		painelDaJanela.add(painelDeScroll);
		painelDaJanela.add(botaoIncluir);
		painelDaJanela.add(botaoExcluir);
		painelDaJanela.add(botaoCadastrar);
		painelDaJanela.add(botaoCancelar);
		painelDaJanela.add(lblOcupacao);
		painelDaJanela.add(jCom);
		painelDaJanela.add(lblNome);
		painelDaJanela.add(txtNome);
		painelDaJanela.add(lblcpf);
		painelDaJanela.add(lblDataNasc);
		painelDaJanela.add(txtDataNasc);
		painelDaJanela.add(txtcpf);
		painelDaJanela.add(lblrg);
		painelDaJanela.add(txtrg);
		painelDaJanela.add(lblTelefone);
		painelDaJanela.add(txtTelefone);
		painelDaJanela.add(lbllogradouro);
		painelDaJanela.add(txtLogradouro);
		painelDaJanela.add(lblnumero);
		painelDaJanela.add(txtNumero);
		painelDaJanela.add(lblComplemento);
		painelDaJanela.add(txtComplemento);
		painelDaJanela.add(lblBairro);
		painelDaJanela.add(txtBairro);
		painelDaJanela.add(lblestado);
		painelDaJanela.add(cboxEstado);
		painelDaJanela.add(lblcidade);
		painelDaJanela.add(cboxCidade);
		painelDaJanela.add(lblSalario);
		painelDaJanela.add(txtSalario);
		painelDaJanela.add(lblRamal);
		painelDaJanela.add(txtRamal);
		painelDaJanela.add(rbtDiurno);
		painelDaJanela.add(rbtNoturno);
		painelDaJanela.add(rbtDiurno);
		painelDaJanela.add(rbtNoturno);
		painelDaJanela.add(lblTurno);
		painelDaJanela.add(painel4);

		
//			configuração do JPanel 4
		painel4.setBounds(5, 5, 620, 550);
		painel4.setLayout(new GridLayout(1, 0, 0, 0));
		painel4.setBorder(new TitledBorder("Dados do Empregado"));
		painelDaJanela.setLayout(null);
		painelDaJanela.add(painel4);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setSize(650, 600);
		janela.setLocationRelativeTo(null);
		janela.setVisible(true);
	}


	public void exibirCFaxineira() {
		lblTurno.setVisible(true);
		rbtDiurno.setVisible(true);
		rbtNoturno.setVisible(true);
		lblRamal.setVisible(false);
		txtRamal.setVisible(false);
		painelDeScroll.setVisible(false);
		botaoIncluir.setVisible(false);
		botaoExcluir.setVisible(false);
		lblIncluirMateria.setVisible(false);
		jtfIncluirMateria.setVisible(false);

	}

	public void exibirCSecretaria() {
		lblRamal.setVisible(true);
		txtRamal.setVisible(true);
		lblTurno.setVisible(false);
		rbtDiurno.setVisible(false);
		rbtNoturno.setVisible(false);
		painelDeScroll.setVisible(false);
		botaoIncluir.setVisible(false);
		botaoExcluir.setVisible(false);
		lblIncluirMateria.setVisible(false);
		jtfIncluirMateria.setVisible(false);

	}

	public void exibirCProfessor() {
		lblRamal.setVisible(false);
		txtRamal.setVisible(false);
		lblTurno.setVisible(false);
		rbtDiurno.setVisible(false);
		rbtNoturno.setVisible(false);
		painelDeScroll.setVisible(true);
		botaoIncluir.setVisible(true);
		botaoExcluir.setVisible(true);
		lblIncluirMateria.setVisible(true);
		jtfIncluirMateria.setVisible(true);
	}

	public void desabilitarTudo() {
		txtMateria.setEditable(false);

	}

	public void habilitarFuncionario() {
		txtMateria.setEditable(true);
	}

	public void preencherCidades() {

		lblcidade.setVisible(true);
		cboxCidade.setVisible(true);
		String quebra[] = func.pegarCidade().split(";");

		for (int i = 0; i < quebra.length; i++) {
			cboxCidade.addItem(quebra[i]);
		}
		cboxCidade.setSelectedIndex(-1);

	}

	public void adicionaLinha() {
		if (jtfIncluirMateria.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Campo de Materia Obrigatorio.");
		} else {
			// obter modelo tabela criada
			DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
			// adicionar nova linha com os dados
			modelo.addRow(new String[] { jtfIncluirMateria.getText() });
			jtfIncluirMateria.setText("");
			JOptionPane.showMessageDialog(null, "Dado incluídos com sucesso.");
		}

	}

	public void excluirLinha() {
		if (tabela.getSelectedRow() == -1) {
			JOptionPane.showMessageDialog(null, "Selecione uma linha.");
		} else if (tabela.getSelectedRowCount() > 1) {
			JOptionPane.showMessageDialog(null, "Selecione apenas uma linha.");
		} else {
			// obter modelo tabela criada
			DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
			modelo.removeRow(tabela.getSelectedRow());
			JOptionPane.showMessageDialog(null, "Excluído com sucesso.");
		}

	}

	public static String getestado() {
		// TODO Auto-generated method stub
		return null;
	}
	public void limparTela() {
		
		txtNome.setText("");
		txtRamal.setText("");
		txtDataNasc.setText("");
		txtcpf.setText("");
		txtrg.setText("");
		txtTelefone.setText("");
		txtLogradouro.setText("");
		txtComplemento.setText("");
		txtNumero.setText("");
		txtSalario.setText("");
		txtBairro.setText("");
		cboxEstado.setSelectedIndex(-1);
		cboxCidade.setSelectedIndex(-1);
		cboxCidade.setVisible(false);
		
		

	}
	

}
