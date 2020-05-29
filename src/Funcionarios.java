import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Funcionarios {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");

		String nome, digitarOutro;
		int horasTrabalhadas, opcao, somaHorasTrabalhadas = 0;
		double valorHora, custoTotal = 0, somaValorHoras = 0;

		// "Leitura dos dados"
		do {

			System.out.print("Nome: ");
			nome = sc.next();
			System.out.print("Horas trabalhadas: ");
			horasTrabalhadas = sc.nextInt();
			
			if(horasTrabalhadas > 0) {
				somaHorasTrabalhadas += horasTrabalhadas;
			}
			
			

			while (horasTrabalhadas <= 0) {
				System.out.println();
				System.out.println("Horas Trabalhadas não podem ser negativas, digite horas trabalhadas novamente!");
				System.out.println();
				System.out.print("Horas trabalhadas: ");
				horasTrabalhadas = sc.nextInt();
				
				if(horasTrabalhadas > 0) {
					somaHorasTrabalhadas += horasTrabalhadas;
				}
				
			}

			System.out.print("Valor por hora: ");
			valorHora = sc.nextDouble();
			
			if(valorHora > 0) {
				somaValorHoras += valorHora;
				custoTotal = (horasTrabalhadas * somaValorHoras);
			}

			while (valorHora <= 0.00) {
				System.out.println();
				System.out.println("Valor por hora não podem ser negativas, digite Valor por hora novamente!");
				System.out.println();
				System.out.print("Valor por hora: ");
				valorHora = sc.nextDouble();
				
				if(valorHora > 0) {
					somaValorHoras += valorHora;
					custoTotal = (horasTrabalhadas * somaValorHoras);
				}
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
		  System.out.print("Digite uma opção: ");
		  opcao = sc.nextInt();
		  
		//"Tratativas 1 e 2"
		  
		   if(opcao == 1) {
			   
			   System.out.println();
			   System.out.println("Total de horas = " + somaHorasTrabalhadas);
			    
		   }else if(opcao == 2) {
			   
			   System.out.println();
			   System.out.println("Custo total = R$ " + df.format(custoTotal));
		   }
		  
		  
		}while(opcao != 4);
		
		
		
		  
		
	}

}
