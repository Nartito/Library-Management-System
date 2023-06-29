//TODO: Complete BorrowedBook class
public class BorrowedBook {
    private Book book;
    //TODO: Ndrrohet me vone te RegularUser
    private User user;
    //TODO: Shto nje afat kohor per t'u kthyer libri.


    public BorrowedBook(Book book, User user) {
        this.book = book;
        this.user = user;
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

    public void setUser(User user) {
        this.user = user;
    }

    
}
