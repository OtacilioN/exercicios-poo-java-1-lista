import java.util.Scanner;

public class ComparadorDeStrings {
	
	public static boolean compara(String prova, String Teste) {	
		String reverse = "";
		
		for(int i = prova.length() - 1; i >= 0; i--)
		{
			reverse = reverse + prova.charAt(i);
		}
		
		if(reverse.equals(Teste))
			return true;
		else
			return false;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String prova, teste;
		
		System.out.println("Digite a string de prova:");
		prova = input.next();
		
		System.out.println("Digite a string de teste:");
		teste = input.next();
		
		System.out.println(ComparadorDeStrings.compara(prova, teste));
		input.close();
	}

}
