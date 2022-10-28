import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class FindFreeSpotsTest extends FindFreeSpots {

    @Test
    public void testCheckString() throws  Exception {
        System.out.println("====== Aakanksha Desai == TEST ONE EXECUTED =======");
        assertEquals(false, FindFreeSpots.checkString("Aakanksha",0));

    }

    @Test
    void testReadFromFile() throws IOException {
        System.out.println("====== Aakanksha Desai == TEST TWO EXECUTED =======");
        assertEquals(false,FindFreeSpots.ReadFromFile());

        System.out.println("====== Aakanksha Desai == TEST THREE EXECUTED =======");
        assertEquals(false,FindFreeSpots.ReadFromFile());

        System.out.println("====== Aakanksha Desai == TEST FOUR EXECUTED =======");
        assertEquals(false,FindFreeSpots.ReadFromFile());

    }



    @Test
    void testCheckAvaibility() {
        System.out.println("====== Aakanksha Desai == TEST FIFTH EXECUTED =======");
        assertEquals(false,FindFreeSpots.CheckAvaibility("1101"));
    }
}