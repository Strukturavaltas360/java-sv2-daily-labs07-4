package day02;

import org.junit.jupiter.api.Test;

import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class MovieServiceTest {

    @Test
    void testMovieService() {
        MovieService movieService = new MovieService(Paths.get("src/main/resources/movies.csv"));
        assertEquals(1977, movieService.getMovies().get(2).getYearOfPremier());
        assertEquals(5,movieService.getMovies().size());
    }


    @Test
    void testMovieServiceWithWrongFileName() {
        IllegalStateException exception = assertThrows(IllegalStateException.class,
                () -> new MovieService(Paths.get("src/main/resources/movies.txt")));

        assertEquals("Error while reading file!",exception.getMessage());
    }

}
//    Jurassic park;1993;Steven Spielberg
//        Titanic;1997;James Cameron
//        Star Wars;1977;George Lucas
//        Lord Of The Rings;2002;Peter Jackson
//        Jaws;1975;Steven Spielberg