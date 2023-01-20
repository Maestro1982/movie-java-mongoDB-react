package com.maestro1982.movies.repository;

import com.maestro1982.movies.domain.Movie;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {
    // Use keyword Optional because it can return null
    Optional<Movie> findMovieByImdbId(String imdbId);
}
