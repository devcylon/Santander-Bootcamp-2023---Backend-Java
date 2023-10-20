import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }
    
    public void adicionarConvidado(String name, int codigoConvite){
        convidadoSet.add(new Convidado(name, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for( Convidado e : convidadoSet){
            if(e.getCodigoConvite()== codigoConvite){
                convidadoParaRemover = e;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }
    public int contarConvidado(){
        return convidadoSet.size();
    }
    public void exibirConvidado(){
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Existem "+conjuntoConvidados.contarConvidado()+" dentro do set de convidados");
    
        conjuntoConvidados.adicionarConvidado("convidado1", 1234);
        conjuntoConvidados.adicionarConvidado("convidado2", 1235);
        conjuntoConvidados.adicionarConvidado("convidado3", 1236);
        conjuntoConvidados.adicionarConvidado("convidado4", 1234);
        System.out.println("Existem "+conjuntoConvidados.contarConvidado()+" dentro do set de convidados");
        
        conjuntoConvidados.exibirConvidado();
        conjuntoConvidados.removerConvidadoPorCodigoConvite(1234);
        conjuntoConvidados.exibirConvidado();
    }

}


