import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um n�mero inteiro: "); //pedindo o primeiro n�mero
		Integer numero1 = scan.nextInt(); 				  //recebendo o primeiro n�mero
		System.out.println("Digite outro n�mero inteiro: ");	//pedindo o segundo n�mero
		Integer numero2 = scan.nextInt();						//recebendo o segundo n�mero
		scan.close(); 			//fechando o recebimento por scan
		
		Integer soma = soma(numero1, numero2);
		System.out.println("Resultado da soma de:" + numero1 + "+" + numero2 + "=" + soma);
		
		Integer sub = sub(numero1, numero2);
		System.out.println("Resultado da subtra��o de:" + numero1 + "-" + numero2 + "=" + sub);
		
		Integer divi = divi(numero1, numero2);
		System.out.println("Resultado da divis�o de:" + numero1 + "/" + numero2 + "=" + divi);
		
		Integer mult = mult(numero1, numero2);
		System.out.println("Resultado da multiplica��o de:" + numero1 + "*" + numero2 + "=" + mult);
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
