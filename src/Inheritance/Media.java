package Inheritance;


/**
 *
 * @author Ali Eren and Yusuf
 */
public abstract class Media extends Collectibles {

    private String genre;

    public Media() {
    }

    public Media(String genre, String title, double price, String publisher, String condition, int year, double worth) {
        super(title, price, publisher, condition, year, worth);
        this.genre = genre;
    }

    @Override
    public String toString() {
        return super.toString() + "\nGenre = " + genre;
    }

}
