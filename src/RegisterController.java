import java.util.ArrayList;

public class RegisterController {
    Register register = new Register();
    private boolean isChanged = false;


    public void heroAddition(String name,
                             String realName,
                             String superPower,
                             boolean isHuman,
                             int creationYear,
                             int strength){
        isChanged = true;
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
        isChanged = true;
        register.editHero(name, realName, superPower, isHuman, creationYear, strength);
    }

    public void heroToRemove(String name){
        isChanged = true;
        register.removeHero(name);
    }

    public Superhero searchedHero(String name){
        return register.findSuperhero(name);

    }

    public ArrayList<Superhero> searchedHero2(String name){
       return register.findSuperhero2(name);

    }

    public ArrayList<Superhero> pickedSuperhero(){
        return register.hentSuperhero();
    }
    public void saveHeroes() {
        register.saveHeroes();
    }

    public void loadList(){
        register.loadList();
    }
    public void name() {
        register.sortByName();
    }

    public void realName(){
        register.sortByRealName();
    }

    public void superPower(){
        register.sortSuperPower();
    }

    public void isHuman(){
        register.sortByIsHuman();
    }
    public void creationYear(){
        register.sortByCreationYear();
    }

    public void strength(){
        register.sortByStrength();
    }

    public void saveToFile(){
        register.saveToFile();
    }

    public void exit(){
        if (isChanged){
            register.saveHeroes();
        }
    }
}
