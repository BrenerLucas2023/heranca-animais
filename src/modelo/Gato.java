// Subclasse Gato, herda de Animal
public class Gato extends Animal {

    public Gato(String nome, int idade) {
        super(nome, idade);  // Chama o construtor da classe Animal
    }

    @Override
    public void fazerSom() {
        System.out.println(this.nome + " está miando.");
    }

    public void pular() {
        System.out.println(this.nome + " está pulando.");
    }
}
