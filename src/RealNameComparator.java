import java.util.Comparator;

public class RealNameComparator implements Comparator<Superhero> {

    @Override
    public int compare(Superhero d1, Superhero d2) {
        return d1.getRealName().compareTo(d2.getRealName());
    }
}
