import java.time.LocalDate;
import java.util.ArrayList;

public class Guest extends User{

    private final ArrayList<Book> reservedBooks;
    private final ArrayList<BorrowedBook> borrowedBooks;

    //Poashtu, kur krijohet nje GUEST i ri, Librarise i shtohet ne ArrayList listofGuests kjo instance e Guestit.
    //Kjo nuk ndodh nese krijohet nje Admin
    public Guest(String username, String userID, String password, Role userRole) {
        super(username, userID, password, userRole);
        this.reservedBooks = new ArrayList<>();
        this.borrowedBooks = new ArrayList<>();
        Library.getListofGuests().add(this);
    }

    public ArrayList<Book> getReservedBooks() {
        return reservedBooks;
    }

    public ArrayList<BorrowedBook> getBorrowedBooks() {
        return borrowedBooks;
    }

    //Metoda per User'in te rezervoje nje liber. Se pari, thirret metoda .contains() e librarise se a ndodhet libri
    //ne listen e libraries, pastaj thirret metoda isAvailable() e librit per te pare se a eshte e reservuar apo jo; pastaj
    //shikon ne listen reservedBooks te User'it, dhe verifikon qe mos te jete e mundur rezervimi i nje librit shume here.
    public void reserveBook(Book book) {
        if(!Library.getBooks().contains(book)){
            System.out.println("This book is not in the database.");
        }
        else if (!book.isAvailable()) {
            System.out.println("Sorry, this book is not available for reservation.");
        } else if (reservedBooks.contains(book)) {
            System.out.println("You have already reserved this book.");
        } else {
            reservedBooks.add(book);
            book.setAvailability(false);
            System.out.println("Book reserved successfully.");
        }
    }

    public void unreserveBook(Book book) {
        if (reservedBooks.contains(book)){
            reservedBooks.remove(book);
            book.setAvailability(true);
            System.out.println("Book unreserved succesfully.");
        } else {
            System.out.println("Book was not reserved in the first place.");
        }
    }

    public void borrowBook(Book book) {
        if (!reservedBooks.contains(book)) {
            System.out.println("Sorry, the book is not available for borrowing. You need to reserve the book first.");
        } else {
            borrowedBooks.add(new BorrowedBook(book, this));
            reservedBooks.remove(book);
            System.out.println("Book borrowed successfully.");
        }
    }

    //Metoda per Guest'in te ktheje librin qe ka huazuar. Se pari, krijohet nje LocalDate variable qe mban daten e tanishme kur thirret
    //kjo metode. Me ane te foreach iterojme ne ArrayList-en e tipit BorrowedBooks dhe per cdo borrowedBook merr Librin ( getBook() )
    //dhe vertetohet se a ekziston aj liber (nga parametri) ne liste: Nese po, pastaj shikon nese data kur po kthehet ky liber a eshte
    //me vone sesa data kur duhet te kthehet libri.
    public void returnBook(Book book) {
        LocalDate returnedBookDate = LocalDate.now();
        for (BorrowedBook borrowedBook : borrowedBooks) {
            if (borrowedBook.getBook().equals(book)) {
                if (returnedBookDate.isAfter(borrowedBook.getReturnBy())) {
                    System.out.println("This book has been returned late!");
                }
                borrowedBooks.remove(borrowedBook);
                book.setAvailability(true);
                System.out.println("Book returned successfully.");
                return;
            }
        }
        System.out.println("You have not borrowed this book.");

    }
}
