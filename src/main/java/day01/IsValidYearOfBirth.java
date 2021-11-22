package day01;

import java.time.LocalDate;

public class IsValidYearOfBirth {

    public boolean isValidYearOfBirth(int yearOfBirth) {
        if (LocalDate.now().getYear() - yearOfBirth <= 120) {
            return true;
        }
        throw new IllegalArgumentException("Not valid year of Birth!");
    }

}
