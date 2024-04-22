import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        // Call the function to fill the HashSet
        HashSet<String> hashSet = Elements.getFilledHashSet();

        String objectToRemove = "2";

        // Iterate over the set and remove the object if found
        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            if (element.equals(objectToRemove)) {
                iterator.remove();
            }
        }

        System.out.println(hashSet);

        // Check if the HashSet is empty
        boolean isEmpty = hashSet.isEmpty();
        System.out.println("Is the HashSet empty? : " + isEmpty);
    }


}