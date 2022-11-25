package de.unibamberg.dsam.task1.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
public class FilmStudio {
    @Id
    private String id;
    private String name;
    private Date since;
//    private List<Movie> movies;
}
