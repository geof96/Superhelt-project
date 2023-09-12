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

//import DataStorage.Database;
//import information.Superhero;
//
//import java.util.Scanner;
//
//public class Main {
//    Database database = new database;
//    Controller controller = new Controller(database);
//    Superhero superhero = new Superhero();
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        Main m = new Main();
//        Database db = new Database();
//        m.controller = new Controller(db);
//        int isRunning = 0;
//
//        while (isRunning == 1) {
//            System.out.println("Velkommen til Marvel universet");
//            System.out.println("1. Opret en superhelt");
//            System.out.println("2. Vis listen over superhelte.");
//            System.out.println("9. Afslut programmet");
//            isRunning = scanner.nextInt();
//            if (isRunning == 1) {
//                System.out.println("Hvad er superheltens rigtige navn? ");
//               ? = scanner.nextLine();
//            }
//        }
//
//
//    }
//}
////        boolean isRunning = true;
////        int answer;
////
////
////            System.out.println("Velkommen til Superhero Universet!");
////            System.out.println("1. Opret en superhelt");
////            System.out.println("9. Afslut programmet");
////
////            answer = Integer.parseInt(scanner.nextLine());
////
////
////                for (int i = 0; i<= 5; i++){
////                    if (answer == 1) {
////
////
////                    String name;
////                    String superHeroName;
////                    String superPower;
////                    boolean isHuman = false;
////                    int yearCreated;
////                    int strength;
////
////                    char itWorks;
////
////                    System.out.println("Hvad er superheltens rigtige navn? ");
////
////                    name = scanner.nextLine();
////
////                    System.out.println("Hvad er " + name + "'s superhelte navn?");
////                    superHeroName = scanner.nextLine();
////
////                    System.out.println("Hvad er " + name + "'s superkræfter?");
////                    superPower = scanner.nextLine();
////
////                    System.out.println("Er " + name + " et menneske? (j/n) ");
////                    itWorks = scanner.nextLine().charAt(0);
////
////                    if (itWorks == 'j'){
////                        isHuman = true;
////                    }
////
////                    System.out.println("Hvornår startede " + name + "'s superhelte karriere?");
////                    yearCreated = scanner.nextInt();
////
////                    System.out.println("Hvor stærk er" + name + " (1-50)");
////                    strength = scanner.nextInt();
////
////                    System.out.println("Vil du forsætte?");
////                    System.out.println("1. Forsæt programmet");
////                    System.out.println("9. Afslut programmet");
////                    answer = scanner.nextInt();
////                    if (answer == 9){
////                        isRunning = false;
////                    }
////
////
////                    else {
////                        isRunning = false;
////                        System.out.println("Tak for info! God dag!");
////                    }
////                    }
////
////
////                System.out.println("Vil du forsætte?");
////                System.out.println("1. Forsæt programmet");
////                System.out.println("9. Afslut programmet");
////
////                answer = scanner.nextInt();
////
////
////            }
////            }








