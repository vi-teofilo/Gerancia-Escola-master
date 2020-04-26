package model;
/**
 * Classe criada modelo de estado
 * @author vfurtado
 * @since 23/02/2020
 * @version 0.1
 */
//Classe com seus atributos
//sempre tem um construtor vazio 
//construtor com parametro
//construtor com get e set 
public class Estado {
	private String nome;
	private String uf;
	
public Estado() {
	
}
	
	public Estado(String nome, String up) {
		
		this.nome = nome;
		this.uf = up;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUp() {
		return uf;
	}

	public void setUf(String up) {
		this.uf = up;
	}
	
	
	
	
	
	
}
