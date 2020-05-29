import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Funcionarios {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
        
		String nome, digitarOutro;
		int horasTrabalhadas;
		double valorHora;
		
		//"Leitura dos dados"
		do {
			
		
		  System.out.print("Nome: ");
		  nome = sc.next();
		  System.out.print("Horas trabalhadas: ");
		  horasTrabalhadas = sc.nextInt();
		  
		  while(horasTrabalhadas <= 0) {
			    System.out.println();
		    	System.out.println("Horas Trabalhadas não podem ser negativas, digite horas trabalhadas novamente!");
		    	System.out.println();
		    	System.out.print("Horas trabalhadas: ");
		    	horasTrabalhadas = sc.nextInt();		    }
		  
		  System.out.print("Valor por hora: ");
		  valorHora = sc.nextDouble();
		  
		  while(valorHora <= 0.00){
			    System.out.println();
		    	System.out.println("Valor por hora não podem ser negativas, digite Valor por hora novamente!");
		    	System.out.println();
		    	System.out.print("Valor por hora: ");
		    	valorHora = sc.nextDouble();
		    }
		  
		  System.out.print("Digitar outro (S/N)? ");
		  digitarOutro = sc.next();
		
		}while(digitarOutro.equals("S"));
		   
		    
		    
		
	}

}
