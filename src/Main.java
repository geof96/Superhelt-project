
import DataStorage.Database;
import information.Superhero;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Superhero> superheroes = Database.initializeSuperheroes();

        Scanner scanner = new Scanner(System.in);

        boolean isRunning = true;

        do {

            System.out.println("Velkommen til information.Superhero Universet!");
            System.out.println("1. Opret en superhelt");
            System.out.println("9. Afslut programmet");
            int answer = scanner.nextInt();
            if (answer == 1){
                isRunning = true;

            }
            else {
                isRunning = false;
            }

    }while (isRunning = true);
    }
}
