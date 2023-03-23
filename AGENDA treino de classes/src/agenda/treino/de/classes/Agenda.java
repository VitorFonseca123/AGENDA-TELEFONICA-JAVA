package agenda.treino.de.classes;
import java.util.ArrayList;
/**
 *
 * @author vitor
 */
public class Agenda {
    private String nomeAgenda;
     private ArrayList<Contato> contatos;
    
    public Agenda(String nomeAgenda) {
        this.nomeAgenda = nomeAgenda;
        this.contatos = new ArrayList<>();
    }

    public String getNomeAgenda() {
        return nomeAgenda;
    }

    public void setNomeAgenda(String nomeAgenda) {
        this.nomeAgenda = nomeAgenda;
    }

    public ArrayList<Contato> getContatos() {
        return contatos;
    }

    public void setContatos(ArrayList<Contato> contatos) {
        this.contatos = contatos;
    }

    public void adicionarContato(String nome, String email, String telefone) {
        Contato novoContato = new Contato(nome, email, telefone);
        this.contatos.add(novoContato);
    }
    public Contato buscarContato(String nome) {
        for (Contato contato : this.contatos) {
            if (contato.getNomeContato().equals(nome)) {
                return contato;
            }
        }
        return null;
    }

    public void removerContato(Contato contato) {
        this.contatos.remove(contato);
    }
    public void mostrarContatos() {
        System.out.println("Contatos na agenda \"" + this.nomeAgenda + "\":");
        for (int i = 0; i < this.contatos.size(); i++) {
            Contato contato = this.contatos.get(i);
            System.out.println((i + 1) + ". Nome:" + contato.getNomeContato()+ " Telefone:" + contato.getTelefone());
    }
}


   
    
}
