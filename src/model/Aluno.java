package model;
/* Classe criada para Professor  
* @author vfurtado
* @since 18/02/2020
* @version 0.1
*/
// 
//Classe com seus atributos Para alunos  
//sempre tem um construtor vazio 
//construtor com parametro
//construtor com get e set 
public class Aluno {

	private String matricula;
	private String nome;
	private Data dataNasc;
	private char sexo;
	private String rg;
	private String cpf;
	private Endereco endereco;
	private String telefone;
	private String senha;

	public Aluno() {
	
}

	public Aluno(String matricula, String nome, Data dataNasc, char sexo, String rg, String cpf, Endereco endereco,
			String telefone, String senha) {
		
		this.matricula = matricula;
		this.nome = nome;
		this.dataNasc = dataNasc;
		this.sexo = sexo;
		this.rg = rg;
		this.cpf = cpf;
		this.endereco = endereco;
		this.telefone = telefone;
		this.senha = senha;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Data getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(Data dataNasc) {
		this.dataNasc = dataNasc;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
