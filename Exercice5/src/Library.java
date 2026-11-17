
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Library {

    // Liste contenant tous les livres
    private List<Book> books = new ArrayList<>();

    // Ensemble des categories sans doublons
    private Set<String> categories = new HashSet<>();

    // Index permettant de rechercher un livre par ISBN
    private Map<String, Book> isbnIndex = new HashMap<>();

    // Association entre un livre emprunte et son emprunteur
    private Map<Book, String> loans = new HashMap<>();

    // Ajout d'un livre dans l'inventaire et dans l'index
    public void addBookIndexed(Book book) {
        books.add(book);
        isbnIndex.put(book.getIsbn(), book);
    }

    // Ajout d'une categorie
    public void addCategory(String category) {
        categories.add(category);
    }

    // Recuperation de la liste des livres
    public List<Book> getBooks() {
        return books;
    }

    // Recherche d'un livre par son ISBN
    public Book findByIsbn(String isbn) {
        return isbnIndex.get(isbn);
    }

    // Emprunt d'un livre s'il est disponible
    public boolean borrowBook(Book book, String borrower) {
        if (!loans.containsKey(book)) {
            loans.put(book, borrower);
            return true;
        }
        return false;
    }

    // Restitution d'un livre
    public void returnBook(Book book) {
        loans.remove(book);
    }
}
