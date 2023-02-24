package eduardo.apiweb.controller;

import eduardo.apiweb.model.Events;
import eduardo.apiweb.model.Polo;
import eduardo.apiweb.repository.EventsRepository;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EventsController {

    @Autowired
    private EventsRepository repository;

    @GetMapping("/eventos")
    public List<Events> getAll(){
        return repository.findAll();
    }

    @GetMapping("/eventos/polo/{nome}")
    public List<Events> findByNameEvent(@PathVariable("nome") String nome){
        List<Events> ev = repository.findByIdPolo(nome);
        System.out.println("ok");
        return ev;
    }
}
