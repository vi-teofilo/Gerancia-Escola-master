package controller;
/**
 * Classe criada para fazer o controller do estado  suas atribuições e funcionalidades
 * @author vfurtado
 * @since 23/02/2020
 * @version 0.2
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import javax.swing.JOptionPane;

import model.Estado;

public class EstadoController {

	private boolean limpar = false;

	public boolean matchesOnlyText(String text) {
		return text.matches("[^\\d]+");
	}

	public boolean isLimpar() {
		return limpar;
	}

	public void setLimpar(boolean limpar) {
		this.limpar = limpar;
	}

	public void cadastrar(String estado, String uf) {
		if (!matchesOnlyText(estado)) {
			JOptionPane.showMessageDialog(null, "Insira dados válidos");
		} else {
			estado = estado.trim();
			if (verificacao(estado, uf)) {
				efetuarCadastro(estado, uf);
				JOptionPane.showMessageDialog(null, "Cadastro Efetuado com Sucesso");
				limpar = true;

			} else {
				JOptionPane.showMessageDialog(null, "Digite todos os campos.");
			}
		}
	}

	private void efetuarCadastro(String estado, String uf) {
		Estado estado1 = new Estado(estado, uf);

		try {
			File arquivo = new File("estado.txt");
			FileOutputStream arquivoOutput;
			arquivoOutput = new FileOutputStream(arquivo, true);
			PrintStream gravador = new PrintStream(arquivoOutput);

			gravador.print(estado1.getNome());
			gravador.print(";");
			gravador.print(estado1.getUp());
			gravador.print("\n");

			gravador.close();
			arquivoOutput.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private boolean verificacao(String estado, String uf) {
		uf = uf.trim();
		if (estado.equals("") || uf.equals("")) {
			return false;
		}
		return true;
	}

}
