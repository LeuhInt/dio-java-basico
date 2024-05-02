import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Candidato {
    final double SALARIO = 2000;
    double salariopretendido;
    int candidatoSelecionado = 0;
    int candidatoAtual = 0;
    String [] candidatos = {"Felipe", "Márcia", "João", "Maria", "Lucas", "Túlio", "André", "Carlos", "Gilmar", "Eudes"};
    List<String> candidadosSelecionados = new ArrayList<>();

    public void selecionarCandidato(){
        while(candidatoSelecionado < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            salariopretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou este valor de salário" + salariopretendido);

            if (SALARIO >= salariopretendido) {
                candidadosSelecionados.add(candidato);
                candidatoSelecionado++;
            }
            candidatoAtual++;
        }
    }

    public void analisarCandidato(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o salário pretendido: ");
        salariopretendido = scanner.nextDouble();

        if(SALARIO > salariopretendido){
            System.out.println("Ligar para candidato: ");
        } else if (SALARIO == salariopretendido) {
            System.out.println("Ligar para candidato com contra proposta: ");
        } else
            System.out.println("Aguardando o resultado dos demais candidatos: ");
    }

    static double valorPretendido () {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    public void listarCandidatosSelecionados() {
        for (String candidato : candidadosSelecionados) {
            System.out.println("Candidato selecionado foi: " + candidato);
        }
    }

    public void realizarLigacao() {
        for (String candidato : candidadosSelecionados) {
            int tentativasRealizadas = 1;
            boolean continuarTentando = true;
            boolean atendido = false;
            do {
                atendido = atender();
                continuarTentando = !atendido;
                if (continuarTentando) {
                    tentativasRealizadas++;
                } else
                    System.out.println("Contato com " + candidato + " realizado com sucesso");
            } while (continuarTentando && tentativasRealizadas < 3);
            // condição após sair do while
            if (atendido) {
                System.out.println(candidato + " atendeu a ligação depois de " + tentativasRealizadas + " tentativas");
            } else
                System.out.println(candidato + " não atendeu a ligação depois de " + tentativasRealizadas + " tentativas");
        }

    }
    static boolean atender() {
        return new Random().nextInt(3)==1;
    }
}
