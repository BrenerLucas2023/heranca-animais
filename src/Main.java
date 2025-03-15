// Classe Main para testar o sistema de herança
public class Main {
    public static void main(String[] args) {
        // Criando objetos de Cachorro e Gato
        Animal cachorro = new Cachorro("Rex", 5);
        Animal gato = new Gato("Mia", 3);

        // Testando os métodos
        cachorro.fazerSom();  // Deve chamar o método da classe Cachorro
        gato.fazerSom();      // Deve chamar o método da classe Gato

        cachorro.comer();
        gato.comer();

        cachorro.dormir();
        gato.dormir();

        // Testando métodos exclusivos
        if (cachorro instanceof Cachorro) {
            ((Cachorro) cachorro).correr();  // Casting para chamar o método correr
        }

        if (gato instanceof Gato) {
            ((Gato) gato).pular();  // Casting para chamar o método pular
        }
    }
}
