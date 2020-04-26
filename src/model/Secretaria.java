package model;

/* Classe criada para Secretaria que estende a classe funcionario 
* @author vfurtado
* @since 17/02/2020
* @version 0.1
*/
//Classe com seus atributos Para os funcionarios 
//sempre tem um construtor vazio 
//construtor com parametro
//construtor com get e set 
public class Secretaria extends Funcionario {
private String ramal;
	
	public Secretaria() {
		System.out.println("Secretaria criada!");
	
}
	
	

	public Secretaria(String ramal) {
		
		this.ramal = ramal;
	}

	
	public String getRamal() {
		return ramal;
	}

	public void setRamal(String ramal) {
		this.ramal= ramal;
	}
	
	
	public void exibe() {
		super.exibe();
		System.out.println("Ramal da Secretaria: "+ramal);
		
	} 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
