package model;

/* Classe criada para Faxineira 
* @author vfurtado
* @since 17/02/2020
* @version 0.1
*/
//Classe com seus atributos Para faxineira
//sempre tem um construtor vazio 
//construtor com parametro
//construtor com get e set 
public class Faxineira extends Funcionario {

private String turno;
	
	public Faxineira() {
		System.out.println("Faxineira criada!");
	
}
	
	

	public Faxineira(String turno) {
		
		this.turno = turno;
	}

	
	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}
	
	
	public void exibe() {
		super.exibe();
		System.out.println("Turno da Faxineira: "+turno);
		
	} 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
