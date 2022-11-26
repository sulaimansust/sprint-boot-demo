package de.unibamberg.dsam.task1.repository;

import de.unibamberg.dsam.task1.model.FilmStudio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmStudioRepository extends JpaRepository<FilmStudio, String> {
}
