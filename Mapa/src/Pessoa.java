import java.util.Objects;

public class Pessoa {

    private Integer identificador;
    private String nome;
    private String sobrenome;

    private Integer idade;

    /**
    * Contrutor */

    public Pessoa(String nome, String sobrenome, Integer idade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
    }

    /**
    * Getter And Setters*/
    public Integer getIdentificador() {
        return identificador;
    }

    public void setIdentificador(Integer identificador) {
        this.identificador = identificador;
    }

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

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    /**
    * Hashcode And Equals */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(identificador, pessoa.identificador) && Objects.equals(nome, pessoa.nome) && Objects.equals(sobrenome, pessoa.sobrenome) && Objects.equals(idade, pessoa.idade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identificador, nome, sobrenome, idade);
    }

    /**
     * ToString */

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
