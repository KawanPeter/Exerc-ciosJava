import java.util.Scanner;

public class SaltoDistancia {

	public static void main(String[] args) {
		
		String nome;
		Scanner ler = new Scanner (System.in);
		System.out.println("Ol� atleta! Informe o seu nome: ");
		nome = ler.nextLine();
		
		Scanner cont = new Scanner (System.in);
		System.out.println("Informe a dist�ncia do primeiro salto: ");
		Integer salto1 = cont.nextInt();
		System.out.println("Informe a dist�ncia do segundo salto: ");
		Integer salto2 = cont.nextInt();
		System.out.println("Informe a dist�ncia do terceiro salto: ");
		Integer salto3 = cont.nextInt();
		System.out.println("Informe a dist�ncia do quarto salto: ");
		Integer salto4 = cont.nextInt();
		System.out.println("Informe a dist�ncia do quinto salto: ");
		Integer salto5 = cont.nextInt();
		
		System.out.println("Resultado final: ");
		System.out.println("Atleta: " + nome);
		System.out.println("Saltos: " + salto1 + "m," + salto2 + "m," + salto3 + "m," + salto4 + "m," + salto5 + "m.");		
		Integer media = media(salto1, salto2, salto3, salto4, salto5);
		System.out.println("Resultado da media dos saltos � de: " + media);

	}
	
	public static Integer media(Integer s1, Integer s2, Integer s3, Integer s4, Integer s5) {
		return (s1 + s2 + s3 + s4 + s5)/5;
	}
	
	
	

}
