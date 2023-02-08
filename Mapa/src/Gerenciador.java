import java.util.HashMap;
import java.util.Map;

public class Gerenciador<String, Pessoa> implements GerenciadorGenerico<String, Pessoa>
{

    private HashMap lista = new HashMap<String, Pessoa>();
    private Integer id = 0;
    @Override
    public Map<String, Pessoa> getLista() {
        return this.lista;
    }

    @Override
    public Integer getId() {
        return this.id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public void imprimir() {
        for (Object pessoa : this.lista.values()) {
            System.out.println(pessoa);
        }
    }

    @Override
    public Pessoa adicionar(String chave, Pessoa valor) {
        return (Pessoa) this.lista.put(chave, valor);
    }

    @Override
    public Pessoa editar(String chave, Pessoa valor) {
        if(this.lista.containsKey(chave))
            return (Pessoa) this.lista.put(chave, valor);

        return null;
    }

    @Override
    public Pessoa remover(String chave) {
        return (Pessoa) this.lista.remove((chave));
    }
}
