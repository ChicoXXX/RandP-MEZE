
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
	
		//Objeto Entrada
		Scanner Entrada = new Scanner(System.in);
		
		//Variables
		int Num1 = 0, Num2 = 1, Temp = 0, Limite=0;
		String Continuar="Si";
	
		
		//Perición de datos
		System.out.println("Ingresa tu primer número");
		Num1 = Entrada.nextInt();
		System.out.println("Ingresa tu segundo número");
		Num2 = Entrada.nextInt();
		System.out.println("Ingresa tu limite");
		Limite = Entrada.nextInt();
		System.out.println("");
				
		
		//Condicones
		
		
		while(Continuar.equals("Si")) {
			for ( int i=0; i<=Limite; i++) {
				 
				if(Num1>i) {
					System.out.println(Num1);
					Temp = Num1+Num2;
					Num1 = Num2;
					Num2 = Temp;	
					
					
				}else
					System.out.println("¿Desea continuar? (Si/No)");
					Continuar = Entrada.nextLine();
		}
		
		/*
		for (int i=0; i<=Limite; i+=10) {
		 
			if(Num1<i) {
				System.out.println(Num1);
				Temp = Num1+Num2;
				Num1 = Num2;
				Num2 = Temp;	
				
				continue;
			}
				
			
				
		}*/
  
	}
		
  }
	
}
