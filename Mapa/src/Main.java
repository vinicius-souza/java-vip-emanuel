public class Main {
    public static void main(String[] args) {

        Gerenciador gerenciador = new Gerenciador();

        Pessoa pessoa1 = new Pessoa("João", "da Silva", 28);
        Pessoa pessoa2 = new Pessoa("Maria", "do Bairro", 38);
        Pessoa pessoa3 = new Pessoa("Zé", "Dirceu", 15);
        Pessoa pessoa4 = new Pessoa("Manuel", "Gomes", 67);
        Pessoa pessoa5 = new Pessoa("Gabriel", "Junior", 12);

        gerenciador.adicionar("Jão", pessoa1);
        gerenciador.adicionar("Mari", pessoa2);
        gerenciador.adicionar("Vaqueiro", pessoa3);
        gerenciador.adicionar("Manel", pessoa4);
        gerenciador.adicionar("Gabi", pessoa5);

        gerenciador.imprimir();

    gerenciador.remover("Vaqueiro");

    gerenciador.imprimir();

    gerenciador.editar("Manel", new Pessoa("Manuel", "Gomes da Silva", 89));

    gerenciador.imprimir();
    }
}