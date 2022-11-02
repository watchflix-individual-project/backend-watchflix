package com.watchflix.movieservice.repository;

import com.watchflix.movieservice.model.Movie;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MovieRepository extends MongoRepository<Movie,String> {
}
