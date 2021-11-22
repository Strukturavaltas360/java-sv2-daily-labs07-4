package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsValidNameTest {

    @Test
    void testIsValidName() {
        assertTrue(new IsValidName().isValidName("Gárdonyi Géza"));
    }

    @Test
    void testIsValidNameNullName() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> new IsValidName().isValidName(null));
        assertEquals("Invalid name!", exception.getMessage());
    }

    @Test
    void testIsValidNameOneName() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> new IsValidName().isValidName("Géza"));
        assertEquals("Invalid name!", exception.getMessage());
    }
}