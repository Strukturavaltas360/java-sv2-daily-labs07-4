package day02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class MovieService {

    List<Movie> movies = new ArrayList<>();

    public List<Movie> getMovies() {
        return movies;
    }

    public MovieService(Path path) {

        try {
            List<String> lines = Files.readAllLines(path);
            filListWithMovies(lines);
        } catch (IOException ioe) {
            throw new IllegalStateException("Error while reading file!", ioe);
        }
    }

    private void filListWithMovies(List<String> lines) {
        for (String actual : lines) {
            String[] temp = actual.split(";");

            movies.add(new Movie(temp[0], Integer.parseInt(temp[1]), temp[2]));
        }
    }
}



