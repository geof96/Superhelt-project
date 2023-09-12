import DataStorage.Database;
import information.Superhero;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private final Controller controller;

    public Main() {
        Database database = new Database();
        controller = new Controller(database);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main m = new Main();

        int isRunning = 0;

        while (isRunning != 9) {
            System.out.println("Velkommen til Marvel universet");
            System.out.println("1. Opret en superhelt");
            System.out.println("2. Vis liste over superhelte");
            System.out.println("9. Afslut programmet");
            isRunning = scanner.nextInt();
            scanner.nextLine();

            if (isRunning == 1) {
                System.out.print("Indtast navnet på Superhelten: ");
                String name = scanner.nextLine();
                System.out.print("Indtast det rigtige navn her: ");
                String realName = scanner.nextLine();
                System.out.print("Indtast superheltens kræfter her: ");
                String superpower = scanner.nextLine();
                System.out.print("Er superhelten et menneske? (true/false): ");
                boolean isHuman = scanner.nextBoolean();
                System.out.print("Hvornår startet superhelte-karrieren? ");
                int creationYear = scanner.nextInt();
                System.out.print("Indtast styrken for helt i tal(0-1000): ");
                int strength = scanner.nextInt();

                m.controller.addHero(name, realName, superpower, isHuman, creationYear, strength);
                System.out.println(name + " er blevet registreret!");
            } else if (isRunning == 2) {
                // Vis en liste over superhelte
                ArrayList<Superhero> superheroList = m.controller.hentSuperhero();
                System.out.println("Liste over superhelte:");
                for (Superhero superhero : superheroList) {
                    System.out.println("Superhelte-navn: " + superhero.getName());
                    System.out.println();
                    System.out.println("Rigtige navn: " + superhero.getRealName());
                    System.out.println();
                    System.out.println("Superkraft: " + superhero.getSuperPower());
                    System.out.println();
                    System.out.println("Er superhelten et menneske? " + superhero.isHuman());
                    System.out.println();
                    System.out.println("Karrierer start: " + superhero.getCreationYear());
                    System.out.println();
                    System.out.println("Styrke målt ml. 1-1000: " + superhero.getStrength());
                    System.out.println();
                }
            }
        }
    }
}










