import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Superhero> superheroes = Superhero.initializeSuperheroes();

        // Print the superhero database
        for (Superhero superhero : superheroes) {
            String superheroInfo = superhero.getSuperheroInfo();
            System.out.println(superheroInfo);
        }
    }
}
