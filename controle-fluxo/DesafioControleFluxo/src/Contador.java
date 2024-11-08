import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		String inputUm = scan.nextLine();
		System.out.println("Digite o segundo parâmetro");
		String inputDois = scan.nextLine();


		try {

			int parametroUm = Integer.parseInt(inputUm);
			int parametroDois = Integer.parseInt(inputDois);

			contar(parametroUm, parametroDois);

		
		}catch (ParametrosInvalidosException exception) {
			System.out.println("Erro: " + exception.getMessage());
		}catch(NumberFormatException e){
			System.err.println("Por favor, insira números inteiros válidos.");
		}
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {

		if(parametroUm > parametroDois){
			throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");

		}
		
		int contagem = parametroDois - parametroUm;

		for (int i = 1; i < contagem; i++) {
			System.out.println("Imprimindo o número: " + i);
			
		}
	}
	
}
