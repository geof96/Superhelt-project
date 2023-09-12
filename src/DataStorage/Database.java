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






// Jeg har kommenteret dette væk, da brugeren selv skal indtaste informationerne.
/*
superheroes[0] = new Superhero("John Smith", "All Might", true, 2018, 2);
        superheroes[1] = new Superhero("Dick Grayson", "Boy Wonder", true, 2014, 1);
        superheroes[2] = new Superhero("Saitama", "Caped Baldy", true, 2019, 11);
        superheroes[3] = new Superhero("Clark Kent", "Superman", false, 1998, 10);
        superheroes[4] = new Superhero("Johnny Bravo", "", false, 2007, 4);
        superheroes[5] = new Superhero("Jeff Bezos", "Amazon Prime", false, 2016, 9);
 */