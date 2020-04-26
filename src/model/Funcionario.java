package model;

/* Classe criada para Funcionario, adicionando atributos p/ classe Faxineira, Professor, Secretaria
* @author vfurtado
* @since 17/02/2020
* @version 0.1
*/
//Classe com seus atributos Para funcionario
//sempre tem um construtor vazio 
//construtor com parametro
//construtor com get e set 
public class Funcionario {
	private int id;
	private String nome;
	private String cpf;
	private String rg;
	private double salario;
	private Data dataNasc;
	private Endereco endereco;
	private String telefone;

	public Funcionario() {
		System.out.println("Funcionario criado!");

	}

	public Funcionario(int id, String nome, String cpf, String rg, double salario, Data dataNasc, Endereco endereco,
			String telefone) {

		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.salario = salario;
		this.dataNasc = dataNasc;
		this.endereco = endereco;
		this.telefone = telefone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public  String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public  Data getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(Data dataNasc) {
		this.dataNasc = dataNasc;
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

	public void exibe() {
		System.out.println("Nome do Funcionario: " + nome);
		System.out.println("CPF do Funcionario: " + cpf);
		System.out.println("Salario do Funcionario: " + salario);

	}

	public static void inserirFuncionario(String txtNome, String txtrg, String txtcpf, Endereco endereco2,
			String txtTelefone, String txtData, int estado, int cidade, String txtSalario) {
		// TODO Auto-generated method stub
		
	}

	
	

}
