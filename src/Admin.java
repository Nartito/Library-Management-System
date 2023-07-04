import java.util.ArrayList;

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
}
