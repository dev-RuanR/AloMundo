package CursoJava;
import java.util.Scanner;
public class Loop {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in); 

        // FOR usando quando sabemos o número de iteraçõe
        for(int i = 0; i < 5; i++){
            System.out.println((i + " Estudos Java do FOR"));
        }
        System.out.println("Fim do loop FOR");

        // WHILE usando quando não sabemos o número de iterações

        System.out.println("Digite o número máximo de iterações: "); 
        int max= scan.nextInt(); // Lê o número máximo de iterações
        int cont = 0;
        while(cont < max){
            System.out.println((cont + " Estudos Java do while"));
            cont++;
        }

        // DO WHILE usando quando não sabemos o número de iterações, mas termos que executar pelo menos uma vez

        int cont2 = 0;
        do{
            System.out.println((cont2 + " Estudos Java do do while"));
            cont2++;     
    } while(cont2 < 2);
        System.out.println("Fim do loop do while");
        scan.close();
    }
    
}
