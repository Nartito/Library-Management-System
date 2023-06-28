import java.util.ArrayList;
//TODO: Veprimet ne Librari do te jene te ndryshme ne baze te rolit te User'it (Admin, RegularGuest)
public class Library {
    private static final ArrayList<Book> books = new ArrayList<>();
    public static ArrayList<Book> getBooks() {
        return books;
    }

    //Metoda per te shtuar nje liber ne librari. Nese nje liber ndodhet paraprakisht ne liste, nuk shtohet duplicate.
    public void addBook(Book book){
        if (books.contains(book)){
            System.out.println("Book has already been added!");
        } else {
            books.add(book);
            System.out.println("Book has been added successfully.");
        }
    }

    //Metoda per te hequr nje liber nga libraria. Nese nje liber nuk ndodhet ne liste, shfaqet mesazhi se nuk eksizton.
    public void removeBook(Book book){
        if(books.contains(book)){
            books.remove(book);
            System.out.println("Book has been removed successfully.");
        } else {
            System.out.println("Book doesn't exist in the library");
        }
    }

    //Metoda per te pare te gjitha librat ne librari.
    public void getAllBooks(){
        for (Book book: books
             ) {
            System.out.println(book);
        }
    }

    public void removeAllBooks(){
        books.clear();
        System.out.println("All books have been removed from the list.");
    }

    //Metoda per te kerkuar librin me ane te titullit.
    public void searchBookByTitle(String userTitle){
        for (Book book: books) {
            if(book.getTitle().equalsIgnoreCase(userTitle)){
                System.out.println(book);
            }
        }
    }

    //Metoda per te kerkuar librin me ane te ISBN
    public void searchBookByISBN(String userISBN){
        for (Book book: books) {
            if(book.getISBN().equalsIgnoreCase(userISBN)){
                System.out.println(book);
            }
        }
    }

    //Metoda per te kerkuar libra te shkruar nga autori
    public void searchBookByAuthor(String userAuthor){
        for (Book book: books) {
            if(book.getAuthor().equalsIgnoreCase(userAuthor)){
                System.out.println(book);
            }
        }
    }

    //Metoda per te kerkuar libra prej zhanrave te ndryshem
    public void searchBookByGenre(String userGenre){
        for (Book book: books) {
            if(book.getGenre().equalsIgnoreCase(userGenre)){
                System.out.println(book);
            }
        }
    }
}
