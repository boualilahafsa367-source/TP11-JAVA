
import java.util.ArrayList;
import java.util.List;

public class ShoppingListApp {

    public static void main(String[] args) {

        // Creer une liste de courses
        List<String> shoppingList = new ArrayList<>();

        // Ajouter des articles dans la liste
        shoppingList.add("Riz");
        shoppingList.add("Lait");
        shoppingList.add("Pain");
        shoppingList.add("Pommes");

        // Afficher tous les articles
        System.out.println("=== Liste de courses ===");

        for (String item : shoppingList) {
            System.out.println("- " + item);
        }

        // Supprimer un article de la liste
        shoppingList.remove("Lait");

        // Verifier si les pommes sont presentes
        boolean hasApples = shoppingList.contains("Pommes");

        // Afficher le resultat de la recherche
        System.out.println("\n=== Verification ===");
        System.out.println("Contient des pommes ? " + hasApples);

        // Afficher le nombre final d'articles
        System.out.println("Taille finale de la liste : " + shoppingList.size());
    }
}
