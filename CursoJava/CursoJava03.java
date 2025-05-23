package CursoJava;
import java.util.Scanner;
public class CursoJava03{
    public static void main(String[] args){

    Scanner scan = new Scanner(System.in);

    int n1,n2,result = 0; 
    String name;;


    System.out.println("Digite seu nome: ");
    name = scan.nextLine();
    System.out.println("Digite um númeral: ");
    n1 = scan.nextInt();
    System.out.println("Digite outro númeral: ");
    n2 = scan.nextInt();

    result = n1 + n2;
    System.out.printf("%s, a soma de %d com %d é igual a %d ",name, n1,n2,result);
    
    
    
    
    
    
     
    }
}