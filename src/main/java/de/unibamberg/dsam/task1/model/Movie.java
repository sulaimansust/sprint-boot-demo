package de.unibamberg.dsam.task1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;

/// Generate getter and setters.
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie {
    //TODO: Need to add data validation
    private String id;
    @NotNull(message = "Title must be set ")
    @NotEmpty(message = "Title not there")
    private String title;
    private boolean wonOscar;
    @Min(value = 1920, message = "No movies in ancient times.")
    @Max(value = 2022, message = "No movies planned after this year")
    private int year;
    @Pattern(regexp = "(https:\\/\\/).*\\.(?:jpg|gif|png|jpeg)", message = "Must be a valid URL to a picture.")
    private String coverImage;
}
