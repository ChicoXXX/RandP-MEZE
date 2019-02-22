

//Programa Alfredo xd 
public class Fibo {

	public static void main(String args[]) {
		
 
		//Variables
		int Num1=0;
		int Num2=1;
		int Temp=0;

		
		Temp = Num1;
		Num1 = Num2;
		//Condición
		for (int i=0; i<=100; i++) {
			
			if(Num1<i) //Aquí detenemos el contador {
				System.out.println(Num1);
				Temp = Num2 + Num1;
				Num1 = Num2;
				Num2 = Temp;
				
				
			}
		
			
		 }
			
	}

}
