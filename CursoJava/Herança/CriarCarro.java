package CursoJava.Herança;

public class CriarCarro {

    public static void main(String[] args) {
        Carro carro1 = new Carro("Golf");
        Carro carro2 = new Carro("Fusca");

        CarroCombate carroCombate1 = new CarroCombate("Tanque", 100);
        CarroCombate carroCombate2 = new CarroCombate("C4", 50);
        
        carroCombate1.atirar();
        carroCombate1.atirar();
        carroCombate1.atirar();
        carro1.sofrerDano(10);
        carroCombate2.sofrerDano(49);

        carro1.info();
        carro2.info();
        carroCombate1.info();
        carroCombate2.info();
        
        
    }
}