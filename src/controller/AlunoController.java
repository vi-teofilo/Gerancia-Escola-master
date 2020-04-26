package controller;

/**
 * Classe criada para fazer o controller do aluno e suas atribuições e funcionalidades
 * @author vfurtado
 * @since 23/02/2020
 * @version 0.2
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
//import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
//import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.JOptionPane;

import model.Aluno;
import model.Cidade;
import model.Data;
import model.Endereco;
import model.Estado;
import view.AlunoView1;
import view.RelatorioView;

public class AlunoController {

	private static char sexo;
	private static int maxDias;
	private static int dia;
	private static int mes;
	private static int ano;
	private static int tDias;
	private static Data dataaux;
	private static boolean limparTela;
//	public private String[][] aux = new String[25][3]{matricula, nome, dataNasc}
	static AlunoController aluno = new AlunoController();
	private boolean limpar = false;

	public static char getSexo() {
		return sexo;
	}

	public static void setSexo(char sexo) {
		AlunoController.sexo = sexo;
	}

	public static int getMaxDias() {
		return maxDias;
	}

	public static void setMaxDias(int maxDias) {
		AlunoController.maxDias = maxDias;
	}

	public static int getDia() {
		return dia;
	}

	public static void setDia(int dia) {
		AlunoController.dia = dia;
	}

	public static int getMes() {
		return mes;
	}

	public static void setMes(int mes) {
		AlunoController.mes = mes;
	}

	public static int getAno() {
		return ano;
	}

	public static void setAno(int ano) {
		AlunoController.ano = ano;
	}

	public static int gettDias() {
		return tDias;
	}

	public static void settDias(int tDias) {
		AlunoController.tDias = tDias;
	}

	public static Data getDataaux() {
		return dataaux;
	}

	public static void setDataaux(Data dataaux) {
		AlunoController.dataaux = dataaux;
	}

	public static boolean isLimparTela() {
		return limparTela;
	}

	public static void setLimparTela(boolean limparTela) {
		AlunoController.limparTela = limparTela;
	}

	public static AlunoController getAl() {
		return aluno;
	}

	public static void setAl(AlunoController aluno) {
		AlunoController.aluno = aluno;
	}

	public boolean isLimpar() {
		return limpar;
	}

	public void setLimpar(boolean limpar) {
		this.limpar = limpar;
	}

	public boolean matchesOnlyText(String text) {
		return text.matches("[^\\d]+");
	}

	public void alunoC(String txtDataNasc, String txtMatricula, String txtNome, String txtcpf, String txtrg,
			String txttelefone, String txtlougradouro, String txtbairro, int estado, int cidade, String cboxCidadei,
			String cboxEstadoi, String txtsenha, boolean rbtMasculino, boolean rbtFeminino, String txtComplemento,
			String txtNumero) {
		try {
			verificarMDias(txtDataNasc);
			if (validarCadastro(txtMatricula, txtNome, txtDataNasc, txtcpf, txtrg, txttelefone, txtlougradouro,
					txtbairro, estado, cidade, txtsenha, rbtMasculino, rbtFeminino, txtComplemento)) {
				efetuarCadastro(txtNumero, cboxCidadei, cboxEstadoi, txtlougradouro, txtComplemento, txtbairro,
						txtMatricula, txtNome, txtrg, txtcpf, txttelefone, txtsenha);
				limparTela = true;
			} else {
				JOptionPane.showMessageDialog(null, "Por favor preencha todos os campos antes de prosseguir.");

			}
		} catch (NumberFormatException e2) {
			JOptionPane.showMessageDialog(null, "Digite todos os dados.");
		}
	}

	public void inserirAluno(String matricula, String nome, Data dataNasc, char sexo, String rg, String cpf,
			Endereco endereco, String telefone, String senha) {
		Aluno aluno = new Aluno(matricula, nome, dataNasc, sexo, rg, cpf, endereco, telefone, senha);

		try {
			File arquivo = new File("aluno.txt");
			FileOutputStream arquivoOutput;
			arquivoOutput = new FileOutputStream(arquivo, true);
			PrintStream gravador = new PrintStream(arquivoOutput);

			gravador.print(aluno.getMatricula().toUpperCase());
			gravador.print(";");
			gravador.print(aluno.getNome().toUpperCase());
			gravador.print(";");
			gravador.print(aluno.getDataNasc());
			gravador.print(";");
			gravador.print(aluno.getSexo());
			gravador.print(";");
			gravador.print(aluno.getRg().toUpperCase());
			gravador.print(";");
			gravador.print(aluno.getCpf().toUpperCase());
			gravador.print(";");
			gravador.print(aluno.getEndereco().getBairro());
			gravador.print(";");
			gravador.print(aluno.getEndereco().getComplemento());
			gravador.print(";");
			gravador.print(aluno.getEndereco().getNumero());
			gravador.print(";");
			gravador.print(aluno.getEndereco().getCidade());
			gravador.print(";");
			gravador.print(aluno.getEndereco().getEstado());
			gravador.print(";");
			gravador.print(aluno.getTelefone().toUpperCase());
			gravador.print(";");
			gravador.println(aluno.getSenha().toUpperCase());

			gravador.close();
			arquivoOutput.close();

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	public static void verificarMDias(String txtDataNasc) {

		Calendar cal = GregorianCalendar.getInstance();
		int anoAtual = cal.get(Calendar.YEAR);
		int mesAtual = cal.get(Calendar.MONTH);
		int diaAtual = cal.get(Calendar.DATE);

		String texto[] = txtDataNasc.split("/");
		dia = Integer.parseInt(texto[0]);
		mes = Integer.parseInt(texto[1]);
		ano = Integer.parseInt(texto[2]);

		tDias = (((anoAtual * 365) - (ano * 365)) + (((mesAtual + 1) * 30) - (mes * 30)) + (diaAtual - dia));
		dataaux = new Data(dia, mes, ano);
		switch (mes) {
		case (1):
			maxDias = 31;
			break;
		case (2):
			maxDias = 28;
			break;
		case (3):
			maxDias = 31;
			break;
		case (4):
			maxDias = 30;
			break;
		case (5):
			maxDias = 31;
			break;
		case (6):
			maxDias = 30;
			break;
		case (7):
			maxDias = 31;
			break;
		case (8):
			maxDias = 31;
			break;
		case (9):
			maxDias = 30;
			break;
		case (10):
			maxDias = 31;
			break;
		case (11):
			maxDias = 30;
			break;
		case (12):
			maxDias = 31;
			break;
		}
	}
//	validação de senha do aluno

	public boolean verificaSenhaCadastro(String txtsenha) {
		if (txtsenha.equals("")) {
			JOptionPane.showMessageDialog(null, "Digite uma senha para concluir o cadastro");
			return false;
		}
		return false;
	}

//validar cadastro do aluno 
	public static boolean validarCadastro(String txtMatricula, String txtNome, String txtDataNasc, String txtcpf,
			String txtrg, String txttelefone, String txtlougradouro, String txtbairro, int estado, int cidade,
			String txtsenha, boolean rbtMasculino, boolean rbtFeminino, String txtComplemento) {
		if (txtComplemento.equals("")) {
			txtComplemento = "Não tem";
		}
		if (txtMatricula.equals("") || txtNome.contentEquals("") || txtDataNasc.equals("") || txtcpf.equals("")
				|| txtrg.equals("") || txttelefone.equals("") || txtlougradouro.equals("") || txtbairro.equals("")
				|| estado == -1 || cidade == -1) {
			return false;
		} else if (rbtMasculino) {
			sexo = 'M';
		} else if (rbtFeminino) {
			sexo = 'F';
		} else {
			JOptionPane.showMessageDialog(null, "Selecione um sexo.");
			return false;
		}
		if (mes > 12) {
			JOptionPane.showMessageDialog(null, "mes não pode ser maior que 12.");
			return false;
		}

		if (maxDias < dia) {
			JOptionPane.showMessageDialog(null, "Para o mês selecionado o dia não pode ser maior que " + maxDias);
			return false;
		}
		if (tDias < 0) {
			JOptionPane.showMessageDialog(null, "A data deve ser menor ou igual a data atual");
			return false;
		}
		return true;

	}

//efetuar cadastro do aluno e salvar suas informacções 
	protected static void efetuarCadastro(String txtnumero, String cidade, String estado, String txtlougradouro,
			String txtcomplento, String txtBairro, String txtMatricula, String txtNome, String txtrg, String txtcpf,
			String txttelefone, String txtsenha) {
		// instanciando controller

		// adicionando endereço
		int numero = (Integer.parseInt(txtnumero));
		Cidade cidade1 = new Cidade(cidade + "");
		Estado estado1 = new Estado(AlunoView1.getestado(), estado + "");
		Endereco endereco = new Endereco();
		// efetuando cadastro
		aluno.inserirAluno(txtMatricula, txtNome, dataaux, sexo, txtrg, txtcpf, endereco, txttelefone, txtsenha);

		JOptionPane.showMessageDialog(null, "Cadastro efetuado com sucesso.");

	}
//	limpar todos os campos após salvar 

	public String listarTodos() {

		InputStream is;
		String mensagem = "";
		try {
			is = new FileInputStream("aluno.txt");
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader leitor = new BufferedReader(isr);
			String texto = leitor.readLine();

			while (texto != null) {
				String dados2[] = texto.split(";");
				// Data data = new Data(dia, mes, ano);
				// Aluno aluno = new Aluno(matricula, nome, data,sexo, rg, cpf, endereco,
				// telefone, senha);
//				aux[cont][0]= dados[0]
//				aux[cont][1]= dados[1]
//				aux[cont][0]= dados[2]
//				texto = leitor.readLine();
//				cont++
				
				
				
				mensagem += ("Nome: ") + (dados2[0]) + (" Matricula: ") + (dados2[1]) + ("\nData de Nascimento: ")
						+ (dados2[2]);
				texto = leitor.readLine();
				//arrayListAlunos.add(aluno);
			}
			return (mensagem);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;

	}

////	adicionar cidade 
	public String pegarCidade() {
		InputStream is;
		String mensagem = "";
		try {
			is = new FileInputStream("cidade.txt");
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader leitor = new BufferedReader(isr);
			String texto = leitor.readLine();

			while (texto != null) {
				mensagem = mensagem + texto + ";";
				texto = leitor.readLine();

			}
			return mensagem;

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException d) {
			d.printStackTrace();
		}
		return null;

	}
//	adicionar estado

	public String pegarEstado() {
		InputStream is;
		String mensagem = "";
		try {
			is = new FileInputStream("estado.txt");
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader leitor = new BufferedReader(isr);
			String texto = leitor.readLine();

			while (texto != null) {
				String quebrado[] = texto.split(";");
				texto = quebrado[1];
				mensagem = mensagem + texto + ";";
				texto = leitor.readLine();

			}
			return mensagem;

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException d) {
			d.printStackTrace();
		}
		return null;

	}

}// fim
