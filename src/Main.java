import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Superhero> superheroes = Superhero.initializeSuperheroes();

        // Print the superhero database
        for (Superhero superhero : superheroes) {
            String superheroInfo = superhero.getSuperheroInfo();
            System.out.println(superheroInfo);
        }
    }
}
