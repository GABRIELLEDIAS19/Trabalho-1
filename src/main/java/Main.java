import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("coloque um numero inteiro");

    int numero = sc.nextInt();
    if (numero>0) {

      System.out.println("O numero digitado é positivo");}
    if (numero == 0) {

      System.out.println("O número digitado é positivo");}
    if (numero<0) {

      System.out.println(" O numero digitado é negativo");}
    

    sc.close();
  
}
}


