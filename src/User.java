import java.util.ArrayList;
public class User {
    public enum Role {GUEST, ADMIN}

    private String userID;
    private String username;
    private String password;
    private Role userRole;

    //Kur krijohet nje User i ri, ne Library class i shtohet instanca e re e User tek ArrayLista listofUsers
    public User(String username, String userID, String password, Role userRole) {
        this.username = username;
        this.userID = userID;
        this.password = password;
        this.userRole = userRole;
        Library.getListofUsers().add(this);
    }


    //Getters dhe Setters
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

    public Role getUserRole() {
        return userRole;
    }

    public void setUserRole(Role userRole) {
        this.userRole = userRole;
    }

    //Metoda per te pare te gjitha librat ne librari. Kjo metode mund te perdoret nga te gjithe Users
    public void getAllBooks(){
        for (Book book: Library.getBooks()) {
            System.out.println(book);
        }
    }

    //Metoda per te kerkuar librin me ane te titullit.
    public void searchBookByTitle(String userTitle){
        for (Book book: Library.getBooks()) {
            if(book.getTitle().equalsIgnoreCase(userTitle)){
                System.out.println(book);
            }
        }
    }

    //Metoda per te kerkuar librin me ane te ISBN
    public void searchBookByISBN(String userISBN){
        for (Book book: Library.getBooks()) {
            if(book.getISBN().equalsIgnoreCase(userISBN)){
                System.out.println(book);
            }
        }
    }

    //Metoda per te kerkuar libra te shkruar nga autori
    public void searchBookByAuthor(String userAuthor){
        for (Book book: Library.getBooks()) {
            if(book.getAuthor().equalsIgnoreCase(userAuthor)){
                System.out.println(book);
            }
        }
    }

    //Metoda per te kerkuar libra prej zhanrave te ndryshem
    public void searchBookByGenre(String userGenre){
        for (Book book: Library.getBooks()) {
            if(book.getGenre().equalsIgnoreCase(userGenre)){
                System.out.println(book);
            }
        }
    }

    @Override
    public String toString(){
        return userID + " | " + username;
    }

}
