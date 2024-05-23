import javax.persistence.*;
import javax.persistence.Entity;
import java.io.Serializable;

@Entity
public class Pessoa implements Serializable {

    private static final long serialVersionUTD = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String email;

    public Pessoa() {
    }

    public Pessoa(Integer id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(){
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(){
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String toString(){
        return "ID: " + id + " Nome: " + nome + " Email: " + email;
    }
}
