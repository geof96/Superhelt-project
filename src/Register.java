import java.util.ArrayList;


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

    public void loadList(){
        superheroes = fileHandler.recentList();
    }
}




