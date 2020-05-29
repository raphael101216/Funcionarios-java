import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Funcionarios {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");

		String nome, digitarOutro;
		int horasTrabalhadas, opcao;
		double valorHora;

		// "Leitura dos dados"
		do {

			System.out.print("Nome: ");
			nome = sc.next();
			System.out.print("Horas trabalhadas: ");
			horasTrabalhadas = sc.nextInt();

			while (horasTrabalhadas <= 0) {
				System.out.println();
				System.out.println("Horas Trabalhadas n�o podem ser negativas, digite horas trabalhadas novamente!");
				System.out.println();
				System.out.print("Horas trabalhadas: ");
				horasTrabalhadas = sc.nextInt();
			}

			System.out.print("Valor por hora: ");
			valorHora = sc.nextDouble();

			while (valorHora <= 0.00) {
				System.out.println();
				System.out.println("Valor por hora n�o podem ser negativas, digite Valor por hora novamente!");
				System.out.println();
				System.out.print("Valor por hora: ");
				valorHora = sc.nextDouble();
			}

			System.out.print("Digitar outro (S/N)? ");
			digitarOutro = sc.next();

		} while (digitarOutro.equals("S"));

		// "Menu repetindo"
		
		do {
			
		  System.out.println();
		  System.out.println("MENU");
		  System.out.println("1 - Total de horas trabalhadas");
		  System.out.println("2 - Custo total");
		  System.out.println("3 - Nome da pessoa que ganhou mais");
		  System.out.println("4 - Sair");
		  System.out.print("Digite uma op��o: ");
		  opcao = sc.nextInt();
		  
		  
		}while(opcao != 4);
		
		
		
	}

}
