import java.util.Scanner;

public class Estatistica {
	private int maiorValor;
	
	public Estatistica(int valor) {
		this.maiorValor = valor;
	}
	
	public int somatorio(){
		int acumulado = 0;
		for(int x = 1; x <= this.maiorValor; x++) {
			acumulado += x;
		}
		return acumulado;
	}
	
	public double media(){
		return this.somatorio()/(this.maiorValor+1.0);
	}
	
	private double parcelaVariancia(int numero, double media) {
		return (numero-media)*(numero-media);
	}
	
	public double variancia() {
		double acumulado = 0;
		double media = this.media();
		for(int x = 0; x <= this.maiorValor; x++) {
			acumulado += parcelaVariancia(x, media);
		}
		return acumulado / (this.maiorValor+1.0);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Digite o valor:");
		Scanner input = new Scanner(System.in);
		Estatistica estat = new Estatistica(input.nextInt());
		System.out.println(estat.somatorio());
		System.out.println(estat.media());
		System.out.println(estat.variancia());
		input.close();

	}

}
