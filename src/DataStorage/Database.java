package DataStorage;

import information.Superhero;

import java.util.ArrayList;


public class Database {

    private ArrayList<Superhero> superheroeslist;

    public Database (){
        this.superheroeslist = new ArrayList<>();
    }

    public void addHero(String name, String realName, String superPower, boolean isHuman, int creationYear, int strength){
        superheroeslist.add(new Superhero(name, realName, superPower, isHuman, creationYear, strength));
    }

    public ArrayList<Superhero>hentSuperhero(){
        return superheroeslist;
    }


        }
