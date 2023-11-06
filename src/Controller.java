import ControlThis.Register;
import DataStorage.Database;
import information.Superhero;
import java.util.ArrayList;

public class Controller {
    Register register = new Register();

    public Controller() {
        Database database = new Database();
    }


    public void heroAddition(String name,
                             String realName,
                             String superPower,
                             boolean isHuman,
                             int creationYear,
                             int strength){
        register.addHero(
                name,
                realName,
                superPower,
                isHuman,
                creationYear,
                strength);
    }

    public void heroEdits(String name, String realName,
                          String superPower,
                          boolean isHuman,
                          int creationYear,
                          int strength){
        register.editHero(name, realName, superPower, isHuman, creationYear, strength);
    }

    public void heroToRemove(String name){
        register.removeHero(name);
    }

    public Superhero searchedHero(String name){
        register.findSuperhero(name);
        return null;
    }

    public ArrayList<Superhero> searchedHero2(String name){
        register.findSuperhero2(name);
        return null;
    }

    public ArrayList<Superhero> pickedSuperhero(){
        return register.hentSuperhero();
    }
    public void saveHeroes() {
        register.saveHeroes();

    }
}
