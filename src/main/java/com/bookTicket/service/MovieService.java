package com.bookTicket.service;

import com.bookTicket.domain.Movie;
import com.bookTicket.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    MovieRepository movieRepository;

    public List<Movie> getMovies(){
        return movieRepository.findAll();
    }
}
