public class Main {
    public static void main(String[] args) {
        //Inicializohet libraria
        Library library = new Library();
        //Krijojme instance te Book, Users
        Book book1 = new Book("1490309780", "The Divine Comedy", "Dante Alighieri", "Epic", 1321);
        Book book2 = new Book("UniqueISBN1", "Title1", "SameAuthor", "SameGenre", 2022);
        Book book3 = new Book("UniqueISBN2", "SameTitle", "SameAuthor", "Genre4", 2021);
        Book book4 = new Book("UniqueISBN3", "SameTitle", "Author4", "SameGenre", 2020);
        Guest guest1 = new Guest("Guest1 Filan Fisteku", "202151626", "password123", User.Role.GUEST);
        Admin admin1 = new Admin("Admin Nart Shufta", "120101", "abcdefg", User.Role.ADMIN);
        admin1.addBook(book1);
        admin1.addBook(book2);
        admin1.addBook(book3);
        admin1.addBook(book4);

        guest1.reserveBook(book1);
        guest1.borrowBook(book1);
        guest1.returnBook(book1);

        admin1.getAllUsers();
        admin1.getAllGuests();

        admin1.getBorrowedBooks();

    }
}