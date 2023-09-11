import java.util.ArrayList;
import java.util.List;

public class Superhero {
    private final String name;
    private final String superHeroName;
    private final boolean isHuman;
    private final int creationYear;
    private final int strength;

    public Superhero(String name, String superHeroName, boolean isHuman, int creationYear, int strength) {
        this.name = name;
        this.superHeroName = superHeroName;
        this.isHuman = isHuman;
        this.creationYear = creationYear;
        this.strength = strength;
    }

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
    public String getSuperheroInfo() {
        return "Name: " + name +
                "\nSuperhero Name: " + superHeroName +
                "\nIs Human: " + isHuman +
                "\nCreation Year: " + creationYear +
                "\nStrength 0-10: " + strength + "\n";
    }
}
