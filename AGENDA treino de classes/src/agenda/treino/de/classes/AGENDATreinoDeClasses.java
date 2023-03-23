
package agenda.treino.de.classes;

/**
 *
 * @author vitor
 */
public class AGENDATreinoDeClasses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Agenda A = new Agenda("Agenda 1");
       A.adicionarContato("nome1", "nome1@gmail.com", "707070");
       
       A.adicionarContato("nome2", "nome2@gmail.com", "45874648");
       A.mostrarContatos();
    }
    
}
