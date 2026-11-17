
import java.util.*;

public class SetComparison {
    public static void main(String[] args) {

        // Creation des trois types de Set
        Set<String> hashSet = new HashSet<>(
            Arrays.asList("Kiwi", "Abricot", "Mangue")
        );

        Set<String> linkedHashSet = new LinkedHashSet<>(
            Arrays.asList("Kiwi", "Abricot", "Mangue")
        );

        Set<String> treeSet = new TreeSet<>(
            Arrays.asList("Kiwi", "Abricot", "Mangue")
        );

        // Affichage des resultats
        System.out.println("HashSet : " + hashSet);
        System.out.println("LinkedHashSet : " + linkedHashSet);
        System.out.println("TreeSet : " + treeSet);
    }
}
