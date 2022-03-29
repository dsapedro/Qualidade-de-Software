import java.util.Scanner;
public class Exercicio11 {

	public static void main(String[] args) {
	double numero, resultado; 
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Digite o número desejado: ");
	numero = input.nextDouble();
	
	for (int i = 0; i<11; i++) {
		resultado = numero * i;
		System.out.println(numero+ " x " + i + "= "+ resultado);
	}

	}

}
