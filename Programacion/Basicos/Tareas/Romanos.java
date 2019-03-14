import java.util.Scanner;
public class Romanos {

	public static void main(String[] args) {
		
		//Objeto Entrada 
		Scanner Entrada = new Scanner(System.in);
		
		int Num=0, Unidades, Decenas;
		
		//Petición de número
		
		System.out.println("Ingresa el números");
		Num = Entrada.nextInt();
		
		Decenas = Num/10; 
		Unidades = Num/10;
		
		
		//Condiciones
		switch(Unidades) {
	        case 1: System.out.print("I"); 
	        break;	
		    case 2: System.out.print("II"); 
		    break;
		    case 3: System.out.print("III"); 
		    break;
		    case 4: System.out.print("IV"); 
		    break;	
		    case 5: System.out.print("V"); 
		    break;
		    case 6: System.out.print("VI"); 
		    break;
		    case 7: System.out.print("VII"); 
		    break;	
		    case 8: System.out.print("VIII"); 
		    break;
		    case 9: System.out.print("IX"); 
		    break;
		   
           }
		switch(Decenas) {
			case 1: System.out.print("X"); 
			break;	
			case 2: System.out.print("XX"); 
			break;
			case 3: System.out.print("XXX"); 
			break;
			case 4: System.out.print("XL"); 
			break;	
			case 5: System.out.print("L"); 
			break;
			case 6: System.out.print("LX"); 
			break;
			case 7: System.out.print("LXX"); 
			break;	
			case 8: System.out.print("LXXX"); 
			break;
			case 9: System.out.print("XC"); 
			break;
				
		
		}

	

	}

}
