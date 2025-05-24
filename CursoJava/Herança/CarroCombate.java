package CursoJava.Herança;

public class CarroCombate extends Carro{
   
        private final int maxArmamento = 100;
        private final int minArmamento = 0;
        private int qtdArmamento;

        public CarroCombate(String nome, int blindagem){
            super(nome);
            this.setLigado(false);
            this.setDestruido(false);
            this.setBlindagem(blindagem);
            this.qtdArmamento = 0;
        }
      
   
}
