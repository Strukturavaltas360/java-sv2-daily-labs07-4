package day01;

import java.time.LocalDate;

public class Human {
    private String name;
    private int yearOfBirth;

    public Human(String name, int yearOfBirth) {
        IsValidName isv = new IsValidName();
        IsValidYearOfBirth ivyb = new IsValidYearOfBirth();

        if (isv.isValidName(name) && ivyb.isValidYearOfBirth(yearOfBirth))  {
            this.name = name;
            this.yearOfBirth = yearOfBirth;
        }
    }

    public String getName() {
        return name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }
}
