public class analisarProposta {

    static void analisarCandidato(double salarioPretendido){
        double salarioBase  = 2000.0;

        if(salarioBase > salarioPretendido){
            System.err.println("LIGAR PARA O CANDIDATO");
        }else if (salarioBase == salarioPretendido) {
            System.err.println("LIGAR PARA O CANDIDATO com contra proposta");

        }else{
            System.err.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATO");

        }

}
    
}
