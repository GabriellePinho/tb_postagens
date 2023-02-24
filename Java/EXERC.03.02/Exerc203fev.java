import java.io.Writer;
import java.util.Scanner;

public class Exerc203fev {


public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);

    double media, n1, n2, n3;

    System.out.println("Digite um numero: ");
    n1=sc.nextDouble();

    System.out.println("Digite outro numero: ");
    n2=sc.nextDouble();

    System.out.println("Digite mais um numero: ");
    n3=sc.nextDouble();

    media= (n1+ n2 + n3)/3;

    System.out.println("A media de todos os numeros são:  "+media);
  
}
}