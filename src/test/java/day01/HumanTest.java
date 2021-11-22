package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HumanTest {

    @Test
    void testHumanCreateWithGoodDatas() {
            Human human = new Human("Szabó János", 1948);
            assertEquals(1948, human.getYearOfBirth());
            assertEquals("Szabó János", human.getName());
    }

    @Test
    void testHumanWithNullName() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> new Human(null,1980));
        assertEquals("Invalid name!", exception.getMessage());
    }

    @Test
    void testHumanWithOneName() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> new Human("Júlia",1968));
        assertEquals("Invalid name!", exception.getMessage());
    }

    @Test
    void testHumanWithTooOldPerson() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> new Human("Molnár Tibor",1889));
        assertEquals("Not valid year of Birth!", exception.getMessage());
    }

    @Test
    void testHumanWithTooOldPersonAndOneName() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> new Human("Marika", 1879));
        assertEquals("Invalid name!", exception.getMessage());
    }
}