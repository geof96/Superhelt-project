package Comparators;

import java.util.Comparator;

public class StrenghtComparator implements Comparator<Superhero> {

    @Override
    public int compare(Superhero d1, Superhero d2) {
        return d1.getStrength()- d2.getStrength();
    }
}

}
