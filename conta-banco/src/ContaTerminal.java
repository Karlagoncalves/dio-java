import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);


        System.out.println("CADASTRO DE NOVOS CLIENTES!");
        System.out.println("----------------------------");

        System.out.println("Por favor, digite o número da Conta: ");
        int numero = scan.nextInt();
        scan.nextLine();

        System.out.println("Por favor, digite o número da Agência: ");
		String agencia = scan.nextLine();

		System.out.println("Informe o nome do cliente: ");
		String nomeCliente = scan.nextLine();

        System.out.println("Informe o saldo inicial do cliente: ");
        Double saldo = null;
        while (saldo == null) {
            String input = scan.nextLine();
            try {
                saldo = Double.parseDouble(input);
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, insira um número válido para o saldo.");
            }
        }

        ContaDados novaConta = new ContaDados(numero, agencia, nomeCliente, saldo);

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " 
        + agencia + ", conta " + numero + " e seu saldo " + String.format("%.2f", saldo) + " já está disponível para saque.");

        System.err.println(novaConta);
    }
}


