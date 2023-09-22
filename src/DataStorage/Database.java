package DataStorage;

import information.Superhero;

import java.util.ArrayList;


public class Database {

    private ArrayList<Superhero> superHeroList;

    public Database() {
        this.superHeroList = new ArrayList<>();
    }

    public void editAddedHero(
            String name,
            String realName,
            String superPower,
            boolean isHuman,
            int creationYear,
            int strength) {

        superHeroList.add(new Superhero(
                name,
                realName,
                superPower,
                isHuman,
                creationYear,
                strength));
    }

    public ArrayList<Superhero> hentSuperhero() {
        return superHeroList;
    }


public void removeHero(){

    }

}


