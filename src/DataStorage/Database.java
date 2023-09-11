package DataStorage;

import information.Superhero;

import java.util.ArrayList;
import java.util.List;

public class Database {
    Superhero superhero = new Superhero();

    public static List<Superhero> initializeSuperheroes() {
        List<Superhero> superheroes = new ArrayList<>();
        superheroes.add(new Superhero("John Smith", "All Might", true, 2018, 2));
        superheroes.add(new Superhero("Dick Grayson", "Boy Wonder", true, 2014, 1));
        superheroes.add(new Superhero("Saitama", "Caped Baldy", true, 2019, 11));
        superheroes.add(new Superhero("Clark Kent", "Superman", false, 1998, 10));
        superheroes.add(new Superhero("Johnny Bravo", "", false, 2007, 4));
        superheroes.add(new Superhero("Jeff Bezos", "Amazon Prime", false, 2016, 9));
        return superheroes;
    }



    public String getSuperheroInfo(Superhero superhero) {
        return "Name: " + superhero.getName() +
                "\ninformation.Superhero Name: " + superhero.getSuperHeroName() +
                "\nIs Human: " + superhero.isHuman() +
                "\nCreation Year: " + superhero.getCreationYear() +
                "\nStrength 0-10: " + superhero.getStrength() + "\n";
    }


    // Print the superhero database

}
