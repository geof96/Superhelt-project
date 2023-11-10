package superhero.comparators;

import superhero.Superhero;

import java.util.Comparator;

public class IsHumanComparator implements Comparator<Superhero> {
    @Override
    public int compare(Superhero a, Superhero b) {
        return Boolean.compare(a.isHuman(), b.isHuman());
    }
}

