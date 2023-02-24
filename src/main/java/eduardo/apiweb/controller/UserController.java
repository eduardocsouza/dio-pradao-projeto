package eduardo.apiweb.controller;

import eduardo.apiweb.model.Usuario;
import eduardo.apiweb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    private UserRepository repository;

    @GetMapping("/users")
    public List<Usuario> findAllUsers(){
        return repository.findAll();
    }

    @GetMapping("/user/{id}")
    public Usuario findById(@PathVariable("id") Long id){
        Optional<Usuario> user = repository.findById(id);
        return user.get();
    }

    @DeleteMapping("/del/{id}")
    public String deleteById(@PathVariable("id") Long id){
        String idS = String.valueOf(id);
        repository.deleteById(id);
        return "Usuário de Id: " + idS + " Removido com sucesso!";
    }

    @PostMapping("/user")
    public void addUser(@RequestBody Usuario user){
        repository.save(user);
    }


}
