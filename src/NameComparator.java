import java.util.Comparator;

public class NameComparator implements Comparator<Superhero> {

    @Override
    public int compare(Superhero d1, Superhero d2) {
        return d1.getName().compareTo(d2.getName());
    }
}
