package superhero;

import superhero.comparators.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


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
    }

    public void loadList() {
        superheroes = fileHandler.loadFromFile();
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

    public void sortByTwoAttributes(String comparator1, String comparator2) {
        Comparator comp1 = null;
        Comparator comp2 = null;

        if (comparator1.equalsIgnoreCase("SuperHero name")) {
            comp1 = new NameComparator();
        } else if (comparator1.equalsIgnoreCase("real name")) {
            comp1 = new RealNameComparator();
        } else if (comparator1.equalsIgnoreCase("Super Power")) {
            comp1 = new SuperPowerComparator();
        } else if (comparator1.equalsIgnoreCase("Human")) {
            comp1 = new IsHumanComparator();
        } else if (comparator1.equalsIgnoreCase("Creation year")) {
            comp1 = new CreationYearComparator();
        } else if (comparator1.equalsIgnoreCase("Strength")) {
            comp1 = new StrenghtComparator();
        }

        if (comparator2.equalsIgnoreCase("SuperHero name")) {
            comp2 = new NameComparator();
        } else if (comparator2.equalsIgnoreCase("real name")) {
            comp2 = new RealNameComparator();
        } else if (comparator2.equalsIgnoreCase("Super Power")) {
            comp2 = new SuperPowerComparator();
        } else if (comparator2.equalsIgnoreCase("Human")) {
            comp2 = new IsHumanComparator();
        } else if (comparator2.equalsIgnoreCase("Creation year")) {
            comp2 = new CreationYearComparator();
        } else if (comparator2.equalsIgnoreCase("Strength")) {
            comp2 = new StrenghtComparator();
        }
        Collections.sort(superheroes, comp1.thenComparing(comp2));
        System.out.println(superheroes);
    }
}




