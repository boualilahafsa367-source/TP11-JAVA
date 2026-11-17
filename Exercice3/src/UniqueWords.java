
import java.util.HashSet;
import java.util.Set;

public class UniqueWords {
    public static void main(String[] args) {

        // Phrase contenant plusieurs mots repetes
        String text = "Java facilite la programmation Java utilise des collections";

        // Decoupage de la phrase en mots
        String[] wordsArray = text.split(" ");

        // Creation d'un Set pour conserver les mots uniques
        Set<String> uniqueWords = new HashSet<>();

        // Ajout des mots dans le HashSet
        for (String word : wordsArray) {
            uniqueWords.add(word);
        }

        // Affichage des mots sans doublons
        System.out.println("Phrase originale : " + text);
        System.out.println("Nombre de mots uniques : " + uniqueWords.size());
        System.out.println("Mots uniques : " + uniqueWords);
    }
}

