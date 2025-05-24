
package CursoJava; 
public class Metodos {
    public static void main(String[] args) {
      chamar(); // Chama o método chamar 
      loop("Ruan",4); // chama o metodo loop 4 vezes 
      System.out.println(soma(10, 20)); // chama o método soma e imprime o resultado
      System.out.println(somaQuantosQuiser(10,542,36,10));
    }


    public static void chamar(){
        System.out.println("Oláaaa, vem cá");
    }

    public static void loop(String m, int loop){
        for (int i = 0; i < loop; i++) {
            System.out.println(m);
        }
    }

    public static int soma(int a, int b){
        int res = a + b; // soma a e b 
        return res; // retorna o resultado da soma

    }

    public static int somaQuantosQuiser(int... a){ // soma quantos números quiser, como se fosse um array
        int res = 0; // inicializa a variável res com 0
        for (int i = 0; i < a.length; i++) { // percorre o array a
            res += a[i]; // soma os elementos do array a
        }
        return res; // retorna o resultado da soma
    }
}
    
// public - tenho acesso a classe fora do pacote
// static - não preciso instanciar a classe para usar o método  
// void - não retorna nada 
// sobrecarga de métodos - mesmo nome, mas com parâmetros diferentes, ex: soma(int a, int b) e soma(double a, double b)