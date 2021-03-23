import java.util.Scanner;

public class ContaVotos {
	public static void main(String[] args) {
		 
		int votos = 0;
		Scanner scan = new Scanner(System.in);
		int Jose = 0, Joao = 0, Pedro = 0, Mateus = 0, Nulo = 0, Branco = 0;
		int totalVotos;
		do {
			System.out.println("Para votar, você tem as seguintes opções:");
			System.out.println("Jose = 1 | Joao = 2 | Pedro = 3 | Mateus = 4 | Nulo = 5 | Branco = 6");
			System.out.println("Caso deseje finalizar a contagem das votações digite: 0");
			votos = scan.nextInt();
				
			switch (votos) {
			
			case 1:
				Jose++;
				break;
			case 2:
				Joao++;
				break;
			case 3:
				Pedro++;
				break;
			case 4:
				Mateus++;
				break;
			case 5:
				Nulo++;
				break;
			case 6:
				Branco++;
				break;
			}
		} while ((votos>0) && (votos<7));
		
			totalVotos=(Jose+Joao+Pedro+Mateus+Nulo+Branco);
		
			System.out.println("O total de votos para Jose foi de:" + Jose);
			System.out.println("O total de votos para Joao foi de:" + Joao);
			System.out.println("O total de votos para Pedro foi de:" + Pedro);
			System.out.println("O total de votos para Mateus foi de:" + Mateus);
			System.out.println("O total de votos nulos foi de:" + Nulo);
			System.out.println("O total de votos em branco foi de:" + Branco);
			System.out.println("O percentual de votos nulos foi de:" + ((float)Nulo/totalVotos)*100 + "%.");
			System.out.println("O percentual de votos brancos foi de:" + ((float)Branco/totalVotos)*100 + "%.");
			
			
	}		
	}
