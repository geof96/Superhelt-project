package information;

public class Superhero {
    private String name;
    private String realName;
    private String superPower;
    private boolean isHuman;
    private int creationYear;
    private int strength;


    public Superhero(String name, String realName, String superPower, boolean isHuman, int creationYear, int strength) {
        this.name = name;
        this.realName = realName;
        this.superPower = superPower;
        this.isHuman = isHuman;
        this.creationYear = creationYear;
        this.strength = strength;

    }

    // Getter metoden
    public String getName() {
        return name;
    }

    public String getRealName() {
        return realName;
    }

    public String getSuperPower() {

        return superPower;
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

    //Setter
    public void setName(String name) {
        this.name = name;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public void setHuman(boolean isHuman) {
        this.isHuman = isHuman;
    }

    public void setCreationYear(int creationYear) {
        this.creationYear = creationYear;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setSuperPower(String superPower) {
        this.superPower = superPower;
    }

    @Override
    public String toString() {
        return "Superhero: \n" +
                "name: " + name + "," +
                "realName: " + realName + "," +
                "superPower: " + superPower + "," +
                "isHuman: " + isHuman + "," +
                "creationYear: " + creationYear + "," +
                "strength: " + strength;
    }
}
