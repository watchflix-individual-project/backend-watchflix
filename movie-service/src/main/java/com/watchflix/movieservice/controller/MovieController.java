package com.watchflix.movieservice.controller;
import com.watchflix.movieservice.model.Movie;
import com.watchflix.movieservice.repository.MovieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/api/movie")
@RequiredArgsConstructor
public class MovieController {
    private final MovieRepository movieRepository;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public  List<Movie> findAll(){
    return movieRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody Movie movie){
     movieRepository.save(movie);
    }
}
