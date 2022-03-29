import java.util.Scanner;
public class Exercicio7 {

	public static void main(String[] args) {
	double salarioMinimo, salarioFuncionario, quantidade;
	
	Scanner input = new Scanner(System.in);

	System.out.println("Digite o valor do salário Mínimo: ");
	salarioMinimo = input.nextDouble();
	
	System.out.println("Digite o valor do salário do Funcionário: ");
	salarioFuncionario = input.nextDouble();
	
	quantidade = salarioFuncionario / salarioMinimo;
	System.out.println("Este funcionário recebe "+quantidade+" salários mínimos.");
	
	}

}
