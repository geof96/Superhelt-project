package superhero.comparators;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import superhero.Superhero;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class NameComparatorTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void comparePositive() {
        //Arrange
        Superhero superhero1 = new Superhero("Jawad", "Fakhreddine", "Super Jawad", true, 2004, 1000);
        Superhero superhero2 = new Superhero("Anas", "Faisal", "Super duber", true, 1996, 1000);
        NameComparator nameComparator = new NameComparator();

        //Act
        int actualResult = nameComparator.compare(superhero1, superhero2);

        //Assert
        assertTrue(actualResult > 0);
    }

    @Test
    void compareNegative() {
        //Arrange
        Superhero superhero1 = new Superhero("Jawad", "Fakhreddine", "Super Jawad", true, 2004, 1000);
        Superhero superhero2 = new Superhero("Anas", "Faisal", "Super duber", true, 1996, 1000);
        NameComparator nameComparator = new NameComparator();

        //Act
        int actualResult = nameComparator.compare(superhero2, superhero1);

        //Assert
        assertTrue(actualResult < 0);
    }

    @Test
    void compareZero() {
        //Arrange
        Superhero superhero1 = new Superhero("Anas", "Fakhreddine", "Super Jawad", true, 2004, 1000);
        Superhero superhero2 = new Superhero("Anas", "Faisal", "Super duber", true, 1996, 1000);
        NameComparator nameComparator = new NameComparator();

        //Act
        int actualResult = nameComparator.compare(superhero2, superhero1);

        //Assert
        assertTrue(actualResult == 0);
    }
}