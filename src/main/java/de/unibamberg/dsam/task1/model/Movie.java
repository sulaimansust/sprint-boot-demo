package de.unibamberg.dsam.task1.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/// Generate getter and setters.
@Data
@AllArgsConstructor
public class Movie {
    private String id;
    private String title;
    private boolean wonOscar;
    private int year;
    private String coverImage;
}
