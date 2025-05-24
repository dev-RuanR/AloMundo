    package CursoJava;
    import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;


    public class arrayEspecial {
        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);

            int[] num = {50, 15, 40, 10, 20};
            int[] numeros = new int[5];
            int p = 15;
            int pos;
            /*for(int i = 0; i<num.length; i++){
                System.out.printf("%d - ", num[i]);
            }
*/

         Arrays.sort(num); // arrumando o array em ordem crescente
            // Arrays.fill(numeros, 10);  // preenche o array com 10 em todas as posições
            //System.arraycopy(num, 0, numeros, 0, num.length); // copia o array num para o array numeros
           // System.out.printf("Array são iguais: %s", Arrays.equals(num, numeros) ? "Sim" : "Não");
           pos = Arrays.binarySearch(num, p); // procura o elemento no array
           System.out.printf("O elemente %d esta no array: %s na posição %d", p, pos > 0 ? "Sim" : "Não",pos);


            //for(int n:numeros){
              //  System.out.printf("%d - ", n);
            //}



        }
    }