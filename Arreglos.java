import java.util.Scanner;

public class Arreglos {
  public static void main(String[] args) {
    int largura = 0;
    
    Scanner arrays = new Scanner(System.in);
    System.out.println("pon una largura");
    largura = arrays.nextInt();

    int numeros[] = new int[largura];

    for(int i = 0 ; i < numeros.length ; i++) {
      System.out.println("dame el valor de la posicion " + (i + 1 ));
    
      numeros[i] = arrays.nextInt();

    }

    


  }
}
