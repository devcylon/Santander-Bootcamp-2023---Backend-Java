package Collections.Set.Pesquisa;

import java.util.Set;

public class AgendaContato {
    private Set<Contato> contatoSet;

    public AgendaContato() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }
    
    public void exibirContato(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisaPorNome(String nome){
        Set<Contato> contatoPorNome = new HashSet<>();
        for (Contato c : contatoSet) {
            if(c.getNome().startsWith(nome)){
                contatoPorNome = c;
            }   
        }
    }

    public Set<Contato> atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet) {
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNome(novoNumero);
                contatoAtualizado = c;
                break;
            }   
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContato agendaContato = new AgendaContato();
        agendaContato.exibirContato();
        agendaContato.adicionarContato("Cylon", 123456);
   
        agendaContato.exibirContato();

   
    }
}
