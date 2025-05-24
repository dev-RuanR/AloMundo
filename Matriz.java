import java.security.SecureRandom;
public class Matriz {
    public static void main(String[] args) {
        
        final int linhas = 3;
        final int colunas = 5;
        int[][] numeros = new int[linhas][colunas];

        for(int i = 0; i<linhas; i++){
            for(int j = 0; j<colunas; j++){
                numeros[i][j] = new SecureRandom().nextInt(100);
            }
        }
        
        for(int i = 0; i<linhas; i++){
            for(int j = 0; j<colunas; j++){
                System.out.printf("%2d | ",numeros[i][j]);
            }
            System.out.println();
        }


        System.out.println();

        // Outra forma de fazer a matriz, facil para ler matrizes grandes 
        for(int[] n:numeros){
            for(int v:n){
                System.out.printf("%2d | ",v);
            }
            System.out.println();
        }
    }
}
