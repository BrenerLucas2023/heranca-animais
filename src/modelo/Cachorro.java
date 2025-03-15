// Subclasse Cachorro, herda de Animal
public class Cachorro extends Animal {

    public Cachorro(String nome, int idade) {
        super(nome, idade);  // Chama o construtor da classe Animal
    }

    @Override
    public void fazerSom() {
        System.out.println(this.nome + " está latindo.");
    }

    public void correr() {
        System.out.println(this.nome + " está correndo.");
    }
}
