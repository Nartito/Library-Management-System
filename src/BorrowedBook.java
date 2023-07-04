import java.time.LocalDate;

public class BorrowedBook {
    private Book book;
    private Guest user;
    //TODO: Shto nje afat kohor per t'u kthyer libri.
    LocalDate dateBorrowed;
    LocalDate returnBy;

    //Kur nje Liber huazohet, automatikisht data e huazimit shtohet ne dateBorrowed dhe afati kohor qe te kthehet
    //do te jete dateBorrowed + 7dite.
    public BorrowedBook(Book book, Guest user) {
        this.book = book;
        this.user = user;
        this.dateBorrowed = LocalDate.now();
        this.returnBy = dateBorrowed.plusDays(7);
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public User getUser() {
        return user;
    }

    public void setUser(Guest user) {
        this.user = user;
    }

    public LocalDate getDateBorrowed() {
        return dateBorrowed;
    }

    public LocalDate getReturnBy() {
        return returnBy;
    }

    @Override
    public String toString(){
        return book.getISBN()
                + " borrowed by "
                + user.getUserID()
                + " on "
                + dateBorrowed
                + " - "
                + "Return by: "
                + returnBy;
    }
    
}
