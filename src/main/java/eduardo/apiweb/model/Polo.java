package eduardo.apiweb.model;
import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Polo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer poloId;
    private String nome;

    public Polo() {
    }

    public Polo(String nome) {
        this.nome = nome;
    }

    public Integer getPoloId() {
        return poloId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Polo polo = (Polo) o;
        return poloId.equals(polo.poloId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(poloId);
    }

    @Override
    public String toString() {
        return "Polo{" +
                "poloId=" + poloId +
                ", nome='" + nome + '\'' +
                '}';
    }
}
