
package agenda.treino.de.classes;

/**
 *
 * @author vitor
 */
public class Contato {
    private String nomeContato;
    private String emailContato;
    private String telefone;

    public Contato(String nomeContato, String emailContato, String telefone) {
        this.nomeContato = nomeContato;
        this.emailContato = emailContato;
        this.telefone = telefone;
    }

    public Contato() {
    }

    

    



    public String getNomeContato() {
        return nomeContato;
    }

    public void setNomeContato(String nomeContato) {
        this.nomeContato = nomeContato;
    }

    public String getEmailContato() {
        return emailContato;
    }

    public void setEmailContato(String emailContato) {
        this.emailContato = emailContato;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

   
    
    
}
