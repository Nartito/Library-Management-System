import java.util.ArrayList;

public class Library {
    private static final ArrayList<Book> books = new ArrayList<>();
    private static final ArrayList<User> listofUsers = new ArrayList<>();
    private static final ArrayList<Guest> listofGuests = new ArrayList<>();

    public static ArrayList<Book> getBooks() {
        return books;
    }

    public static ArrayList<User> getListofUsers() {
        return listofUsers;
    }

    public static ArrayList<Guest> getListofGuests() {
        return listofGuests;
    }
}
