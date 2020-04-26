package controller;
/**
 * Classe criada para fazer o controller da cidade e suas atribuições e funcionalidades
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

import model.Cidade;

public class CidadeController {
	
	private boolean limpar = false;
	
	
	
	public boolean isLimpar() {
		return limpar;
	}

	public void setLimpar(boolean limpar) {
		this.limpar = limpar;
	}

	public boolean matchesOnlyText(String text) {
		return text.matches("[^\\d]+");
	}

	public void cadastrar(String cidade) {
		if (!matchesOnlyText(cidade)) {
			JOptionPane.showMessageDialog(null, "Insira dados válidos");
		} else {
			cidade = cidade.trim();
			if (verificacao(cidade)) {
				efetuarCadastro(cidade);
				JOptionPane.showMessageDialog(null, "Cadastro Efetuado com Sucesso");
				limpar = true;
			}
		}
	}

	private void efetuarCadastro(String cidade) {
			Cidade cidade1 = new Cidade(cidade);

			try {
				File arquivo = new File("cidade.txt");
				FileOutputStream arquivoOutput;
				arquivoOutput = new FileOutputStream(arquivo, true);
				PrintStream gravador = new PrintStream(arquivoOutput);

				gravador.print(cidade1.getNome());
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

	private boolean verificacao(String cidade) {
		if (cidade.equals("")) {
			return false;
		}
		return true;
	}


}
