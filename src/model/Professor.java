package model;
/* Classe criada para Professor  
* @author vfurtado
* @since 17/02/2020
* @version 0.1
*/
//Classe com seus atributos Para professor 
//sempre tem um construtor vazio 
//construtor com parametro
//construtor com get e set 
public class Professor extends Funcionario {

	private String materia;
	
	public Professor() {
		System.out.println("Professor criado!");
	
}
	
	

	public Professor(String materia) {
		
		this.materia = materia;
	}

	
	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}
	
	
	public void exibe() {
		super.exibe();
		System.out.println("Materia do Professor: "+materia);
		
	} 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
