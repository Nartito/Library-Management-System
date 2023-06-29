import java.util.ArrayList;
//TODO: Duke perdorur inheritance, do te mund te ndajme nje User -> Admin, RegularUser. Admini do te kete privilegje
//TODO: per te shtuar, edituar libra, kurse RegularUser do te kete mundesi te rezervoje librin dhe te marre ate hua.
public class User {
    private String userID;
    private String username;
    private String password;
    private ArrayList<Book> reservedBooks;
    private ArrayList<BorrowedBook> borrowedBooks;

    public User(String username, String userID, String password) {
        this.username = username;
        this.userID = userID;
        this.password = password;
        this.reservedBooks = new ArrayList<>();
        this.borrowedBooks = new ArrayList<>();
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //Metoda per User'in te rezervoje nje liber. Se pari, thirret metoda .contains() e librarise se a ndodhet libri
    //ne listen e libraries, pastaj thirret metoda isAvailable() e librit per te pare se a eshte e reservuar apo jo; pastaj
    //shikon ne listen reservedBooks te User'it, dhe verifikon qe mos te jete e mundur rezervimi i nje librit shume here.
    public void reserveBook(Book book) {
        if(!Library.getBooks().contains(book)){
            System.out.println("This book is not in the database.");
        }
        else if (!book.isAvailable()) {
            System.out.println("Sorry, the book is not available for reservation.");
        } else if (reservedBooks.contains(book)) {
            System.out.println("You have already reserved this book.");
        } else {
            reservedBooks.add(book);
            book.setAvailability(false);
            System.out.println("Book reserved successfully.");
        }
    }

    //TODO: borrowBook(), override toString()
    public void borrowBook(Book book) {
        if (!reservedBooks.contains(book)) {
            System.out.println("Sorry, the book is not available for borrowing. You need to reserve the book first.");
        } else {
            borrowedBooks.add(new BorrowedBook(book, this));
            reservedBooks.remove(book);
            System.out.println("Book borrowed successfully.");
        }
    }

//    public void returnBook(Book book){
//        if(borrowedBooks.contains(book)){
//            borrowedBooks.remove(book);
//            book.setAvailability(true);
//            System.out.println("Book returned to library.");
//        } else {
//            System.out.println("You have not borrowed this book");
//        }
//    }

    public void returnBook(Book book) {
        for (BorrowedBook borrowedBook : borrowedBooks) {
            if (borrowedBook.getBook().equals(book)) {
                borrowedBooks.remove(borrowedBook);
                book.setAvailability(true);
                System.out.println("Book returned successfully.");
                return;
            }
        }
        System.out.println("You have not borrowed this book.");

    }
}
