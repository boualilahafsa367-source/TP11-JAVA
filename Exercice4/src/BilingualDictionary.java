
import java.util.HashMap;
import java.util.Map;

public class BilingualDictionary {
    public static void main(String[] args) {

        // Creation du dictionnaire anglais-francais
        Map<String, String> dictionary = new HashMap<>();

        // Ajout des mots et de leurs traductions
        dictionary.put("computer", "ordinateur");
        dictionary.put("book", "livre");
        dictionary.put("window", "fenetre");
        dictionary.put("school", "ecole");
        dictionary.put("garden", "jardin");

        // Recherche d'une traduction
        System.out.println("Traduction de 'computer' : "
                + dictionary.get("computer"));

        // Affichage de toutes les entrees du dictionnaire
        System.out.println("\n--- Dictionnaire complet ---");

        for (Map.Entry<String, String> entry : dictionary.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}


