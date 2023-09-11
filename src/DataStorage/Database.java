package DataStorage;

import information.Superhero;


public class Database {
    private Superhero[] heroList;
    int count = 0;
    int maxsize = 5;
    public Database(){
        this.heroList = new Superhero[maxsize];
    }


    public void addHero(String name, String realName, String superPower,boolean isHuman, int creationYear, int strength)
    {
        if (count <= maxsize) {
            heroList[count] = new Superhero(name, realName, superPower, isHuman, creationYear, strength);
            count++;
        }
    }

    public String getSuperheroInfo(Superhero superhero) {
        return "Name: " + superhero.getName() +
                "\ninformation.Superhero Name: " + superhero.getRealName() +
                "\nIs Human: " + superhero.isHuman() +
                "\nCreation Year: " + superhero.getCreationYear() +
                "\nStrength 0-10: " + superhero.getStrength() + "\n";
    }



    public void printSuperheroDatabase() {
        System.out.println("Superhero Database:");
        for (Superhero superhero : heroList) {
            System.out.println(getSuperheroInfo(superhero));


        }
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