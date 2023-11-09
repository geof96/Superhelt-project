import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandler {

    private File f = new File("superheroregister.csv");
    private ArrayList<Superhero> superheroes = new ArrayList<>();

    public void printSuperhero(ArrayList<Superhero> superheroList) {
        try {
            PrintStream output = new PrintStream(f);
            for (Superhero superhero : superheroList) {
                if (superhero != null) {
                    output.println(superhero);
                }else {
                    System.out.println("There is no hero registered.");
                }

            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
    }


    public void saveToFile() {
        try {
            PrintStream output = new PrintStream(f);
            for (Superhero superhero : superheroes) {
                output.println(superhero.getName() + ',' +
                        superhero.getRealName() + ',' +
                        superhero.getSuperPower() + ',' +
                        superhero.getCreationYear() + ',' +
                        superhero.getStrength() + ',' +
                        superhero.isHuman());
            }
            output.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


    public ArrayList<Superhero> loadToFile() {
        ArrayList<Superhero> information = new ArrayList<>();

        try {
            Scanner sc = new Scanner(f, StandardCharsets.ISO_8859_1);

            //sc.nextLine();
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] attributer = line.split(",");
                if (attributer.length == 6) {

                    String name = attributer[0].trim();

                    String realName = attributer[1].trim();

                    String superPower = attributer[2].trim();

                    boolean isHuman = Boolean.parseBoolean(attributer[3].trim());
                    int creationYear;
                    creationYear = Integer.parseInt(attributer[4].trim());
                    int strength;

                    strength = Integer.parseInt(attributer[5].trim());

                    Superhero indlæsData = new Superhero(
                            name,
                            realName,
                            superPower,
                            isHuman,
                            creationYear,
                            strength);

                    information.add(indlæsData);
                } else {
                    System.out.println("Length != 6");
                }

            }
            sc.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return information;
    }


}
