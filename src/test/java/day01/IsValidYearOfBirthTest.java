package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsValidYearOfBirthTest {

    @Test
    void testIsValidYearOfBirth() {
        assertTrue(new IsValidYearOfBirth().isValidYearOfBirth(1975));
        assertTrue(new IsValidYearOfBirth().isValidYearOfBirth(1901));
    }

    @Test
    void testIsValidYearOfBirthTooOld() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> new IsValidYearOfBirth().isValidYearOfBirth(1900));
        assertEquals("Not valid year of Birth!",exception.getMessage());

    }
}