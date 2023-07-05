import java.util.Comparator;

public class Admin extends User{
    public Admin(String username, String userID, String password, Role userRole) {
        super(username, userID, password, userRole);
    }


    //Metoda per adminin te shoh te gjitha librat e huazuara nga te gjithe Guests
    public void getBorrowedBooks(){
        for (Guest guest: Library.getListofGuests()) {
            for (BorrowedBook borrowedbook: guest.getBorrowedBooks()) {
                System.out.println(borrowedbook);
            }
        }
    }

    //Metoda per printimin e nje liste te te gjithe Users
    public void getAllUsers(){
        for (User user: Library.getListofUsers()) {
            System.out.println(user);
        }
    }

    //Metoda per printimin e nje liste te te gjithe Guests
    public void getAllGuests(){
        for (Guest guest: Library.getListofGuests()){
            System.out.println(guest);
        }
    }

    //Metoda per te shtuar nje liber ne librari. Nese nje liber ndodhet paraprakisht ne liste, nuk shtohet duplicate.
    public void addBook(Book book){
        if (Library.getBooks().contains(book)){
            System.out.println("Book has already been added to the library!");
        } else {
            Library.getBooks().add(book);
            //Sahere qe shtohet nje liber ne Librari, ArrayLista sortohet prej titujve.
            Library.getBooks().sort(Comparator.comparing(Book::getTitle));
            System.out.println("Book has been added to the library successfully.");
        }
    }

    //Metoda per te hequr nje liber nga libraria. Nese nje liber nuk ndodhet ne liste, shfaqet mesazhi se nuk eksizton.
    public void removeBook(Book book){
        if(Library.getBooks().contains(book)){
            Library.getBooks().remove(book);
            System.out.println("Book has been removed from the library successfully.");
        } else {
            System.out.println("Book doesn't exist in the library");
        }
    }

    //Metode per te hequr TE GJITHA librat
    public void removeAllBooks(){
        Library.getBooks().clear();
        System.out.println("All books have been removed from the library.");
    }
}
