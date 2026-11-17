
public class Task {

    private String title;
    private boolean completed;

    // Constructeur pour initialiser une nouvelle tache
    public Task(String title) {
        this.title = title;
        this.completed = false;
    }

    // Retourner le titre de la tache
    public String getTitle() {
        return title;
    }

    // Verifier si la tache est terminee
    public boolean isCompleted() {
        return completed;
    }

    // Modifier l'etat de la tache
    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    // Representer la tache sous forme de texte
    @Override
    public String toString() {
        return "[" + (completed ? "X" : " ") + "] " + title;
    }
}

