import java.util.Random;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        //analisarProposta.analisarCandidato(900.0);
        //selecionarCandidatos.selecaoCandidatos();
        //imprimirSlecionados();

        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA"};

        for (String candidato : candidatos) {
            ligarCandidatos(candidato);
        }
    }

    
    static void imprimirSlecionados(){
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA"};

        for (String candidato : candidatos) {
            System.out.println("O candidato selecionado foi " + candidato);
        }

    }

    static void ligarCandidatos(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do{
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando) {
                tentativasRealizadas++;
            }else
                System.err.println("Contato realizado com sucesso ");
        }while(continuarTentando && tentativasRealizadas< 3);

        if (atendeu) {
            System.err.println("Conseguimos contato com " + candidato + " na " + tentativasRealizadas + " tentativa.");
        }else
            System.err.println("Nao conseguimos contato com " + candidato + " número máximo de tentativas realizadas.");

    }

    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

}

