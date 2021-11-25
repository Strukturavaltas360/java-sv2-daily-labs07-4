package day04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RideTest {
    Ride ride;

    @Test
    void testCreateRide(){
        ride = new Ride(5,6,7);

        assertEquals(5, ride.getDay());
        assertEquals(6, ride.getNth());
        assertEquals(7, ride.getKm());
    }

    @Test
    void testCreateRideIllegalDay(){
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                () -> ride = new Ride(8,6,7));
        assertEquals("Day must be between 1 and 7.", iae.getMessage());
    }

    @Test
    void testCreateRideIllegalKm(){
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                () -> ride = new Ride(5,6,-7));
        assertEquals("Km must be positive.", iae.getMessage());
    }
}