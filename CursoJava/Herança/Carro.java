package CursoJava.Herança;

public class Carro {
    private String nome;
    private boolean ligado;
    private boolean destruido;
    private int blindagem;
    private boolean armamento;
    

    public Carro(String nome) {
        this.nome = nome;
        this.ligado = false;
        this.destruido = false;
        this.blindagem = 0;
        this.armamento = false;
    }

    public String getNome() {
        return this.nome;
    }
    
    public Boolean getLigado() {
        return this.ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public Boolean getDestruido() {
        return this.destruido;
    }

    //public void setDestruido(boolean destruido) {
    //    this.destruido = destruido;
   // }

    public Boolean getArmamento() {
        return this.armamento;
    }

    public void setArmamento(boolean armamento) {
        this.armamento = armamento;
    }
    public int getBlindagem() {
        return this.blindagem;
    }

    public void setBlindagem(int blindagem) {
        this.blindagem = blindagem;
    }
    public void sofrerDano(int dano){
        this.blindagem -= dano;
        if(this.blindagem <= 0){
            this.blindagem = 0;
            this.destruido = true;
            this.ligado = false;
        }
    }

    public void info(){
        System.out.println("-----------------------------");
        System.out.printf("Nome: %s\n", this.nome);
        System.out.printf("Ligado: %s\n", (this.ligado ? "Sim" : "Não"));
        System.out.printf("Destruído: %s\n", (this.destruido ? "Sim" : "Não"));
        System.out.printf("Blindagem: %d\n", this.blindagem);
        System.out.printf("Armamento: %s\n", (this.armamento ? "Sim" : "Não"));
        
    }
}
