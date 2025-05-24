package CursoJava.Classe;

public class Jogador {

    // Atributos
    public String nome; // atributo público, pode ser acessado de qualquer lugar;
    private int idade; // atributo privado, só pode ser acessado dentro da classe Jogador;


    public Jogador(int n){
        System.out.printf("Jogador de número %d criado", n); // imprime na tela quando o objeto é instanciado
    }
    
}
