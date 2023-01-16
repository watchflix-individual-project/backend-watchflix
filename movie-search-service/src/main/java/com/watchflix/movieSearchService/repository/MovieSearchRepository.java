package com.watchflix.movieSearchservice.repository;

import com.watchflix.movieSearchservice.model.MovieSearch;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MovieSearchRepository extends MongoRepository<MovieSearch,String> {
}
