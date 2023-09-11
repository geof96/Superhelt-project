
import DataStorage.Database;
import information.Superhero;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Database database = new Database();

        Scanner scanner = new Scanner(System.in);

        boolean isRunning = true;
        int answer;
        do {

            System.out.println("Velkommen til Superhero Universet!");
            System.out.println("1. Opret en superhelt");
            System.out.println("9. Afslut programmet");

            answer = Integer.parseInt(scanner.nextLine());
            if (answer == 1) {

                for (int i = 0; i<= 5; i++){

                    String name;
                    String superHeroName;
                    String superPower;
                    boolean isHuman = false;
                    int yearCreated;
                    int strength;

                    char itWorks;

                    System.out.println("Hvad er superheltens rigtige navn? ");
                    // scanner.nextLine();
                    name = scanner.nextLine();

                    System.out.println("Hvad er " + name + "'s superhelte navn?");
                    superHeroName = scanner.nextLine();

                    System.out.println("Hvad er " + name + "'s superkræfter?");
                    superPower = scanner.nextLine();

                    System.out.println("Er " + name + " et menneske? (j/n) ");
                    itWorks = scanner.nextLine().charAt(0);

                    if (itWorks == 'j'){
                        isHuman = true;
                    }

                    System.out.println("Hvornår startede " + name + "'s superhelte karriere?");
                    yearCreated = scanner.nextInt();

                    System.out.println("Hvor stærk er" + name + " (1-50)");
                    strength = scanner.nextInt();

                    System.out.println("Vil du forsætte?");
                    System.out.println("1. Forsæt programmet");
                    System.out.println("9. Afslut programmet");
                    answer = scanner.nextInt();
                    if (answer == 9){
                        isRunning = false;
                    }



                }


                System.out.println("Vil du forsætte?");
                System.out.println("1. Forsæt programmet");
                System.out.println("9. Afslut programmet");

                answer = scanner.nextInt();


            } else {
                isRunning = false;
                System.out.println("Tak for info! God dag!");
            }

        }
            while (isRunning = true && answer != 9);

    database.printSuperheroDatabase();
    }
}
