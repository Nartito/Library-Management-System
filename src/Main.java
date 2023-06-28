public class Main {
    public static void main(String[] args) {
        //Inicializohet libraria
        Library library = new Library();
        //Krijojme nje instance te Book dhe User
        Book book1 = new Book("1490309780", "The Divine Comedy", "Dante Alighieri", "Epic", 1321);
        Book book2 = new Book("UniqueISBN1", "Title1", "SameAuthor", "SameGenre", 2022);
        Book book3 = new Book("UniqueISBN2", "SameTitle", "SameAuthor", "Genre4", 2021);
        Book book4 = new Book("UniqueISBN3", "SameTitle", "Author4", "SameGenre", 2020);
        User user1 = new User("Nartito", "202151626", "password123");
        //Provojme metodat e ndryshme
        //Shtimi i librave
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        //Shfaqja e te gjitha librave nga databaza
        library.getAllBooks();

        //Heqja e librave
        library.removeBook(book1);

        System.out.println("------------");

        //Rezervimi i librit nga useri, rezervimi i librit per se dyti here, rezervimi i nje libri qe nuk eshte ne liste
        user1.reserveBook(book2);
        user1.reserveBook(book2);
        user1.reserveBook(book1);

        System.out.println("-------------");

        //Kerkimi i librave me ane te kritereve te ndryshme
        System.out.println("\nAll books with same title:");
        library.searchBookByTitle("SAMETITLE");
        System.out.println("\nAll books with same author:");
        library.searchBookByAuthor("sameauthor");
        System.out.println("\nAll books with same genre:");
        library.searchBookByGenre("SaMeGeNrE");
        System.out.println("\nISBN search:");
        library.searchBookByISBN("UniqueISBN1");

        //Fshirja e te gjitha librave nga databaza.
        System.out.println("----------------------");
        library.removeAllBooks();
    }
}