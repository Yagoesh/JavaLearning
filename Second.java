import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Second {
  public static void main(String[] args) { 
    Scanner in = new Scanner(System.in);
    String nombre = "";
    String nombreDos = "Yogi";
    int numUno = 0 , numDos = 0 , resultado = 0;
    System.out.println("Cual es tu nombre?");
    nombre = in.nextLine();
    String name = "Yogesh";
    System.out.println("hola " + nombre + " sumemos 2 numeros : di un numero ... ");
    numUno = in.nextInt();
    System.out.println("vale, ahora qué quieres sumar a " + numUno + "?" );
    numDos = in.nextInt();
    resultado = numUno + numDos;
    System.out.println("el resultado de la suma de " + numUno + " y " + numDos + " es " + resultado);
    if (nombre.equalsIgnoreCase(nombreDos)) {
      System.out.println("good");
    } else {
      System.out.println("bad");
    }
    List<String> myArray = new ArrayList();
    myArray.add(name);
    System.out.println(myArray);
  }
}
