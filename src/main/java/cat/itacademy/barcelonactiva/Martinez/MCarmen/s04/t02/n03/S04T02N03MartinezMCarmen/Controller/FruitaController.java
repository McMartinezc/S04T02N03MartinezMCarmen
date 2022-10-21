package cat.itacademy.barcelonactiva.Martinez.MCarmen.s04.t02.n03.S04T02N03MartinezMCarmen.Controller;

import cat.itacademy.barcelonactiva.Martinez.MCarmen.s04.t02.n03.S04T02N03MartinezMCarmen.Exception.ItemNotFoundException;
import cat.itacademy.barcelonactiva.Martinez.MCarmen.s04.t02.n03.S04T02N03MartinezMCarmen.Model.Fruita;
import cat.itacademy.barcelonactiva.Martinez.MCarmen.s04.t02.n03.S04T02N03MartinezMCarmen.Service.FruitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FruitaController {

    @Autowired //Inyección de dependencia
    private FruitaService fruitaService;

    //METODES CRUD

    //Crear
    @PostMapping("/Add")
    public ResponseEntity<Fruita> add (@RequestBody Fruita fruita){
        return ResponseEntity.ok(fruitaService.add(fruita));
    }

    //Actualitzar
    @PutMapping("/Update/{id}")
    public ResponseEntity<Fruita> uptade (@PathVariable("id") String id, @RequestBody Fruita fruita) throws ItemNotFoundException {
        return ResponseEntity.ok(fruitaService.uptade(id, fruita));
    }

    //Borrar
    @DeleteMapping("/Delete/{id}")
    public ResponseEntity<Fruita>  delete (@PathVariable ("id") String id)  throws ItemNotFoundException {
        fruitaService.delete(id);
        return ResponseEntity.noContent().build();
    }

    //Buscar Un
    @GetMapping("/getOne/{id}")
    public ResponseEntity<Fruita> getOne (@PathVariable ("id") String id) throws ItemNotFoundException {
        return  ResponseEntity.ok(fruitaService.getOne(id));
    }

    //Mostrar tot
    @GetMapping("/getAll")
    public List<Fruita> getAll(){
        return fruitaService.getAll();
    }
}
