package com.wanshi.movies_review.Service;

import com.wanshi.movies_review.Entity.Movie;
import com.wanshi.movies_review.Repository.MovieRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> allMovies() {
        //System.out.println(movieRepository.findAll());
        return movieRepository.findAll();
    }
    public Optional<Movie> getSingleMovie(ObjectId id) {
        return movieRepository.findById(id);
    }

    public Optional<Movie> singleMovie(String imdbId) {
        return movieRepository.findMovieByImdbId(imdbId);
    }
}
