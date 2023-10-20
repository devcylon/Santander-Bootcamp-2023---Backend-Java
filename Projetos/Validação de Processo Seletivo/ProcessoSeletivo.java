import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        analisarCandidato(1800.0);
        selecaoCandidatos();
        imprimirSelecionados();
        String[] candidatos= {"Filepe","Marcia","Julia","Augusto","Mônica"};
        for (String c : candidatos) {
            entrandoEmContato(c);
        }
    }

    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do{
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando) {
                tentativasRealizadas++;
            } else System.out.println("Contato realizado com sucesso");

        }
        while(continuarTentando && tentativasRealizadas<3);
    
        if(atendeu)System.out.println("conseguimos contato com " + candidato + " na" + tentativasRealizadas +" tentativa");
        else System.out.println("Não conseguimos contato com "+ candidato + ", número máximo de tentativas"+ tentativasRealizadas);
}
    static boolean atender(){
        return new Random().nextInt(3) == 1;
    }
    static void imprimirSelecionados(){
        String[] candidatos= {"Filepe","Marcia","Julia","Augusto","Mônica"};
        for (String c : candidatos) {
            System.out.println(c);
        }
    }
    static void selecaoCandidatos(){
        String[] candidatos= {"Filepe","Marcia","Julia","Augusto","Mônica","Fabricio","Mirela","Daniela","jose"};
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while(candidatosSelecionados < 5 &&  candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido =valorPretendido();
        
            System.out.println("O candidato " +candidato+ " solicitou este valor de salário "+ salarioPretendido);
            if(salarioBase>=salarioPretendido){
                System.out.println("o candidato "+ candidato+ " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        
        }
        
    }
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }


    static void analisarCandidato(double salarioPretendido){
        double salarioBase=2000.0;
        if(salarioBase > salarioPretendido)System.out.println("Ligar para o candidato");
        else if(salarioBase == salarioPretendido)System.out.println("Liga para o candidato com contra proposta");
        else System.out.println("Aguardando o resultado dos demais candidatos");
    }
}
