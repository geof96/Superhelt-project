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

    public void addHero(String name, String realName, String superPower, boolean isHuman, int creationYear, int strength) {
        superheroes.add(new Superhero(name, realName, superPower, isHuman, creationYear, strength));
    }

    public ArrayList<Superhero> hentSuperhero() {
        return db.hentSuperhero();

    }

    public Superhero findSuperhero(String name) {
        for (Superhero s : superheroes) {
            if (s.getName().contains(name)) {
                return s;
            }
        }
        return null;
    }
}

