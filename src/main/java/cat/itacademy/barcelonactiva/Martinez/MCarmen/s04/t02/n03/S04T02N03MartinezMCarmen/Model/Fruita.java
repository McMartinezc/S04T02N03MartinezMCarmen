package cat.itacademy.barcelonactiva.Martinez.MCarmen.s04.t02.n03.S04T02N03MartinezMCarmen.Model;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;

@Entity //Notación para indicar que es una entidad
@Document("fruites") //Nombre de la base de datos que corresponde a esta entidad

public class Fruita {

    //Atributs
    @Id
    private String id; //Será la llave primaria en la base de datos
    private String nom;
    private int quantitatQuilos;

    //Constructors
    public Fruita() {
    }

    public Fruita(String id, String nom, int quantitatQuilos) {
        this.id = id;
        this.nom = nom;
        this.quantitatQuilos = quantitatQuilos;
    }

    //GETTERS i SETTERS

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getQuantitatQuilos() {
        return quantitatQuilos;
    }

    public void setQuantitatQuilos(int quantitatQuilos) {
        this.quantitatQuilos = quantitatQuilos;
    }

    //ToString
    @Override
    public String toString() {
        return "Fruita{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", quantitatQuilos=" + quantitatQuilos +
                '}';
    }
}