package CursoJava.Classe;

public class Time{
   public static void main(String[] args) {

      int num = 0;
      Jogador jogador1 = new Jogador(++num); // instanciando a classe Jogador;
      Jogador jogador2 = new Jogador(++num); // instanciando a classe Jogador;
      Jogador jogador3 = new Jogador(++num); // instanciando a classe Jogador;

      jogador1.addVidas(); // adiciona uma vida ao jogador 1;
      jogador1.addVidas(); // adiciona uma vida ao jogador 1;
      jogador1.addVidas(); // O jogador ainda tem 3 vidas, então não adiciona mais uma vida;
      System.out.printf("%n Vidas do jogador 1: " + jogador1.getVidas()); // imprime o número de vidas do jogador 1;
      System.out.printf("%n Vidas do jogador 2: " + jogador2.getVidas()); // imprime o número de vidas do jogador 2;
      System.out.printf("%n Vidas do jogador 3: " + jogador3.getVidas()); // imprime o número de vidas do jogador 3; 
   }
}

// Classe é um molde, um modelo, uma estrutura que define as propriedades e comportamentos de um objeto. (de grosso modo, uma classe é uma representação de um objeto)
// metodo construtor - é um método especial que é chamado quando um objeto é criado a partir de uma classe. O método construtor tem o mesmo nome da classe e não tem tipo de retorno. Ele é usado para inicializar os atributos do objeto e executar qualquer outra lógica necessária durante a criação do objeto.