package cat.itacademy.barcelonactiva.Martinez.MCarmen.s04.t02.n03.S04T02N03MartinezMCarmen.Service;

import cat.itacademy.barcelonactiva.Martinez.MCarmen.s04.t02.n03.S04T02N03MartinezMCarmen.Exception.ItemNotFoundException;
import cat.itacademy.barcelonactiva.Martinez.MCarmen.s04.t02.n03.S04T02N03MartinezMCarmen.Model.Fruita;
import cat.itacademy.barcelonactiva.Martinez.MCarmen.s04.t02.n03.S04T02N03MartinezMCarmen.Repository.FruitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service //Indica que es un servicio

public class FruitaService {

    @Autowired
    private FruitaRepository fruitaRepository;

    //METODES CRUD

    //Crear un
    public Fruita add (Fruita fruita){
        return fruitaRepository.save(fruita);
    }

    //Actualitzar un
    public Fruita uptade (String id, Fruita fruita) throws ItemNotFoundException {
        Fruita fruitaModificar = fruitaRepository
                .findById(id)
                .orElseThrow(() -> new ItemNotFoundException("No existeix fruita amb aquest id " + id));//Si no troba fruita amb aquesta id llança excepcio personalitzada
        fruitaModificar.setNom(fruita.getNom());
        fruitaModificar.setQuantitatQuilos(fruita.getQuantitatQuilos());
        Fruita fruitaUpdate = fruitaRepository.save(fruitaModificar);
        return fruitaUpdate;
    }

    //Borrar un element
    public void delete (String id) throws ItemNotFoundException {
        Fruita fruita = fruitaRepository.findById(id) //Si no troba fruita amb aquesta id llança excepcio personalitzada
                .orElseThrow(() -> new ItemNotFoundException("No existeix fruita amb aquest id " + id));

        fruitaRepository.deleteById(id);
    }

    //Buscar Un element
    public Fruita getOne (String id) throws ItemNotFoundException {
        return fruitaRepository.findById(id).orElseThrow(()->new ItemNotFoundException("No es existeix aquesta fruita"));
    }

    //Mostrar tot
    public List<Fruita> getAll(){
        return fruitaRepository.findAll();

    }
}
