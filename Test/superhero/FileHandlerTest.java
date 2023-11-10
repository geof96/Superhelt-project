package superhero;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class FileHandlerTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void loadToFile() {
        //Arrange
        FileHandler fileHandler = new FileHandler();

        //Act
        ArrayList<Superhero> actualResult = fileHandler.loadFromFile();

        //Assert
        ArrayList<Superhero> expectedResult = new ArrayList<>();
        expectedResult.add(new Superhero("Anas", "Faisal", "Said", true, 1996, 1000));
        expectedResult.add(new Superhero("Jawad", "Ali", "Fakhreddine", true, 2004, 1000));
        expectedResult.add(new Superhero("Berzan", "Savuran", "Super savuran", true, 2003, 1000));
        expectedResult.add(new Superhero("Mo", "Muk", "Super Muk", true, 1700, 2));
        expectedResult.add(new Superhero("Anas", "Super Anas", "Super Duber Anas", true, 2, 1));

        assertEquals(expectedResult, expectedResult);
    }
}