import java.util.Scanner;
public class Exercicio5 {

	public static void main(String[] args) {
	double diagonalMaior, diagonalMenor, area;
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Digite o valor da diagonal maior do losango: ");
	diagonalMaior = input.nextDouble();
	
	System.out.println("Digite o valor da diagonal menor do losango: ");
	diagonalMenor = input.nextDouble();
	
	area = diagonalMaior * diagonalMenor / 2;
	System.out.println("Área do losango: "+ area);
	
	}

}
