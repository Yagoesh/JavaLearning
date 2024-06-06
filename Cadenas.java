import java.util.Scanner;

public class Cadenas {
  public static void main(String[] args) {
    String inicio = "" ,  recortada = "" ;
    int totalChar = 0 , first = 0 , last = 0 ;
    Scanner frase = new Scanner(System.in);
    System.out.println("introduce una frase");
    inicio = frase.nextLine();
    totalChar = inicio.length();
    System.out.println("La frase " + inicio + " tiene " + totalChar + " caracteres");

    System.out.println("desde donde quieres cortar");
    first = frase.nextInt();

    System.out.println("cortamos desde " + first + " hasta donde quieres cortar?");
    last = frase.nextInt();
    recortada = inicio.substring(first, last);

    System.out.println("tu frase cortada es : " + recortada);

frase.close();
    }
}
