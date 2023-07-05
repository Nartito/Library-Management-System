public class Main {
    public static void main(String[] args) {
        //Inicializohet libraria
        Library library = new Library();
        //Krijojme nje instance te Book dhe User
        Book book1 = new Book("1490309780", "The Divine Comedy", "Dante Alighieri", "Epic", 1321);
        Book book2 = new Book("UniqueISBN1", "Title1", "SameAuthor", "SameGenre", 2022);
        Book book3 = new Book("UniqueISBN2", "SameTitle", "SameAuthor", "Genre4", 2021);
        Book book4 = new Book("UniqueISBN3", "SameTitle", "Author4", "SameGenre", 2020);
        Guest user1 = new Guest("Guest1 Filan Fisteku", "202151626", "password123", User.Role.GUEST);
        Admin admin1 = new Admin("Admin Nart Shufta", "120101", "abcdefg", User.Role.ADMIN);
        //Provojme metodat e ndryshme
        //Shtimi i librave
        admin1.addBook(book1);
        admin1.addBook(book2);
        admin1.addBook(book3);
        admin1.addBook(book4);
        //Shfaqja e te gjitha librave nga databaza
//   library.getAllBooks();
//
//        //Heqja e librave
//        library.removeBook(book1);
//
//        System.out.println("------------");
//
//        //Rezervimi i librit nga useri, rezervimi i librit per se dyti here, rezervimi i nje libri qe nuk eshte ne liste
//        user1.reserveBook(book2);
//        user1.reserveBook(book2);
//        user1.reserveBook(book1);
//
//        System.out.println("-------------");
//
//        //Kerkimi i librave me ane te kritereve te ndryshme
//        System.out.println("\nAll books with same title:");
//        library.searchBookByTitle("SAMETITLE");
//        System.out.println("\nAll books with same author:");
//        library.searchBookByAuthor("sameauthor");
//        System.out.println("\nAll books with same genre:");
//        library.searchBookByGenre("SaMeGeNrE");
//        System.out.println("\nISBN search:");
//        library.searchBookByISBN("UniqueISBN1");
//
//        //Fshirja e te gjitha librave nga databaza.
//        System.out.println("----------------------");
//        library.removeAllBooks();

        user1.reserveBook(book1);
        user1.borrowBook(book1);
        user1.returnBook(book1);

        admin1.getAllUsers();
        admin1.getAllGuests();

        admin1.getBorrowedBooks();

    }
}