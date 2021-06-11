import java.util.Scanner;


public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		

		
		System.out.println("Refetencia do Indice RCE");
		System.out.println("  - Sedentário Homem:  (0,15) ");
		System.out.println("  - Sedentário Mulher:  (0,15) ");
		
		System.out.println("  - Baixa Atividade Homem: (0,35)");
		System.out.println(" - Baixa Atividade Mulher: (0,30)");
		System.out.println("  - Média Atividade Homem: (0,45) ");
		System.out.println("  - Média Atividade Mulher: (0,40) ");
		System.out.println("  - Atividade Intensa Homem: (0,75)");
		System.out.println("  - Atividade Intensa Homem: (0,70)");
		System.out.println("  -Atividade Muito Intensa Homem (0,100):");
		System.out.println("  -Atividade Muito Intensa Mulher (0,90):");
		
		
		System.out.println("INFORME O PESO: ");
		double peso = sc.nextDouble();
		
		
		System.out.println("INFORME RCE: ");
		double rce = sc.nextDouble();
		
		
		// KG * 24.2 = KCAL
		double resultRce = peso * rce;
		
		System.out.println("Resultado RCE: " + resultRce);
		
		System.out.println("");
		
		System.out.println("DIGITE O INDICE RCE ");
		double indiceRce = sc.nextDouble();

		
				// DA
		//valorRCE * indiceRCE
		double resultDa = resultRce * indiceRce;
		
		System.out.println("Resultado DA: " + resultDa);
		
		System.out.println("");
		
		System.out.println("IEV: ");
		double iev = sc.nextDouble();
		
			
		// Resultado WCE
		// IEV * PESO
		
		double resultWce1 = iev * peso;
		
		System.out.println("RESULTADO WCE: " + resultWce1);
		
		System.out.println("");
		
		System.out.println("TEF: ");		
		double tef = sc.nextDouble();
		
	
		
		double resultWce2 = tef * resultWce1 ;	
		System.out.println("RESULTADO PESO * TEF : " + resultWce2);
		
		System.out.println("");
		
		// IEV + PESO + TEF
		
		double resultWCE = resultWce2 + resultDa + resultRce ;
		System.out.println("GASTO TOTAL DO EXERCICIO: " + resultWCE);
		
	}

}