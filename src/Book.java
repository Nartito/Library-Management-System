public class Book {
    //Krijojme nje Book 'blueprint' me te dhena bazike.
    private String ISBN;
    private String title;
    private String author;
    private String genre;
    private int releaseYear;
    private boolean availability;

    //Kur krijojme nje instance te re te Book, availability(disponueshmeria) do te jete always true.
    public Book(String ISBN, String title, String author, String genre, int releaseYear) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.releaseYear = releaseYear;
        this.availability = true;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public boolean isAvailable(){
        return availability;
    }

    public void setAvailability(boolean availability){
        this.availability = availability;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }
    @Override
    public String toString(){
        return "ISBN=(" + ISBN + ")" + " " + title + " by " + author + " | Genre: " + genre + " | " + releaseYear;
    }
}
