package model;
/**
 * Classe criada modelo de endereço
 * @author vfurtado
 * @since 23/02/2020
 * @version 0.1
 */
//Classe com seus atributos Para Endereço
//sempre tem um construtor vazio 
//construtor com parametro
//construtor com get e set 
public class Endereco {
	private String logradouro;
	private int numero;
	private String complemento;
	private String bairro;
	private Cidade cidade;
	private Estado estado;
	
	
	public Endereco() {
	
	}

	public Endereco(String logradouro, int numero, String complemento, String bairro, Cidade cidade, Estado estado) {
		super();
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro.toUpperCase();
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento.toUpperCase();
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro.toUpperCase();
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	public String toString() {
		// TODO Auto-generated method stub
		return (logradouro+";"+numero+";"+complemento+";"+bairro+ ";"+cidade
				+ ";" + estado + ";" );
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
