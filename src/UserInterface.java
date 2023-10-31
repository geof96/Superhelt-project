import information.Superhero;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class UserInterface {


    public Controller controller;


    public UserInterface() {
        controller = new Controller();
    }

    //ui.startProgram();
    public void printHeleUserInterface() {


        //ui.startProgram();
        Scanner scanner = new Scanner(System.in);
        int isRunning = 0;


        while (isRunning != 9) {
            System.out.println("Velkommen til Marvel universet");
            System.out.println("1. Opret en superhelt");
            System.out.println("2. Vis liste over superhelte");
            System.out.println("3. Søg efter superhelt");
            System.out.println("4. Søg efter flere superhelte");
            System.out.println("5. Redigerer superhelt.");
            System.out.println("6. Slet superhelt.");
            System.out.println("9. Afslut programmet");

            try {
                isRunning = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Forkert input! Prøv igen.");
                continue;
            }

            scanner.nextLine();

            String name = null;
            if (isRunning == 1) {
                //Opret din superhelt!

                System.out.print("Indtast navnet på Superhelten: ");
                name = null;
                try {
                    name = scanner.nextLine();
                } catch (NoSuchElementException e) {
                    System.out.println("Forkert input! Prøv igen.");
                }


                System.out.print("Indtast det rigtige navn her: ");
                String realName = null;
                try {
                    realName = scanner.nextLine();
                } catch (NoSuchElementException e) {
                    System.out.println("Forkert input! Prøv igen.");
                }

                System.out.print("Indtast superheltens kræfter her: ");
                String superpower = null;
                try {
                    superpower = scanner.nextLine();
                } catch (NoSuchElementException e) {
                    System.out.println("Forkert input! Prøv igen.");
                }

                System.out.print("Er superhelten et menneske? (true/false): ");
                boolean isHuman = false;
                try {
                    isHuman = scanner.nextBoolean();
                } catch (InputMismatchException e) {
                    System.out.println("Forkert input! Prøv igen.");
                }

                System.out.print("Hvornår startet superhelte-karrieren? ");
                int creationYear = 0;
                try {
                    creationYear = scanner.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Forkert input! Prøv igen.");
                }

                System.out.print("Indtast styrken for helt i tal(0-1000): ");
                int strength = 0;
                try {
                    strength = scanner.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Forkert input! Prøv igen.");
                }
                controller.heroAddition(
                        name,
                        realName,
                        superpower,
                        isHuman,
                        creationYear,
                        strength);
                System.out.println(name + " er blevet registreret!");

            } else if (isRunning == 2) {

                // Vis en liste over superhelte
                ArrayList<Superhero> superheroList = controller.pickedSuperhero();
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

            } else if (isRunning == 3) {
                //Søg efter en superhelt!
                System.out.println("Indtast navnet på superhelten: ");


                try {
                    String heroIsFound = scanner.nextLine();
                } catch (NoSuchElementException e) {
                    System.out.println("Forkert input! Prøv igen.");
                    continue;
                }
                String heroIsFound = null;
                Superhero foundHero = controller.searchedHero(heroIsFound);

                if (foundHero != null) {
                    System.out.println("Superhelten blev fundet! ");
                    System.out.println("Superhelte-navn: " + foundHero.getName());
                    System.out.println("Superheltens rigtige navn: " + foundHero.getRealName());
                    System.out.println("Superheltens kræfter: " + foundHero.getSuperPower());
                    System.out.println("Er superhelten et menneske? " + foundHero.isHuman());
                    System.out.println("Karriere start: " + foundHero.getCreationYear());
                    System.out.println("Superheltens styrke ml. 1-1000: " + foundHero.getStrength());
                } else {
                    System.out.println("Superhelten blev ikke fundet!");
                }
            } else if (isRunning == 4) {
                //Søg efter en superhelt!
                System.out.println("Indtast navnet på superhelten: ");

                try {
                    String heroIsFound = scanner.nextLine();
                } catch (NoSuchElementException e) {
                    System.out.println("Forkert input! Prøv igen.");
                }

                String heroIsFound = null;
                ArrayList<Superhero> findHero = controller.searchedHero2(heroIsFound);
                for (Superhero foundHero : findHero) {
                    if (foundHero != null) {
                        System.out.println("Superhelten blev fundet! ");
                        System.out.println("Superhelte-navn: " + foundHero.getName());
                        System.out.println("Superheltens rigtige navn: " + foundHero.getRealName());
                        System.out.println("Superheltens kræfter: " + foundHero.getSuperPower());
                        System.out.println("Er superhelten et menneske? " + foundHero.isHuman());
                        System.out.println("Karriere start: " + foundHero.getCreationYear());
                        System.out.println("Superheltens styrke ml. 1-1000: " + foundHero.getStrength());
                    } else {
                        System.out.println("Superhelten blev ikke fundet!");
                    }
                }
            } else if (isRunning == 5) {

                System.out.println("Indtast navnet på superhelten, som der gerne vil redigere: ");
                String heroToEdit = null;
                try {
                    heroToEdit = scanner.nextLine();
                } catch (NoSuchElementException e) {
                    System.out.println("Forkert input! Prøv igen.");
                }

                System.out.print("Nyt navn: ");
                String newName = null;
                try {
                    newName = scanner.nextLine();
                } catch (NoSuchElementException e) {
                    System.out.println("Forkert input! Prøv igen.");
                }

                System.out.print("Nyt rigtigt navn: ");
                String newRealName = null;
                try {
                    newRealName = scanner.nextLine();
                } catch (NoSuchElementException e) {
                    System.out.println("Forkert input! Prøv igen.");
                }

                System.out.print("Nye superkræfter: ");
                String newSuperpower = null;
                try {
                    newSuperpower = scanner.nextLine();
                } catch (NoSuchElementException e) {
                    System.out.println("Forkert input! Prøv igen.");
                }

                System.out.print("Er superhelten et menneske? (true/false): ");
                boolean newIsHuman = false;
                try {
                    newIsHuman = scanner.nextBoolean();
                } catch (InputMismatchException e) {
                    System.out.println("Forkert input! Prøv igen.");
                }

                System.out.print("Ny startår for karrieren: ");
                int newCreationYear = 0;
                try {
                    newCreationYear = scanner.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Forkert input! Prøv igen.");
                }

                System.out.print("Ny styrke (1-1000): ");
                int newStrength = 0;
                try {
                    newStrength = scanner.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Forkert input! Prøv igen.");
                }

                controller.heroEdits(heroToEdit, newName, newRealName, newIsHuman, newCreationYear, newStrength);
            } else if (isRunning == 6) {
                System.out.println("Skriv navnet på helten der skal fjernes fra listen.");
                String removingHero = null;
                try {
                    removingHero = scanner.nextLine();
                } catch (NoSuchElementException e) {
                    System.out.println("Forkert input! Prøv igen.");
                }
                controller.heroToRemove(name);
            }
        }
    }
}
