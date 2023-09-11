package information;

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



}
