package de.unibamberg.dsam.task1.controller;

import de.unibamberg.dsam.task1.model.Movie;
import de.unibamberg.dsam.task1.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping(value = "movies")
public class MovieController {

    @Autowired
    private final MovieRepository movieRepository;

    public MovieController(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @GetMapping
    public String getMovies(Model model) {
        model.addAttribute("movies", this.movieRepository.findAll());
        model.addAttribute("movie", new Movie());
        return "moviesHtml";
    }

    @PostMapping
    public String addMovie(@Valid Movie movie, Errors errors, Model model) {

        if (errors.hasErrors()) {
            System.out.println("Errors in validation" + errors.toString());

            model.addAttribute("movies", this.movieRepository.findAll());
            return "moviesHtml";
        }

        movie.setId("" + (this.movieRepository.count() + 1));
        System.out.println(movie);
        this.movieRepository.save(movie);

        return "redirect:/movies";
    }

}

