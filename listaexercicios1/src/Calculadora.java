import java.util.Scanner;

public class Calculadora {

	public double somar(double n1, double n2) {
		return n1 + n2;
	}
	
	public double subtrair(double n1, double n2) {
		return n1 - n2;
	}
	
	public double multiplicar(double n1, double n2) {
		return n1 * n2;
	}
	
	public double dividir(double n1, double n2) {
		return n1 / n2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n1, n2;
		char operando;
		
		Scanner input = new Scanner(System.in);
		Calculadora calc = new Calculadora();
		
		System.out.println("Digite o primeiro numero:");
		n1 = input.nextDouble();
		System.out.println("\nDigite o segundo numero:");
		n2 = input.nextDouble();
		System.out.println("\nDigite o operando (+, -, *, /):");
		operando = input.next().charAt(0);
		
		switch(operando) {
			case '+':
				System.out.printf("O resultado foi: %f", calc.somar(n1, n2));
			break;
			case '-':
				System.out.printf("O resultado foi: %f", calc.subtrair(n1, n2));
			break;
			case '*': 
				System.out.printf("O resultado foi: %f", calc.multiplicar(n1, n2));
			break;
			case '/': 
				System.out.printf("O resultado foi: %f", calc.dividir(n1, n2));
			break;
			default:
				System.out.println("Operando inválido!");
			break;
		}
		input.close();
	}
}
