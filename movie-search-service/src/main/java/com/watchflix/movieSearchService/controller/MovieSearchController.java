package com.watchflix.movieSearchservice.controller;
import com.watchflix.movieSearchservice.model.MovieSearch;
import com.watchflix.movieSearchservice.repository.MovieSearchRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/api/movieSearch")
@RequiredArgsConstructor
public class MovieSearchController {
    private final MovieSearchRepository movieSearchRepository;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public  List<MovieSearch> findAll(){
    return movieSearchRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody MovieSearch movieSearch){
     movieSearchRepository.save(movieSearch);
    }
}
