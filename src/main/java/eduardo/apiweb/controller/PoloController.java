package eduardo.apiweb.controller;

import eduardo.apiweb.model.Events;
import eduardo.apiweb.model.Polo;
import eduardo.apiweb.repository.PoloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;


@RestController
public class PoloController {

    @Autowired
    private PoloRepository repository;

    @GetMapping("/polos")
    public List<Polo> getAll(){
        return repository.findAll();
    }

    @GetMapping("/polos/{nome}")
    public String getFindByName(@PathVariable("nome") String nome){
        List<Polo> polos = repository.findByNome(nome);
        for(Polo po : polos){
            return po.getNome();
        }

        return null;
    }

}
