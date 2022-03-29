import java.util.Scanner;
public class Exercicio4 {

	public static void main(String[] args) {
	double salario, novoSalario;
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Digite o salário do funcionário: ");
	salario = input.nextDouble();
	
	novoSalario = salario * 1.25;
	System.out.println("O novo salário é: "+ novoSalario);

	}

}
