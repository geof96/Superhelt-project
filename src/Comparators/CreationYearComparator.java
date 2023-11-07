package Comparators;

import java.util.Comparator;

public class CreationYearComparator implements Comparator<Superhero> {

    @Override
    public int compare(Superhero d1, Superhero d2) {
        return d1.getCreationYear() - d2.getCreationYear();
    }
        }
