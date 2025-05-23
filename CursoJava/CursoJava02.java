package CursoJava;

public class CursoJava02 {
    public static void main(String[] args) {
     // == > < >= <= != ! (true or false)
 /*     int nota = 7;
     int media = 7;

        if(nota >= media){
            System.out.println("Aprovado");
        } else if(nota > 5 && nota < media) {
            System.out.println("Recuperação");
        } else if(nota < 5 && nota > 0) {
            System.out.println("Reprovado");
        } else if(nota < 0 || nota > 10) {
            System.out.println("Nota inválida");
        } else {
            System.out.println("Reprovado");
        } */

        // Switch case
        int pos = 1;
        switch (pos) {
            case 1:
                System.out.println("Primeiro lugar");
                break;
            case 2:
                System.out.println("Segundo lugar");
                break;
            case 3:
                System.out.println("Terceiro lugar");
                break;
            default:
                System.out.println("Não subiu ao pódio");
                break;
        }
    }
}
