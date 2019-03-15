// Separar un numero en unidades, decenas, etc.
import java.util.Scanner;
public class modulo {
    public static void main(String[] args) {
    int Numero;
    int dMillar, uMillar, Centenas, Decenas, Unidades;

    System.out.print("Introduzca un número: ");
    Scanner Entrada = new Scanner(System.in);
    Numero = Entrada.nextInt();
    // unidades
    Unidades = Numero % 10;
    Numero = Numero / 10;
    // decenas
    Decenas = Numero % 10;
    Numero = Numero / 10;
    // centenas
    Centenas = Numero % 10;
    Numero = Numero / 10;
    // unidades de millar
    uMillar = Numero % 10;
    Numero = Numero / 10;
    // decenas de millar
    dMillar = Numero;
    // lo mostramos en pantalla
    System.out.println (dMillar + " decenas de millar ; " + uMillar + " unidades de millar ; " + Centenas + " centenas ; " + Decenas + " decenas ; " + Unidades + " unidades.");
    }
}
