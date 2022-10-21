package cat.itacademy.barcelonactiva.Martinez.MCarmen.s04.t02.n03.S04T02N03MartinezMCarmen.Repository;

import cat.itacademy.barcelonactiva.Martinez.MCarmen.s04.t02.n03.S04T02N03MartinezMCarmen.Model.Fruita;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FruitaRepository extends MongoRepository<Fruita, String> {

}
