package eduardo.apiweb.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
@Entity
public class Events {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEvents;
    private String evento;
    private String data;
    private String horaInicial;
    private String horaFinal;
    private List<String> atracoes;

    @ManyToOne
    @JoinColumn(name = "polo_id")
    private Polo polo;

    public Events() {
    }

    public Events(String evento, String data, String horaInicial, String horaFinal, Polo polo) {
        this.evento = evento;
        this.data = data;
        this.horaInicial = horaInicial;
        this.horaFinal = horaFinal;
        this.polo = polo;
        this.atracoes = new ArrayList<>();
    }

    public Integer getIdEvents() {
        return idEvents;
    }

    public Polo getPolo() {
        return polo;
    }

    public void setPolo(Polo polo) {
        this.polo = polo;
    }

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHoraInicial() {
        return horaInicial;
    }

    public void setHoraInicial(String horaInicial) {
        this.horaInicial = horaInicial;
    }

    public String getHoraFinal() {
        return horaFinal;
    }

    public void setHoraFinal(String horaFinal) {
        this.horaFinal = horaFinal;
    }

    public List<String> getAtracoes() {
        return atracoes;
    }

    public void setAtracoes(List<String> atracoes) {
        this.atracoes.addAll(atracoes);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Events events = (Events) o;
        return idEvents.equals(events.idEvents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idEvents);
    }

    @Override
    public String toString() {
        return "Events{" +
                "idEvents=" + idEvents +
                ", evento='" + evento + '\'' +
                ", data='" + data + '\'' +
                ", horaInicial='" + horaInicial + '\'' +
                ", horaFinal='" + horaFinal + '\'' +
                ", atracoes=" + atracoes +
                ", polo=" + polo +
                '}';
    }
}
