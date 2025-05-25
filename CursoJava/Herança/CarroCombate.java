package CursoJava.Herança;

public class CarroCombate extends Carro{
   
        private final int maxArmamento = 100;
        private final int minArmamento = 0;
        private int qtdArmamento;

        public CarroCombate(String nome, int blindagem){
            super(nome);
            super.setArmamento(true);
            super.setBlindagem(blindagem);
            this.qtdArmamento = 50;
        }
      
        public void setQtdArmamento(int qtdArmamento){
            this.qtdArmamento += qtdArmamento;
            if(qtdArmamento > maxArmamento){
                this.qtdArmamento = maxArmamento;
            }else if(qtdArmamento < minArmamento){
                this.qtdArmamento = minArmamento;
            }        
        }

        public void atirar(){
            if(this.qtdArmamento > minArmamento){
                System.out.println("Atirando...");
                setQtdArmamento(-1);
            }else{
                System.out.println("Sem armamento");
            }
        }


        public void info(){
            super.info();
            System.out.printf("Quantidade de armamento: %d\n", this.qtdArmamento);
        }
}
// Sempre que eu quiser chamar alguem da classe pai, eu uso super.
// Sempre que eu quiser chamar alguem da classe filho, eu uso this.