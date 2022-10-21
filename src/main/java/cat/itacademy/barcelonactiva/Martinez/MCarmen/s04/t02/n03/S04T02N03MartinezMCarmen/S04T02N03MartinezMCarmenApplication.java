package cat.itacademy.barcelonactiva.Martinez.MCarmen.s04.t02.n03.S04T02N03MartinezMCarmen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@EnableMongoAuditing
@SpringBootApplication
public class S04T02N03MartinezMCarmenApplication {

	public static void main(String[] args) {
		SpringApplication.run(S04T02N03MartinezMCarmenApplication.class, args);
	}

}
