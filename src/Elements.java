import java.util.HashSet;
public class Elements {
    public static HashSet<String> getFilledHashSet() {
        HashSet<String> set = new HashSet<String>( );

        // Aggiungiamo alcuni elementi all'HashSet
        set.add("Elemento 1");
        set.add("Elemento 2");
        set.add("Elemento 3");

        return set;
    }
}
