package iterator;

public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf();
        bookShelf.appendBook(new Book("Spring of Toby"));
        bookShelf.appendBook(new Book("Effective Java"));
        bookShelf.appendBook(new Book("Unit Test"));
        bookShelf.appendBook(new Book("Kotlin IN ACTION"));
        bookShelf.appendBook(new Book("Java IN ACTION"));

        Iterator it = bookShelf.iterator();

        while (it.hasNext()) {
            Book book = (Book) it.next();
            System.out.println(book.getName());
        }

    }
}
