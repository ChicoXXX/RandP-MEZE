

 import java.util.Scanner;

 public class Fibonacci {

 	public static void main(String[] args) {

 		//Objeto Entrada
		Scanner Entrada = new Scanner(System.in);

 		//Variables
		int numUno = 0;
                int numDos =1;
                int resultado=0;
		String Continuar="si";
		

 		//Inicia 1eros 10 Numeros Serie Fibonacci y los muestra en pantalla

			     for ( int i=0; i<=10; i++) {

 				   if(i < 9) {
					   System.out.println(numUno);
					   resultado = numUno+numDos;
					   numUno = numDos;
					   numDos = resultado;	


 				      }else {
                                             System.out.println(numUno);
                                         }
                                
		                    }
                     
                //Pregunta al Usuario Si desea Continuar para Mostrar los sig. 10 Números Serie Fibonacci

                     System.out.println("Desea continuar(si/no): ");
                     Continuar = Entrada.nextLine();
               
               //Inicia Ciclo y Condiciones (y/o Fin)

                    while(Continuar.equals("si")) {
                                for ( int i=0; i<=10; i++) {

 				   if(i < 9) {
					   System.out.println(numUno);
					   resultado = numUno+numDos;
					   numUno = numDos;
					   numDos = resultado;	


 				      }else {
                                             System.out.println(numUno);
                                         }
                                
		                    }

                       System.out.println("Desea continuar(si/no): ");
                     Continuar = Entrada.nextLine();
                                
		            }        

      }

 }