
public class Main {

    public static void main(String[] args) {

        // Creation de la bibliotheque
        Library library = new Library();

        // Creation de plusieurs livres
        Book book1 = new Book("978-9954-21-6301",
                "Java et les Collections", "Nadia Karim");

        Book book2 = new Book("978-9954-21-6302",
                "Python pour debutants", "Youssef Amrani");

        Book book3 = new Book("978-9954-21-6303",
                "Les Bases de l'Informatique", "Salma Idrissi");

        // Ajout des livres a la bibliotheque
        library.addBookIndexed(book1);
        library.addBookIndexed(book2);
        library.addBookIndexed(book3);

        // Ajout des categories
        library.addCategory("Programmation");
        library.addCategory("Informatique");
        library.addCategory("Programmation");

        System.out.println("=== Inventaire de la bibliotheque ===");

        for (Book book : library.getBooks()) {
            System.out.println(book);
        }

        // Recherche d'un livre par ISBN
        System.out.println("\n=== Recherche par ISBN ===");
        System.out.println(library.findByIsbn("978-9954-21-6302"));

        // Premier emprunt
        System.out.println("\n=== Gestion des emprunts ===");

        if (library.borrowBook(book1, "Amine")) {
            System.out.println("Livre emprunte par Amine.");
        }

        // Tentative d'un deuxieme emprunt du meme livre
        if (!library.borrowBook(book1, "Sara")) {
            System.out.println("Livre deja emprunte, indisponible.");
        }

        // Restitution du livre
        library.returnBook(book1);
        System.out.println("Livre restitue.");

        // Nouveau emprunt apres restitution
        if (library.borrowBook(book1, "Sara")) {
            System.out.println("Nouveau emprunt effectue par Sara.");
        }
    }
}
