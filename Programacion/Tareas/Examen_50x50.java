/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen_50x50;

/**
 *
 * @author angelgabriel
 */
public class Examen_50x50 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      int matriz [][] = new int [50][50];
      int columnas =0;
      int filas = 0;
            
      //for para crear matriz y llenarla automaticamente
        for (columnas =0; columnas<matriz.length; columnas++)
        {
             for (filas = 0 ; filas<matriz.length; filas++)
             {
                   matriz [columnas][filas] = (int) (Math.random()*100+1);
             } 
            
        }
        
        //for para motrarlo desordenado
        
        System.out.println("Matriz Desordenada");
         String resultado ="";
         for (columnas =0; columnas<matriz.length; columnas++)
        {
             for (filas = 0 ; filas<matriz.length; filas++)
             {
                 resultado +=matriz[filas][columnas];
                 resultado += "      ";  
             } 
              resultado +="\n";    
        }
        
          System.out.println(resultado);  

          System.out.println("\n");
           System.out.println("Matriz Ordenada");
           
           
           
           //ordenamiento de burbuja y comparacion de elementos dentro de la matris
           //creacion de 4 for para comparar elementos 1 elemeno con 1 elemento en 2 matrices diferentes 
           for(int a =0 ; a<matriz.length; a++)
           {
              for(int b =0 ; b<matriz.length; b++)
              {
                 for(int c =0 ; c<matriz.length; c++)
                     
                 {
                  for(int d=0 ; d<matriz.length; d++)
                        
                    { 
                        if(matriz[a][b]< matriz[c][d])
                        {
                           int temp = matriz[a][b];
                           matriz[a][b]= matriz[c][d];
                           matriz [c][d] = temp;
                        }
                        
                    }
                 
                 }
              }
                  
           }
           
           //mostrando mi matris ordenada
             String resultado_1="";
           for (columnas=0; columnas<matriz.length;columnas++)
           {
              for (filas=0; filas<matriz.length; filas++)
              {
                 resultado_1 +=matriz[columnas][filas];
                 resultado_1 += "      ";  
              }
              resultado_1 +="\n";    
           }
           
          System.out.println(resultado_1);  
    }
             
}