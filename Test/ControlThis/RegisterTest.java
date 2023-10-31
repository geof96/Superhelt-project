package ControlThis;

import DataStorage.Database;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControllerTest {
    Register controller;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void addHero() {
        controller = new Register(new Database());
        // Arrange: Define hero attributes
        String name = "Superman";
        String realName = "Clark Kent";
        String superPower = "Flight, Super Strength";
        boolean isHuman = true;
        int creationYear = 1938;
        int strength = 100;

        // Act: Add a hero to the controller
        controller.addHero(name, realName, superPower, isHuman, creationYear, strength);

        // Assert: Check if the hero was added to the controller's list
        assertTrue(controller.hentSuperhero().stream().anyMatch(hero ->
                hero.getName().equals(name) &&
                        hero.getRealName().equals(realName) &&
                        hero.getSuperPower().equals(superPower) &&
                        hero.isHuman() == isHuman &&
                        hero.getCreationYear() == creationYear &&
                        hero.getStrength() == strength));

        // Assert: Check if the hero was added to the database
        assertTrue(controller.hentSuperhero().size() != 1);
    }

    @Test
    void hentSuperhero() {

        // Arrange

        //Act

        //Assert
    }

    @Test
    void findSuperhero() {

        // Arrange

        //Act

        //Assert
    }

    @Test
    void findSuperhero2() {

        // Arrange

        //Act

        //Assert
    }

    @Test
    void editHero() {

        // Arrange

        //Act

        //Assert

    }
}