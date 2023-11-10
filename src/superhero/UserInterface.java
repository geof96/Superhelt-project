package superhero;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class UserInterface {

    public RegisterController registerController;


    public UserInterface() {
        registerController = new RegisterController();
    }


    public void showMenu() {
        System.out.println("""
                Velkommen til Marvel universet.
                                
                1. Opret en superhelt.
                2. Vis liste over superhelte.
                3. Søg efter superhelt.
                4. Søg efter superhelte med samme navn.
                5. Redigerer superhelt.
                6. Slet superhelt.
                7. Save registeret superhelte.
                8. Sorter superhelte.
                10. Afslut programmet.
                """);
    }

    public void showMenuSortByOneOrTwoAttributes() {
        System.out.println("""
                1) Sort by one attribute.
                2) Sort by two attributes.
                """);
    }

    public void showSortAttributes() {
        System.out.println("""
                1) Sort by Name
                2) Sort by RealName
                3) Sort by SuperPower
                4) Sort by IsHuman
                5) Sort by CreationYear
                6) Sort by Strength
                """);
    }

    public void showMenu4() {
        System.out.println("""
                Write the primary attribute you want sort by:\n
                Superhero Name, Real Name, Superpower, Human, Creation year and Strength.\n
                """);
    }

    public void showMenu5() {
        System.out.println("""
                Write the secondary attribute you want sort by:\n
                Superhero Name, Real Name, Superpower, Human, Creation year and Strength.\n
                """);
    }

    //ui.startProgram();
    public void printHeleUserInterface() {
        registerController.loadList();
        //ui.startProgram();
        Scanner scanner = new Scanner(System.in);
        int isRunning = 0;

        while (isRunning != 10) {
            showMenu();

            try {
                isRunning = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Forkert input! Prøv igen.");
                continue;
            }

            scanner.nextLine();

            String name = null;
            switch (isRunning) {
                case 1 -> {
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
                    registerController.heroAddition(
                            name,
                            realName,
                            superpower,
                            isHuman,
                            creationYear,
                            strength);
                    System.out.println(name + " er blevet registreret!");
                }
                case 2 -> {
                    // Vis en liste over superhelte
                    ArrayList<Superhero> superheroList = registerController.pickedSuperhero();
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
                case 3 -> {
                    //Søg efter en superhelt!
                    System.out.println("Indtast navnet på superhelten: ");

                    String heroIsFound = scanner.nextLine();
                    Superhero foundHero = registerController.searchedHero(heroIsFound);

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
                case 4 -> {
                    //Søg efter en superhelt!
                    System.out.println("Indtast navnet på superhelten: ");

                    try {
                        String heroIsFound = scanner.nextLine();
                    } catch (NoSuchElementException e) {
                        System.out.println("Forkert input! Prøv igen.");
                    }

                    String heroIsFound = null;
                    ArrayList<Superhero> findHero = registerController.searchedHero2(heroIsFound);
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
                }
                case 5 -> {
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

                    registerController.heroEdits(heroToEdit, newName, newRealName, newIsHuman, newCreationYear, newStrength);
                }
                case 6 -> {
                    System.out.println("Skriv navnet på helten der skal fjernes fra listen.");
                    String removingHero = null;
                    try {
                        removingHero = scanner.nextLine();
                    } catch (NoSuchElementException e) {
                        System.out.println("Forkert input! Prøv igen.");
                    }
                    registerController.heroToRemove(name);

                    System.out.println("Superhelten er blevet fjernet.");
                }
                case 7 -> {
                    System.out.println("Registreret superhelte blev gemt.");
                    registerController.saveHeroes();
                }
                case 8 -> {
                    boolean validInput = false;
                    int numberOfSortAttributes = 0;
                    do {
                        showMenuSortByOneOrTwoAttributes();
                        String inputString = scanner.next();
                        try {
                            numberOfSortAttributes = Integer.parseInt(inputString);
                            if ((numberOfSortAttributes > 0) && (numberOfSortAttributes < 3)) {
                                validInput = true;
                            }
                        } catch (NumberFormatException numberFormatException) {
                            showMenuSortByOneOrTwoAttributes();
                        }
                    }
                    while (!validInput);

                    switch (numberOfSortAttributes) {
                        case 1 -> {
                            showSortAttributes();
                            int superheroAttribute = scanner.nextInt();

                            switch (superheroAttribute) {
                                case 1 -> registerController.name();
                                case 2 -> registerController.realName();
                                case 3 -> registerController.superPower();
                                case 4 -> registerController.isHuman();
                                case 5 -> registerController.creationYear();
                                case 6 -> registerController.strength();
                            }
                        }

                        case 2 -> {
                            showSortAttributes();
                            System.out.println("Choose primary attrinute: ");
                            int primaryAttribute = scanner.nextInt();
                            String primarySortString = switch (primaryAttribute) {
                                case 1 -> "SuperHero name";
                                case 2 -> "real name";
                                case 3 -> "Super Power";
                                case 4 -> "Human";
                                case 5 -> "Creation year";
                                case 6 -> "Strength";
                                default -> "SuperHero name";
                            };

                            showSortAttributes();
                            System.out.println("Choose secondary attrinute: ");
                            int secondaryAttribute = scanner.nextInt();
                            String secondarySortString = switch (secondaryAttribute) {
                                case 1 -> "SuperHero name";
                                case 2 -> "real name";
                                case 3 -> "Super Power";
                                case 4 -> "Human";
                                case 5 -> "Creation year";
                                case 6 -> "Strength";
                                default -> "SuperHero name";
                            };

                            registerController.sortBy2(primarySortString, secondarySortString);
                        }
                    }
                }
                case 10 -> registerController.exit();
                default -> System.out.println("Invalid input. Please try again.");
            }
        }
    }
}