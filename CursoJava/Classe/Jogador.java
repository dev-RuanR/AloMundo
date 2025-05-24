package CursoJava.Classe;

public class Jogador {

    // Atributos
    private final int maxVidas = 3; // constante, não pode ser alterada depois de inicializada e atributo privado, só pode ser acessado dentro da classe Jogador;;
    private int vida = 0; 
    private int num = 0;
    static boolean alerta = false;
    static int qtdJogadores = 0; 
    static int pontosJogadores = 0;



    public Jogador(int num){
        this.num=num; // inicializa o atributo idade com o valor passado como parâmetro; 
        this.setVidas(1);;
        System.out.printf("Jogador de número %d criado", num); // imprime na tela quando o objeto é instanciado
        qtdJogadores++; // incrementa a quantidade de jogadores
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

    public void info(){
        System.out.printf("%nJogador %d", this.num); // imprime na tela o número do jogador
        System.out.printf("%nVidas: %d", this.vida); // imprime na tela a quantidade de vidas do jogador
        System.out.printf("%nAlerta: %s", (alerta ? "Ativo" : "Inativo")); // imprime na tela se o alerta do jogador está ativo ou inativo
        System.out.printf("%nPontos Jogadores: %d%n", pontosJogadores); // imprime na tela a quantidade de jogadores
        System.out.println("===================================");
    }
    
    static void addPontos(){
        pontosJogadores=+10;
    }
}
