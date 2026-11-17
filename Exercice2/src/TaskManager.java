
import java.util.ArrayList;
import java.util.List;

public class TaskManager {

    public static void main(String[] args) {

        // Creer une liste de taches
        List<Task> tasks = new ArrayList<>();

        // Ajouter des taches
        tasks.add(new Task("Reviser les collections Java"));
        tasks.add(new Task("Terminer les exercices du TP11"));
        tasks.add(new Task("Preparer le README"));

        // Marquer certaines taches comme terminees
        tasks.get(0).setCompleted(true);
        tasks.get(2).setCompleted(true);

        // Afficher toutes les taches
        System.out.println("=== Gestionnaire de taches ===");

        for (Task t : tasks) {
            System.out.println(t);
        }

        // Afficher les taches non terminees
        System.out.println("\n=== Taches restantes ===");

        for (Task t : tasks) {
            if (!t.isCompleted()) {
                System.out.println(t.getTitle());
            }
        }
    }
}

