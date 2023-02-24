package eduardo.apiweb.mocDB;

import eduardo.apiweb.model.Events;
import eduardo.apiweb.model.Polo;
import eduardo.apiweb.repository.EventsRepository;
import eduardo.apiweb.repository.PoloRepository;
import eduardo.apiweb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MocUsuario implements CommandLineRunner {
    @Autowired
    private PoloRepository poloRepository;

    @Autowired
    private EventsRepository eventsRepository;

    @Override
    public void run(String... args) throws Exception {

        Polo marcoZero = new Polo("marco zero");
        Events events = new Events("GERALDO AZEVEDO RECEBE CONVIDADOS", "17/02", "20:40", "22:00", marcoZero);
        List<String> listaAtracao = new ArrayList<>(){{
            add("Alceu Valença");
            add("Fafá de Bélem");
            add("Jorge Du Peixe");
            add("Quinteto Violado");
        }};

        events.setAtracoes(listaAtracao);

        poloRepository.save(marcoZero);
        eventsRepository.save(events);

        /*Evento - 02 ----------------------------------------------------------------------------------------------*/

        Events events2 = new Events("CAETANO VELOSO", "17/02", "22:20", "23:40", marcoZero);
        List<String> listaAtracao2 = new ArrayList<>(){{
            add("CAETANO VELOSO");
        }};

        events2.setAtracoes(listaAtracao2);
        eventsRepository.save(events2);

        /*Evento - 03 ----------------------------------------------------------------------------------------------*/

        Polo arsenal = new Polo("arsenal");
        Events events3 = new Events("RECIFE MATRIZ DA CULTURA POPULAR", "18/02", "15:30", "18:30", arsenal);
        List<String> listaAtracao3 = new ArrayList<>(){{
            add("Boi Malabá");
            add("TCM Camisa");
            add("Canindé do Recife");
            add("Urso Branco de Cangaçá");
            add("Grupo Fuzuê de Dança");
            add("Orquestra Freviocando Itinerante");
        }};

        events3.setAtracoes(listaAtracao3);

        poloRepository.save(arsenal);
        eventsRepository.save(events3);

        /*Evento - 04 ----------------------------------------------------------------------------------------------*/

        Polo sambaNaMoeda = new Polo("samba na moeda");
        Events events4 = new Events("ESCOLA DE SAMBA LIMONIL", "18/02", "17:30", "18:00", sambaNaMoeda);
        List<String> listaAtracao4 = new ArrayList<>(){{
            add("ESCOLA DE SAMBA LIMONIL");
        }};

        events4.setAtracoes(listaAtracao4);

        poloRepository.save(sambaNaMoeda);
        eventsRepository.save(events4);

        /*Evento - 05 ----------------------------------------------------------------------------------------------*/

        Polo qgDoFrevo = new Polo("qg do frevo");

        Events events5 = new Events("ORQUESTRA MAESTRO LIMA NETO E CIA TRAPIÁ DE DANÇA", "19/02", "19:00", "20:00", qgDoFrevo);
        List<String> listaAtracao5 = new ArrayList<>(){{
            add("MENDES E SUA ORQUESTRA E MOVIMENTO CULTURAL FAZENDO ARTE");
        }};

        events5.setAtracoes(listaAtracao5);

        poloRepository.save(qgDoFrevo);
        eventsRepository.save(events5);

        /*Evento - 06 ----------------------------------------------------------------------------------------------*/

        Polo patioDeSaoPedro = new Polo("pátio de são pedro");

        Events events6 = new Events("SÁBADO DA DIVERSIDADE", "18/02", "16:40", "17:40", patioDeSaoPedro);
        List<String> listaAtracao6 = new ArrayList<>(){{
            add("EDUARDA ALVES");
        }};

        events6.setAtracoes(listaAtracao5);

        poloRepository.save(patioDeSaoPedro);
        eventsRepository.save(events6);
    }
}
