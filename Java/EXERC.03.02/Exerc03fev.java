import java.io.Writer;
import java.util.Scanner;

class Exerc03fev
 { 

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        double soma,nu1, nu2, nu3; 
    
        System.out.println("digite um numero: ");
        nu1=sc.nextDouble();
        
        System.out.println("Digite outro numero:  ");
        nu2=sc.nextDouble();
       
        System.out.println("Digite mais um numero: ");
        nu3=sc.nextDouble();

            soma= nu1+ nu2 + nu3;

        System.out.println("A soma de todos os numero são: "+soma);
        
        sc.close();
    


    }



         }

