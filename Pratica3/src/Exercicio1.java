import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
	double nota1, nota2, nota3, media;
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Digite a primeira nota: ");
	nota1 = input.nextDouble();
	
	System.out.println("Digite a primeira nota: ");
	nota2 = input.nextDouble();
	
	System.out.println("Digite a primeira nota: ");
	nota3 = input.nextDouble();
	
	media = (nota1 + nota2 + nota3) / 3; 
	System.out.printf("A média é: %.2f",media);
	}

}
