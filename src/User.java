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

    @Override
    public String toString(){
        return userID + " | " + username;
    }

}
