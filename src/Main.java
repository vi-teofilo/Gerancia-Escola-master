import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;

import controller.AlunoController;
import view.AlunoView1;
import view.CidadeView;
import view.EstadoView;
import view.FuncionarioView;
import view.MenuView;
import view.RelatorioFuncView;
import view.RelatorioView;

/* Classe criada para adicionar e mostrar valor  
* @author vfurtado
* @since 17/02/2020
* @version 0.1
*/
//Classe com seus atributos de exibição
public class Main {

	public static void main(String[] args) {
	
//		ProfessorController p1 = new ProfessorController();
//		 p1.testaProfessor();		
//		
//		AlunoController aluno = new AlunoController();
//		aluno.inserirAluno(null, null, null, 0);
//	    aluno.listarTodos();		
//	    aluno.listarAniversariantes(12);
//		
		try {
		    for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
		        if ("Nimbus".equals(info.getName())) {
		            UIManager.setLookAndFeel(info.getClassName());
		            break;
		        }
		    }
		} catch (UnsupportedLookAndFeelException e) {
		    // handle exception
		} catch (ClassNotFoundException e) {
		    // handle exception
		} catch (InstantiationException e) {
		    // handle exception
		} catch (IllegalAccessException e) {
		    // handle exception
		}
//	new AlunoView1().iniciaAluno();
//	new CidadeView().cidadeView();
//		new EstadoView().estadoView();
	new MenuView().iniciaMenu();
//		new FuncionarioView().funcionarioView();
//		new RelatorioView().iniciaGui2();
//	new RelatorioFuncView().iniciaGui2();

	}
	
	
	
	
}
