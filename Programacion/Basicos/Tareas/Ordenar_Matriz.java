/* MAtriz de 50x50 con números random de manera desordenada, y ordenarlos de menor a mayor, 
 * que se muestre de forma 
 * original y ordenada
 */

public class Ordenar_Matriz {

	public static void main(String[] args) {

	
		//Variables
		int i, j, k, l, Temp=0; // i = Filas, j = Columnas
		
		//Matriz
		int Matriz [][]= new int[50][50];
		
		//Matriz desoredenada
				System.out.println("Matriz Desordenada");
				for(i=0; i<Matriz.length; i++) {

					for(j=0; j<Matriz.length; j++) {

					//Llenado de la matriz del 1 al 100 de forma random 
						 Matriz[i][j] = (int) (Math.random()*100+1);
						 
						 //Imprime la matriz con su posición de cada elemento
						 System.out.print(" ["+i+","+j+"] = "+ Matriz[i][j]);
					}
					//Salto de línea para mostrar la matriz más ordenada
					System.out.println("");
				}

				System.out.println("");
				
			//Matriz Ordenada
				System.out.println("Matriz Ordenada");
				//Se usan 4 for para que vayan comparando las filas y columnas, si los hacía por separado solo venía un solo número
				for(i=0; i<Matriz.length; i++) {
					for(j=0; j<Matriz.length; j++) {
						for(k=0; k<Matriz.length; k++) {
							for(l=0; l<Matriz.length; l++) {
								if(Matriz[i][j]<Matriz[k][l]) {
									Temp=Matriz[i][j];
									Matriz[i][j]=Matriz[k][l];
									Matriz[k][l]=Temp;	
							}//End if
						   }//End for l				 
						}//End for k
					} // End for j
				}//End for i
				
				//For para imprimir la matriz oredenada
				for(i =0; i<Matriz.length; i++) {
					for( j=0; j<Matriz.length; j++) {
						System.out.print(" ["+i+","+j+"] = "+Matriz[i][j]);
					}
					System.out.println("");
				}
		   }	
	}
