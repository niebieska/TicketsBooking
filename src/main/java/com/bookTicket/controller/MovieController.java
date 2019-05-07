package com.bookTicket.controller;

import com.bookTicket.domain.Movie;
import com.bookTicket.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/movies")
@CrossOrigin("http://localhost:4200")
public class MovieController {

    @Autowired
    MovieService movieService;

    @GetMapping("/getAll")
    public List<Movie> getAll() {
        return movieService.getMovies();
    }


}
