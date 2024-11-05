public class ContaDados {
    int numero;
    String agencia;
    String nomeCliente;
    Double saldo;

    ContaDados(int numero, String agencia, String nomeCliente, Double saldo){
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conta Cadastrada: { " +
                "Nome Cliente = '" + nomeCliente + '\'' +
                ", numero =  '" + numero + '\'' +
                ", agencia = '" + agencia + '\'' +
                ", saldo = ' " + saldo + '\''+
                '}';
    }
}


