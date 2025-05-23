package CursoJava;

import java.util.Scanner;

public class array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Array é uma estrutura de dados que armazena um conjunto de valores do mesmo tipo
        // Array unidimensional
        String[] nomes = new String[5]; // Ou String nomes[] = {"Ruan", "João", "Gabi", "Ana", "Pedro"};
        nomes[0] = "Ruan";
        nomes[1] = "João";
        nomes[2] = "Gabi";
        nomes[3] = "Ana";
        nomes[4] = "Pedro";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }

        // Array multidimensional
        String[][] alunos = new String[2][3];
        alunos[0][0] = "Ruan";
        alunos[0][1] = "João";
        alunos[0][2] = "Gabi";
        alunos[1][0] = "Ana";
        alunos[1][1] = "Pedro";
        alunos[1][2] = "Carlos";

        for (int i = 0; i < alunos.length; i++) {
            for (int j = 0; j < alunos[i].length; j++) {
                System.out.print(alunos[i][j] + " , ");
            }
            System.out.println();
        }

        final int tam = 5;
        char[] gabarito = {'A', 'A', 'C', 'D', 'E'};
        char[] resposta = new char[tam];
        int nota = 0;

        resposta[0] = 'A';
        resposta[1] = 'B';  
        resposta[2] = 'D';
        resposta[3] = 'B';  
        resposta[4] = 'E';

        for(int i = 0; i <tam; i++){
            if(gabarito[i] == resposta[i]){
                nota++;
            }
        }
        System.out.println("Nota: " + nota);


        // Caso eu queira que o usuário digite 
        for(int i = 0; i < tam; i++){
            System.out.println("Digite a resposta " + (i+1) + ": ");
            resposta[i] = sc.next().charAt(0);
        }
        System.out.printf("%n Nota do Aluno: %d%n", nota); 

    }
}
