
//  sacar los números pares entre el numero 500 y el 1000
public class CicloFor
{
    public static void main(String args[])
    {
        for(int i=500;i<=1000;i+=2)
        {
		/* Ciclo agregado para mostrar
		   un ciclo dentro de otro cilco*/
		for (int j=1;j<=5;j++)
		{
			System.out.println(j);
		}
            System.out.println(i);
        }
    }
}

