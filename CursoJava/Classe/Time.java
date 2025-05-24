package CursoJava.Classe;

public class Time{
   public static void main(String[] args) {

      int num = 0;
      Jogador.addPontos(); // adiciona pontos para o jogador;

      
      Jogador jogador1 = new Jogador(++num); // instanciando a classe Jogador;
      Jogador jogador2 = new Jogador(++num); // instanciando a classe Jogador;
      Jogador jogador3 = new Jogador(++num); // instanciando a classe Jogador;

      Jogador.alerta = true; // Antes todos os jogadores estavam com alerta inativo, agora todos estão com alerta ativo;
      jogador1.info();
      jogador2.info();
      
   }
}

// Classe é um molde, um modelo, uma estrutura que define as propriedades e comportamentos de um objeto. (de grosso modo, uma classe é uma representação de um objeto)
// metodo construtor - é um método especial que é chamado quando um objeto é criado a partir de uma classe. O método construtor tem o mesmo nome da classe e não tem tipo de retorno. Ele é usado para inicializar os atributos do objeto e executar qualquer outra lógica necessária durante a criação do objeto.