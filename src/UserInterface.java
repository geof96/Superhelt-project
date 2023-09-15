import DataStorage.Database;
import information.Superhero;
import ControlThis.Controller;
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {


    public Controller controller;
    Database database = new Database();

    public UserInterface(){
        controller = new Controller(database);
    }
    public void printHeleUserInterface() {


        //ui.startProgram();
        Scanner scanner = new Scanner(System.in);
        String searchHero = null;
        int isRunning = 0;


        while (isRunning != 9) {
            System.out.println("Velkommen til Marvel universet");
            System.out.println("1. Opret en superhelt");
            System.out.println("2. Vis liste over superhelte");
            System.out.println("3. Søg efter superhelt");
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

                controller.addHero(name, realName, superpower, isHuman, creationYear, strength);
                System.out.println(name + " er blevet registreret!");
            } else if (isRunning == 2) {
                // Vis en liste over superhelte
                ArrayList<Superhero> superheroList = controller.hentSuperhero();
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
                System.out.println("Indtast navnet på superhelten: ");
                String heroIsFound = scanner.nextLine();
                Superhero foundHero = controller.findSuperhero(heroIsFound);

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
    }
}
