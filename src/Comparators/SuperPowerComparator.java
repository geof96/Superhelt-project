package Comparators;

import java.util.Comparator;

public class SuperPowerComparator implements Comparator<Superhero> {


    @Override
    public int compare(Superhero d1, Superhero d2) {
        return d1.getSuperPower().compareTo(d2.getSuperPower());
    }
}

