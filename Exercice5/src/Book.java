
public class Book {

    // Attributs prives du livre
    private String isbn;
    private String title;
    private String author;

    // Constructeur
    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    // Getters
    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    // Representation textuelle du livre
    @Override
    public String toString() {
        return "Livre [ISBN=" + isbn
                + ", Titre=" + title
                + ", Auteur=" + author + "]";
    }
}

