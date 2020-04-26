package view;

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
import javax.swing.JTextField;

import controller.AlunoController;

public class AlunoView1 {


	private JTextField txtMatricula;
	private JTextField txtNome;
	private JTextField txtDataNasc;
	private JLabel lblMatricula;
	private JLabel lblNome;
	private JLabel lblDataNasc;
	private JLabel lblrg;
	private JLabel lblcpf;
	private JLabel lbllougradouro;
	private JLabel lbltelefone;
	private JLabel lblsenha;
	private JLabel lblsexo;
	private JLabel lblcomplemento;
	private JLabel lblnumero;
	private JLabel lblcidade;
	private JLabel lblestado;
	private JLabel lblbairro;
	private JRadioButton rbtFeminino;
	private JRadioButton rbtMasculino;
	private JTextField txtrg;
	private JTextField txtcpf;
	private JTextField txtlougradouro;
	private JComboBox<String> cidade;
	private JComboBox<String> estado;
	private JTextField txttelefone;
	private JTextField txtcomplento;
	private JTextField txtnumero;
	private JTextField txtbairro;
	private JPasswordField jpwSenha;
	private JFrame janela;
	private JButton botaoSalvar;
	private JButton botaoCancelar;
	private JPanel painelDaJanela;
	private ButtonGroup grpRadio;

	public AlunoView1() {
	}

	public void iniciaAluno() {

//	criar as instancia das classes 

		janela = new JFrame("Cadastro");
		painelDaJanela = (JPanel) janela.getContentPane();
		
		AlunoController alc =new AlunoController();

		lblMatricula = new JLabel();
		lblNome = new JLabel();
		lblDataNasc = new JLabel();
		lblsexo = new JLabel();
		lblrg = new JLabel();
		lblcpf = new JLabel();
		lbllougradouro = new JLabel();
		lbltelefone = new JLabel();
		lblsenha = new JLabel();
		lblcomplemento = new JLabel();
		lblnumero = new JLabel();
		lblcidade = new JLabel();
		lblestado = new JLabel();
		lblbairro = new JLabel();
		txtMatricula = new JTextField();
		txtNome = new JTextField();
		txtDataNasc = new JTextField();
		rbtFeminino = new JRadioButton();
		rbtMasculino = new JRadioButton();
		txtrg = new JTextField();
		txtcpf = new JTextField();
		txtlougradouro = new JTextField();
		txtcomplento = new JTextField();
		txtnumero = new JTextField();
		txtbairro = new JTextField();
		jpwSenha = new JPasswordField();
		cidade = new JComboBox<String>();
		estado = new JComboBox<String>();
		txttelefone = new JTextField();
		botaoSalvar = new JButton("Salvar");
		botaoCancelar = new JButton("Cancelar");
		
		
//	adicionar os textos da Label 
		lblMatricula.setText("Numero da Matricula:");
		lblMatricula.setBounds(5, 10, 350, 20);

		lblNome.setText("Nome:");
		lblNome.setBounds(230, 10, 450, 20);

		lblDataNasc.setText("Data de Nascimento:");
		lblDataNasc.setBounds(5, 35, 350, 20);

		lblrg.setText("RG:");
		lblrg.setBounds(295, 35, 300, 20);

		lblcpf.setText("CPF:");
		lblcpf.setBounds(295, 60, 300, 20);

		lbllougradouro.setText("Logradouro:");
		lbllougradouro.setBounds(5, 110, 350, 20);

		lbltelefone.setText("Telefone:");
		lbltelefone.setBounds(5, 85, 350, 20);

		lblsexo.setText("Sexo:");
		lblsexo.setBounds(5, 60, 350, 20);

		lblsenha.setText("Senha:");
		lblsenha.setBounds(5, 60, 350, 20);

		lblcomplemento.setText("Complemento:");
		lblcomplemento.setBounds(5, 135, 350, 20);

		lblbairro.setText("Bairro:");
		lblbairro.setBounds(295, 135, 350, 20);

		lblnumero.setText("N°");
		lblnumero.setBounds(390, 110, 350, 20);

		lblcidade.setText("Cidade:");
		lblcidade.setBounds(5, 160, 350, 20);

		lblestado.setText("Estado:");
		lblestado.setBounds(200, 160, 350, 20);

		lblsenha.setText("Digte a Senha:");
		lblsenha.setBounds(5, 188, 350, 20);

//tratamentp das textfield 

		txtMatricula.setBounds(130, 10, 95, 25);

		txtNome.setBounds(270, 10, 320, 25);

		// tratamento de data
		try {
			javax.swing.text.MaskFormatter cpf = new javax.swing.text.MaskFormatter("##/##/####");
			txtDataNasc = new javax.swing.JFormattedTextField(cpf);
		} catch (Exception e) {
		}
		txtDataNasc.setBounds(130, 35, 142, 25);
		// tratamento de telefone
		try {
			javax.swing.text.MaskFormatter cpf = new javax.swing.text.MaskFormatter("(##) #####-####");
			txttelefone = new javax.swing.JFormattedTextField(cpf);
		} catch (Exception e) {

		}
		txttelefone.setBounds(130, 85, 142, 25);
//tratamento de mascara do rg		
		try {
			javax.swing.text.MaskFormatter cpf = new javax.swing.text.MaskFormatter("##.###.###-#");
			txtrg = new javax.swing.JFormattedTextField(cpf);
		} catch (Exception e1) {
		}
		txtrg.setBounds(320, 35, 142, 24);
//tratamento de mascara do CPF	
		try {
			javax.swing.text.MaskFormatter cpf = new javax.swing.text.MaskFormatter("###.###.###-##");
			txtcpf = new javax.swing.JFormattedTextField(cpf);
		} catch (Exception e1) {
		}
		txtcpf.setBounds(322, 60, 142, 25);

		txtlougradouro.setBounds(130, 110, 250, 25);

		txtcomplento.setBounds(130, 135, 142, 25);

		txtnumero.setBounds(410, 110, 60, 25);

		txtbairro.setBounds(330, 135, 160, 25);

		jpwSenha.setBounds(90, 188, 100, 25);

// foi add os check box de endereco
		
		cidade.setBounds(50, 160, 142, 24);
		cidade.setMaximumRowCount(10);
		String quebra[] = alc.pegarCidade().split(";");

		for (int i = 0; i < quebra.length; i++) {
			cidade.addItem(quebra[i]);
		}
		cidade.setSelectedIndex(-1);

		

		
		estado.setBounds(245, 160, 70, 24);
		estado.setMaximumRowCount(10);
		String quebra1[] = alc.pegarEstado().split(";");

		for (int i = 0; i < quebra1.length; i++) {
			estado.addItem(quebra1[i]);
		}
		estado.setSelectedIndex(-1);

		rbtFeminino.setText("Feminino");
		rbtFeminino.setBounds(40, 60, 89, 24);
		// configuração do botao masculino
		rbtMasculino.setText("Masculino");
		rbtMasculino.setBounds(125, 60, 200, 24);

		// tratamento da radio box
		grpRadio = new ButtonGroup();

		grpRadio.add(rbtFeminino);
		grpRadio.add(rbtMasculino);

		botaoCancelar.setBounds(200, 220, 100, 20);
		botaoSalvar.setBounds(325, 220, 100, 20);
		
		botaoCancelar.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				
				janela.dispose();
			}
		});
		
		botaoSalvar.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				
				try {
					AlunoController aluno = new AlunoController();
					aluno.alunoC(txtDataNasc.getText(), txtMatricula.getText(), txtNome.getText(), txtcpf.getText(),
							txtrg.getText(), txttelefone.getText(), txtlougradouro.getText(), txtbairro.getText(),
							estado.getSelectedIndex(), cidade.getSelectedIndex(),
							cidade.getSelectedItem().toString().toUpperCase(),
							estado.getSelectedItem().toString().toUpperCase(), jpwSenha.getText(),
							rbtMasculino.isSelected(), rbtFeminino.isSelected(),
							txtcomplento.getText(), txtnumero.getText());
					if (AlunoController.isLimparTela()) {
						AlunoController.setLimparTela(false);
							limparTela();
						}
					} catch (NullPointerException e2) {
					JOptionPane.showMessageDialog(null, "Preencha todos os campos.");
			}
			}});		
		
		
//		configurar painel 
		painelDaJanela.setLayout(null);

		painelDaJanela.setBorder(BorderFactory.createLoweredBevelBorder());
		painelDaJanela.add(botaoSalvar);
		painelDaJanela.add(botaoCancelar);
		painelDaJanela.add(lblMatricula);
		painelDaJanela.add(lblcidade);
		painelDaJanela.add(lblestado);
		painelDaJanela.add(lblNome);
		painelDaJanela.add(lblDataNasc);
		painelDaJanela.add(lblsexo);
		painelDaJanela.add(lblrg);
		painelDaJanela.add(lblcpf);
		painelDaJanela.add(lbllougradouro);
		painelDaJanela.add(lbltelefone);
		painelDaJanela.add(lblbairro);
		painelDaJanela.add(lblsenha);
		painelDaJanela.add(txtMatricula);
		painelDaJanela.add(txtNome);
		painelDaJanela.add(txtDataNasc);
		painelDaJanela.add(txtrg);
		painelDaJanela.add(txtcpf);
		painelDaJanela.add(txttelefone);
		painelDaJanela.add(txtlougradouro);
		painelDaJanela.add(rbtFeminino);
		painelDaJanela.add(rbtMasculino);
		painelDaJanela.add(lblcomplemento);
		painelDaJanela.add(lblnumero);
		painelDaJanela.add(txtcomplento);
		painelDaJanela.add(txtnumero);
		painelDaJanela.add(txtbairro);
		painelDaJanela.add(jpwSenha);
		painelDaJanela.add(cidade);
		painelDaJanela.add(estado);

		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setSize(650, 300);
		janela.setLocationRelativeTo(null);
		janela.setVisible(true);

	
	}
	


	public static String getestado() {
		
		return null;
	}
	public void limparTela() {
		txtMatricula.setText("");
		txtNome.setText("");
		txtDataNasc.setText("");
		txtcpf.setText("");
		txtrg.setText("");
		txttelefone.setText("");
		rbtMasculino.setSelected(false);
		rbtFeminino.setSelected(false);
		txtlougradouro.setText("");
		txtcomplento.setText("");
		txtnumero.setText("");
		txtbairro.setText("");
		estado.setSelectedIndex(-1);
		cidade.setSelectedIndex(-1);
		cidade.setVisible(false);
		lblcidade.setVisible(false);
		jpwSenha.setText("");

	}
	
	
	

}
