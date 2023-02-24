package eduardo.apiweb.repository;

import eduardo.apiweb.model.Events;
import eduardo.apiweb.model.Polo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EventsRepository extends JpaRepository<Events, Integer> {
    List<Events> findByEvento(String nome);

    @Query("from Events e where e.polo.nome = :nome")
    List<Events> findByIdPolo(@Param("nome") String nome);
}
