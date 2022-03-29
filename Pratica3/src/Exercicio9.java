import java.util.Scanner;
public class Exercicio9 {

	public static void main(String[] args) {
	double cateto1, cateto2, hipotenusa;
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Digite o valor do primeiro cateto: ");
	cateto1 = input.nextDouble();
	
	System.out.println("Digite o valor do segundo cateto: ");
	cateto2 = input.nextDouble();
	
	hipotenusa = Math.sqrt(Math.pow(cateto1, 2)+Math.pow(cateto2, 2));
	System.out.println("O valor da hipotenusa é: "+ hipotenusa);
	
	}

}
