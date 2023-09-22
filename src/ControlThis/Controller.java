package ControlThis;

import DataStorage.Database;
import information.Superhero;

import java.util.ArrayList;

public class Controller {
    private Database db;
    private ArrayList<Superhero> superheroes;

    public Controller(Database db) {
        this.db = db;
        this.superheroes = db.hentSuperhero();
    }

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
        superheroes.add(newHero);

        db.editAddedHero(name,
                realName,
                superPower,
                isHuman,
                creationYear,
                strength);

//        superheroes.add(new Superhero(
//                name,
//                realName,
//                superPower,
//                isHuman,
//                creationYear,
//                strength));
    }

    public ArrayList<Superhero> hentSuperhero() {
        return db.hentSuperhero();

    }


    public Superhero findSuperhero(String name) {
        for (Superhero s : superheroes) {
            if (s.getName().equalsIgnoreCase(name)) {
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

    public void removeHero(){

    }

}




