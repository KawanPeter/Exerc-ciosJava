import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro: "); //pedindo o primeiro número
		Integer numero1 = scan.nextInt(); 				  //recebendo o primeiro número
		System.out.println("Digite outro número inteiro: ");	//pedindo o segundo número
		Integer numero2 = scan.nextInt();						//recebendo o segundo número
		scan.close(); 			//fechando o recebimento por scan
		
		Integer soma = soma(numero1, numero2);
		System.out.println("Resultado da soma de:" + numero1 + "+" + numero2 + "=" + soma);
		
		Integer sub = sub(numero1, numero2);
		System.out.println("Resultado da subtração de:" + numero1 + "-" + numero2 + "=" + sub);
		
		Integer divi = divi(numero1, numero2);
		System.out.println("Resultado da divisão de:" + numero1 + "/" + numero2 + "=" + divi);
		
		Integer mult = mult(numero1, numero2);
		System.out.println("Resultado da multiplicação de:" + numero1 + "*" + numero2 + "=" + mult);
	}
		
		public static Integer soma(Integer n1, Integer n2) {
			return n1 + n2;	
		}
		
		public static Integer sub(Integer n1, Integer n2) {
			return n1 - n2;	
		}
		
		public static Integer divi(Integer n1, Integer n2) {
			return n1 / n2;	
		}
		
		public static Integer mult(Integer n1, Integer n2) {
			return n1 * n2;	
		}	
		
	

}
