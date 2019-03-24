public class SumaMatrices {

	public static void main (String args[]) {

		int i; //Columnas
		int j; //Filas		
		int SumaCol;
		//Matriz 
		int Matriz [][]= new int[3][3];

		
		for(i=0; i<Matriz.length;i++) {
		
			for(j=0; j<Matriz.length; j++) {
				
				//Rellenar la matriz de forma aleatoria
				 Matriz[i][j] = (int) (Math.random()*9+1);
				 
				System.out.print(" "+"["+i+","+j+"] = "+ Matriz[i][j]);
		
			}
			//Imprimir la matriz más ordenada xd 
			System.out.println("");	
		}
		
		System.out.println("");	
		
		/*
		 * Suma de columnas 
		 * Para poder sumarlas se tiene que invertir las variables j e i 
		 * */
			
		for(j=0; j<Matriz.length;j++) {
			//Se iguala a 0 
			SumaCol=0;
			
			for(i=0; i<Matriz.length; i++) {
			//Suma de las columnas
				SumaCol += Matriz[i][j];
				}
			System.out.println("La suma de las columnas es " + SumaCol);	
			}
	}
}