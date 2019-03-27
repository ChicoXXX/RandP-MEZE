/* Número aleatorio */
public class Random {
	public static void main(String arg[ ]) {
		Random r = new Random();
		for (int i = 0; i < 10; i++) {
			System.out.println((int)(Math.random() * ((10-5)+1))+5);
		}
	}
}
