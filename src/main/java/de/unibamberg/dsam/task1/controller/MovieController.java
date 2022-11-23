package de.unibamberg.dsam.task1.controller;

import de.unibamberg.dsam.task1.model.Movie;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "movies")
public class MovieController {
    private List<Movie> movies;

    public MovieController() {
        this.movies = new ArrayList<>();
        this.movies.add(new Movie("1", "Inception", false, 2010, "https://cdn.pixabay.com/photo/2017/05/15/17/43/calm-2315559_960_720.jpg"));
        this.movies.add(new Movie("2", "Cloud Atlas", false, 2012, "https://cdn.pixabay.com/photo/2020/03/02/16/19/vintage-4896141_960_720.jpg"));
    }

    @GetMapping
    public String getMovies(Model model) {
        model.addAttribute("movies", this.movies);
        model.addAttribute("movie", new Movie());
        return "moviesHtml";
    }

    @PostMapping
    public String addMovie(@Valid Movie movie, Errors errors, Model model) {

        if (errors.hasErrors()) {
            System.out.println("Errors in validation" + errors.toString());

            model.addAttribute("movies", this.movies);
            return "moviesHtml";
        }

        movie.setId("" + (this.movies.size() + 1));
        this.movies.add(movie);

        return "redirect:/movies";
    }

}

