public class Library {

    Book book = new Book("Java Programming");

    void addBook() {
        System.out.println(book.title + " added.");
    }

    void borrowBook() {
        if (book.available) {
            book.available = false;
            System.out.println("Book Borrowed");
        } else {
            System.out.println("Book Not Available");
        }
    }

    void returnBook() {
        book.available = true;
        System.out.println("Book Returned");
    }
}