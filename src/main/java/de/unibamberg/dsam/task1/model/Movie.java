package de.unibamberg.dsam.task1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/// Generate getter and setters.
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie {
    private String id;
    private String title;
    private boolean wonOscar;
    private int year;
    private String coverImage;
}
