package day02;

public class Movie {
    private String title;
    private int yearOfPremier;
    private String director;

    public Movie(String title, int yearOfPremier, String director) {
        this.title = title;
        this.yearOfPremier = yearOfPremier;
        this.director = director;
    }

    public String getTitle() {
        return title;
    }

    public int getYearOfPremier() {
        return yearOfPremier;
    }

    public String getDirector() {
        return director;
    }
}
