import java.util.Scanner;
public class Exercicio10 {

	public static void main(String[] args) {
	double raio, comprimento, area, volume;
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Digite o valor do raio: ");
	raio = input.nextDouble();
	
	comprimento = 2 * Math.PI * raio;
	area = Math.PI * Math.pow(raio, 2);
	volume = Math.PI * Math.pow(raio, 3) * 3 / 4;
	
	System.out.println("O comprimento da esfera é: " + comprimento);
	System.out.println("A área da esfera é: " + area);
	System.out.println("O volume da esfera é: " + volume);

	}

}
