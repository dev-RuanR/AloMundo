package CursoJava.Classe;

public class Jogador {

    // Atributos
    private final int maxVidas = 3; // constante, não pode ser alterada depois de inicializada e atributo privado, só pode ser acessado dentro da classe Jogador;;
    private int vida = 0; 
    private int num = 0;

    public Jogador(int num){
        this.num=num; // inicializa o atributo idade com o valor passado como parâmetro; 
        this.setVidas(1);;
        System.out.printf("Jogador de número %d criado", num); // imprime na tela quando o objeto é instanciado
    }
    // Métodos
    public int getVidas(){
        return this.vida; // retorna o valor do atributo vida;
    }
    private void setVidas(int vida){
        if (vida > maxVidas) {
            this.vida = maxVidas;
        } else if (vida < 0) {
            this.vida = 0;
        } else {
            this.vida = vida;
        }
        

    }

    public void addVidas(){
        if (this.vida < maxVidas) {
            this.vida++;
        } 
    }
    
}
