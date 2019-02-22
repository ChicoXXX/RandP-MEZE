
public class fibonacci_dos {

	public static void main(String args[]) {
   
		
			 //Declaracion de Variables

				int Numero1=0;
				int Numero2=1;
				
				
				//Variable temporal
				
				int Resultado=0;


				  //Condición

		 		Resultado=Numero1;
				Numero1=Numero2;
				
				for (int i=0; i<=100; i++) 
				{

		 			if(Numero1<i) //Aquí se detiene nuestro contador {
		 				
						
						Numero1 = Numero2;
						Numero2 = Resultado;
						
						Resultado = Numero2 + Numero1;
						System.out.println(Numero1);


		}

	}

}