package controller;
/**
 * Classe criada para fazer o controller do funcionario e suas atribuições e funcionalidades
 * @author vfurtado
 * @since 23/02/2020
 * @version 0.2
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.JOptionPane;

import model.Cidade;
import model.Data;
import model.Endereco;
import model.Estado;
import model.Funcionario;

import view.FuncionarioView;

public class FuncionarioController {

	private static int id;
	private static int maxDias;
	private static int dia;
	private static int mes;
	private static int ano;
	private static int tDias;
	private static Data dataaux;
	private static boolean limparTela;
	static FuncionarioController func = new FuncionarioController();
//	public static String[][] auxf = new String[25][3];
//	public static String[][] auxs = new String[25][3];
//	public static String[][] auxfa = new String[25][3];
	

	private boolean limpar = false;

	public static int getId() {
		return id;
	}

	public static void setId(int id) {
		FuncionarioController.id = id;
	}

	public static int getMaxDias() {
		return maxDias;
	}

	public static void setMaxDias(int maxDias) {
		FuncionarioController.maxDias = maxDias;
	}

	public static int getDia() {
		return dia;
	}

	public static void setDia(int dia) {
		FuncionarioController.dia = dia;
	}

	public static int getMes() {
		return mes;
	}

	public static void setMes(int mes) {
		FuncionarioController.mes = mes;
	}

	public static int getAno() {
		return ano;
	}

	public static void setAno(int ano) {
		FuncionarioController.ano = ano;
	}

	public static int gettDias() {
		return tDias;
	}

	public static void settDias(int tDias) {
		FuncionarioController.tDias = tDias;
	}

	public static Data getDataaux() {
		return dataaux;
	}

	public static void setDataaux(Data dataaux) {
		FuncionarioController.dataaux = dataaux;
	}

	public static boolean isLimparTela() {
		return limparTela;
	}

	public static void setLimparTela(boolean limparTela) {
		FuncionarioController.limparTela = limparTela;
	}

	public static FuncionarioController getAl() {
		return func;
	}

	public static void setAl(FuncionarioController funcionario) {
		FuncionarioController.func = funcionario;
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

	public FuncionarioController() {

	}

	public void funcionario(String txtNome, String txtcpf, String txtSalario, String txtrg, String txtTelefone,
			String txtLogradouro, String txtBairro,String txtData, int cboxCidade, int cboxEstado,
			String txtComplemento, String txtNumero) {
		try {
			if (validarCadastro(txtNome, txtcpf, txtrg, txtTelefone, txtLogradouro, txtBairro,cboxEstado, cboxCidade,
					txtComplemento, txtSalario, txtNumero)) {
				efetuarCadastro(txtNome, txtcpf, txtrg, txtTelefone, txtLogradouro, txtBairro, cboxEstado, cboxCidade,  txtComplemento, txtSalario,
						txtData, txtNumero);
				limparTela = true;
			} else {
				JOptionPane.showMessageDialog(null, "Preencha todos os Campos!.");

			}
		} catch (NumberFormatException e2) {
			JOptionPane.showMessageDialog(null, "Digite todos os dados.");
		}
	}

	public static void inserirFuncionario(String txtNome, String txtrg, String txtcpf, Endereco endereco,
			String txtTelefone, String txtData, int estado, int cidade, String txtSalario) {
	
		Funcionario func = new Funcionario();

		try {
			
			File arquivo = new File("funcionario.txt");
			FileOutputStream arquivoOutput;
			arquivoOutput = new FileOutputStream(arquivo, true);
			PrintStream gravador = new PrintStream(arquivoOutput);

			gravador.print(func.getNome().toUpperCase());
			gravador.print(";");
			gravador.print(func.getRg().toUpperCase());
			gravador.print(";");
			gravador.print(func.getCpf().toUpperCase());
			gravador.print(";");
			gravador.print(func.getEndereco().getBairro());
			gravador.print(";");
			gravador.print(func.getEndereco().getComplemento());
			gravador.print(";");
			gravador.print(func.getEndereco().getNumero());
			gravador.print(";");
			gravador.print(func.getEndereco().getCidade());
			gravador.print(";");
			gravador.print(func.getEndereco().getEstado());
			gravador.print(";");
			gravador.print(func.getTelefone().toUpperCase());
			gravador.print(";");
			gravador.print(func.getSalario());

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

	public static boolean validarCadastro(String txtNome, String txtcpf, String txtrg, String txtTelefone,
			String txtLogradouro, String txtBairro, int cboxEstado, int cboxCidade , String txtComplemento, String txtSalario,
			String txtData) {
		if (txtComplemento.equals("")) {
			txtComplemento = "Não tem";
		}
		if (txtSalario.equals("") || txtNome.contentEquals("") || txtData.equals("") || txtcpf.equals("")
				|| txtrg.equals("") || txtTelefone.equals("") || txtLogradouro.equals("") || txtBairro.equals("")
				|| cboxEstado == -1 || cboxCidade == -1) {
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

	public void efetuarCadastro(String txtNome, String txtcpf, String txtrg, String txtTelefone,
			String txtLogradouro, String txtBairro, int estado, int cidade, String txtComplemento, String txtSalario,
			String txtData, String txtNumero) {
		// instanciando controller

		// adicionando endereço
		int numero = (Integer.parseInt(txtNumero));
		Cidade cidade1 = new Cidade(cidade + "");
		Estado estado1 = new Estado(FuncionarioView.getestado(), estado + "");
		Endereco endereco = new Endereco();
		// efetuando cadastro
		Funcionario.inserirFuncionario(txtNome, txtrg, txtcpf, endereco, txtTelefone, txtData, estado, cidade,
				txtSalario);
		

		JOptionPane.showMessageDialog(null, "Cadastro efetuado com sucesso.");

	}
	

	public  String listarTodos() {
		InputStream is;
		String mensagem ="";
		try {
			is = new FileInputStream("funcionario.txt");
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader leitor = new BufferedReader(isr);
			String texto = leitor.readLine();

			while (texto != null) {
				String dados2[] =texto.split(";");
				
				mensagem += (" Nome: ") + (dados2[0]) + ("\nData de Nascimento: ") +(dados2[1])
						+ (" Telefone: ") + (dados2[2]) + ("\n");
				texto = leitor.readLine();
			}
			return (mensagem);
//		}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;

	}
//	InputStream is;
//	String mensagem = "";
//	try {
//		is = new FileInputStream("funcionario.txt");
//		InputStreamReader isr = new InputStreamReader(is);
//		BufferedReader leitor = new BufferedReader(isr);
//		String texto = leitor.readLine();
//		while (texto != null) {
//			String dados2[] = texto.split(";");
//			if (dados2[0].equals("1")) {
//				auxf[cont][0] = dados2[1];
//				auxf[cont][1] = dados2[13];
//				auxf[cont][2] = dados2[14];
//				cont++;
//			}
//			texto = leitor.readLine();
//		}
//		cont = 0;
//
//	} catch (FileNotFoundException e) {
//		e.printStackTrace();
//	} catch (IOException e) {
//		e.printStackTrace();
//	}
//
//}
//public void listarTodosS() {
//	InputStream is;
//	String mensagem = "";
//	try {
//		is = new FileInputStream("funcionario.txt");
//		InputStreamReader isr = new InputStreamReader(is);
//		BufferedReader leitor = new BufferedReader(isr);
//		String texto = leitor.readLine();
//		while (texto != null) {
//			String dados2[] = texto.split(";");
//			if (dados2[0].equals("2")) {
//				auxs[cont][0] = dados2[1];
//				auxs[cont][1] = dados2[13];
//				auxs[cont][2] = dados2[14];
//				cont++;
//			}
//			texto = leitor.readLine();
//		}
//		cont = 0;
//
//	} catch (FileNotFoundException e) {
//		e.printStackTrace();
//	} catch (IOException e) {
//		e.printStackTrace();
//	}
//
//}
//
//public void listarTodosF() {
//	InputStream is;
//	String mensagem = "";
//	try {
//		is = new FileInputStream("funcionario.txt");
//		InputStreamReader isr = new InputStreamReader(is);
//		BufferedReader leitor = new BufferedReader(isr);
//		String texto = leitor.readLine();
//		while (texto != null) {
//			String dados2[] = texto.split(";");
//			if (dados2[0].equals("3")) {
//				auxfa[cont][0] = dados2[1];
//				auxfa[cont][1] = dados2[13];
//				auxfa[cont][2] = dados2[14];
//				cont++;
//			}
//			texto = leitor.readLine();
//		}
//		cont = 0;
//
//	} catch (FileNotFoundException e) {
//		e.printStackTrace();
//	} catch (IOException e) {
//		e.printStackTrace();
//	}
//
//}
//}

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


}// fim do FuncionarioController
