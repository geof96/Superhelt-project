import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;


public class Register {

    FileHandler fileHandler = new FileHandler();


    private ArrayList<Superhero> superheroes = new ArrayList<>();


    public void addHero(String name,
                        String realName,
                        String superPower,
                        boolean isHuman,
                        int creationYear,
                        int strength) {


        Superhero newHero = new Superhero(
                name,
                realName,
                superPower,
                isHuman,
                creationYear,
                strength);
        if (newHero != null) {
            superheroes.add(newHero);
            //harÆndringer = true;

            //Forklaring
            //Det her fortæller programmet at der er sket ændringer og dataene skal gemmes.

        }
    }

    public ArrayList<Superhero> hentSuperhero() {
        return superheroes;

    }


    public Superhero findSuperhero(String name) {
        for (Superhero s : superheroes) {
            if (s.getName().trim().equalsIgnoreCase(name.trim())) {

               return s;
            }
        }
        return null;
    }

    public ArrayList<Superhero> findSuperhero2(String name) {
        ArrayList<Superhero> saveSuperHerolist = new ArrayList<>();

        for (Superhero sAll : superheroes) {
            if (sAll.getName().contains(name)) {
                saveSuperHerolist.add(sAll);
            }
        }
        return saveSuperHerolist;
    }

    public void editHero(String name,
                         String realName,
                         String superPower,
                         boolean isHuman,
                         int creationYear,
                         int strength) {
        for (Superhero superhero : superheroes) {
            if (superhero.getName().equalsIgnoreCase(name)) {
                superhero.setName(name);
                superhero.setRealName(realName);
                superhero.setSuperPower(superPower);
                superhero.setHuman(isHuman);
                superhero.setCreationYear(creationYear);
                superhero.setStrength(strength);
                return;
            }
        }

    }

    public void removeHero(String name) {
        Superhero removingHero = null;
        for (Superhero superhero : superheroes) {
            if (superhero.getName().equalsIgnoreCase(name)) {
                removingHero = superhero;
                break;
            }
        }
        if (removingHero != null) {
            superheroes.remove(removingHero);
        }
    }

    public void saveHeroes() {
        fileHandler.printSuperhero(superheroes);
        /*public void saveHeroes() {
            if (harÆndringer != true) {
                fileHandler.printSuperhero(superheroes);
                harÆndringer = false;
            }
        }*/
        //Forklaring
        // if (harÆndringer) tjekker om der er sket ændringer i data.
        // fileHandler.printSuperhero(superheroes) gemmer dataene hvis ændringer er sket.
        // harÆndringer = false sikrer at dataene kun gemmes én gang indtil der sker flere ændringer i dataene.
    }

    public void saveToFile() {
        fileHandler.saveToFile();
    }

    public void loadList(){
        superheroes = fileHandler.loadToFile();
    }

    public void sortByName() {
        System.out.println("Here is the list sorted by name");
        Collections.sort(superheroes, new NameComparator());
        System.out.println((superheroes));
    }

    public void sortByRealName() {
        System.out.println("Here is the list sorted by Real name");
        Collections.sort(superheroes, new RealNameComparator());
        System.out.println((superheroes));
    }

    public void sortSuperPower() {
        System.out.println("Here is the list sorted by SuperPower");
        Collections.sort(superheroes, new SuperPowerComparator());
        System.out.println((superheroes));
    }

    public void sortByIsHuman() {
        System.out.println("Here is the list sorted by IsHuman");
        Collections.sort(superheroes, new IsHumanComparator());
        System.out.println((superheroes));
    }

    public void sortByCreationYear() {
        System.out.println("Here is the list sorted by CreationYear");
        Collections.sort(superheroes, new CreationYearComparator());
        System.out.println((superheroes));
    }

    public void sortByStrength() {
        System.out.println("Here is the list sorted by Strength");
        Collections.sort(superheroes, new StrenghtComparator());
        System.out.println((superheroes));
    }



    //private boolean harÆndringer = false;

// Forklaring på hvorfor
    //Hvis den er true så er der ændringer og dataene gemmes.
    // Hvis den er false så er der ingen ændringer og dataene forbliver uændret.

}




