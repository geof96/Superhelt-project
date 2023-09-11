package userstory1;

import java.util.ArrayList;
import java.util.List;

public class Superhero {
    private String name;
    private String superHeroName;
    private boolean isHuman;
    private int creationYear;
    private int strength;

    public Superhero(String name, String superHeroName, boolean isHuman, int creationYear, int strength) {
        this.name = name;
        this.superHeroName = superHeroName;
        this.isHuman = isHuman;
        this.creationYear = creationYear;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public String getSuperHeroName() {
        return superHeroName;
    }

    public boolean isHuman() {
        return isHuman;
    }

    public int getCreationYear() {
        return creationYear;
    }

    public int getStrength() {
        return strength;
    }

    public static List<Superhero> initializeSuperheroes() {
        List<Superhero> superheroes = new ArrayList<>();
        superheroes.add(new Superhero("John Smith", "Smallmight", true, 2002, 1));
        superheroes.add(new Superhero("Dick Grayson", "Boy Wonder", true, 2014, 0));
        superheroes.add(new Superhero("Clark Kent", "Superman", false, 1998, 10));
        superheroes.add(new Superhero("Johnny Bravo", "", false, 2007, 4));
        superheroes.add(new Superhero("Jeff Bezos", "Amazon Prime", false, 2016, 9));
        return superheroes;
    }
    public String getSuperheroInfo() {
        return "Name: " + name +
                "\nSuperhero Name: " + superHeroName +
                "\nIs Human: " + isHuman +
                "\nCreation Year: " + creationYear +
                "\nStrength: " + strength + "\n";
    }
}
