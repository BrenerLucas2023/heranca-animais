// Classe base Animal
public class Animal {
    String nome;
    int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void fazerSom() {
        System.out.println("O animal faz um som.");
    }

    public void comer() {
        System.out.println(this.nome + " está comendo.");
    }

    public void dormir() {
        System.out.println(this.nome + " está dormindo.");
    }
}
