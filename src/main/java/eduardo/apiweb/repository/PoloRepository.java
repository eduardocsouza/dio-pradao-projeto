package eduardo.apiweb.repository;

import eduardo.apiweb.model.Polo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PoloRepository extends JpaRepository<Polo, Integer> {

    List<Polo> findByNome(String nome);
}
