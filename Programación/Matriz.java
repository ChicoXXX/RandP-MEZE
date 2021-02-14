package Examen;


                            

public class Matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub;
		
		//Declaro mis variables que voy a utilizar para poder crear mi matriz de 100x100  
		int columnas;
		int filas;
		int aux;
		int cont =0;
		int i , j ;
		
		//Declaro mi matriz de 100x100
		int Mimatriz50x50 [][] = new int [50][50];
		
		System.out.println("");
		System.out.println("");
		System.out.println("Matriz Desordenada....");
		System.out.println("");
		System.out.println("");
		
		for(filas=0; filas<Mimatriz50x50.length; filas++) {
			
			for(columnas=0; columnas<Mimatriz50x50.length; columnas++) {
				
				//SE INGRESAN LOS NUMEROS CON UN RANDOM PARA LLENAR LA MATRIZ
				
				Mimatriz50x50[filas][columnas] = (int) (Math.random()*101);
				System.out.print("");	
				System.out.print(" "+"["+filas+","+columnas+"] = "+ Mimatriz50x50[filas][columnas]);
			}
			    System.out.println("");
			    System.out.println("");
			    System.out.println("");
		
		}
		
		
		//Ordenación de Matriz de menor a mayor
		
        for(filas=0; filas<Mimatriz50x50.length; filas++) {
			
			for(columnas= 0; columnas< Mimatriz50x50.length; columnas++) {
				for (int x= 0; x < Mimatriz50x50.length; x++) {
					for(int y =0; y <Mimatriz50x50.length; y++) {
						if(Mimatriz50x50 [filas][columnas] < Mimatriz50x50 [x][y]) {
							aux = Mimatriz50x50[filas][columnas];
							Mimatriz50x50[filas][columnas] = Mimatriz50x50 [x][y];
							Mimatriz50x50[x][y] = aux;
							
						      }
						
					       }
					
				       }
				
				     }
				
			     }
		
        System.out.println("");
        System.out.println("");
        System.out.println("Matriz Ordenada de Menor a Mayor....");
        System.out.println("");
        
        
           for(filas=0; filas<Mimatriz50x50.length; filas++) {
			
			  for(columnas=0; columnas<Mimatriz50x50.length; columnas++) {
				
				System.out.print("");	
				System.out.print(" "+"["+filas+","+columnas+"] = "+ Mimatriz50x50[filas][columnas]);
			}
			    System.out.println("");
			    System.out.println("");
			    System.out.println("");
		
		}



	

        
        
		}
}