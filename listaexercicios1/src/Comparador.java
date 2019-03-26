import java.util.Scanner;

public class Comparador {
	
	private int atributo1, atributo2, atributo3; 
	
	public int getAtributo1(){
		return this.atributo1;
	}
	public void setAtributo1(int atributo1) {
		this.atributo1 = atributo1;
	}
	
	public int getAtributo2(){
		return this.atributo2;
	}
	public void setAtributo2(int atributo2) {
		this.atributo2 = atributo2;
	}
	
	public int getAtributo3(){
		return this.atributo3;
	}
	public void setAtributo3(int atributo3) {
		this.atributo3 = atributo3;
	}
	
	public int getMaior() {
		int maior = this.getAtributo1();
		if(maior < this.getAtributo2()) {
			maior = this.getAtributo2();
		}

		if(maior < this.getAtributo3()) {
			maior = this.getAtributo3();
		}
			
		
		return maior;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Comparador comparador = new Comparador();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero:");
		comparador.setAtributo1(input.nextInt());
		System.out.println("Digite o segundo numero:");
		comparador.setAtributo2(input.nextInt());
		System.out.println("Digite o terceiro numero:");
		comparador.setAtributo3(input.nextInt());
		
		System.out.printf("E o maior número foi: %d \n", comparador.getMaior()); 
		
		input.close();
	}

}
