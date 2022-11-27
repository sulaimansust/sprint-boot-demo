package de.unibamberg.dsam.task1.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/// Generate getter and setters.
@Data
@Entity
public class Movie {
    @Id
    private String id;
    @NotNull(message = "Title must be set ")
    @NotEmpty(message = "Title not there")
    private String title;
    private boolean wonOscar;
    @Min(value = 1920, message = "No movies in ancient times.")
    @Max(value = 2022, message = "No movies planned after this year")
    private int releaseYear;
    private String coverImage;
}
