import java.util.Date;
import java.util.Objects;

public class Pessoa{
    public static String tipo = "PESSOA";
    private String nome;
    private String sobrenome;
    private Cidade cidade; //Relação do tipo TEM UM (associação)

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public Pessoa(String nome, String sobrenome, Cidade cidade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cidade = cidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(nome, pessoa.nome) && Objects.equals(sobrenome, pessoa.sobrenome) && Objects.equals(cidade, pessoa.cidade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, sobrenome, cidade);
    }

    @Override
    public String toString() {

        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", cidade=" + cidade +
                '}';
    }
}
