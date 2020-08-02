package Inheritance;

/**
 *
 * @author Ali Eren and Yusuf
 */
public class Film extends Media {

    private String director;

    private String mediaType;

    private Boolean steelCase;

    public Film() {
    }

    public Film(String director, String mediaType, Boolean steelCase, String genre, String title, double price, String publisher, String condition, int year, double worth) {
        super(genre, title, price, publisher, condition, year, worth);
        this.director = director;
        this.mediaType = mediaType;
        this.steelCase = steelCase;
    }

    //Woth Calculations are not standard for the real world.
    @Override
    public double worthCalculator() {
        double worth = 0;

        if (mediaType.equalsIgnoreCase("bluray") || mediaType.equalsIgnoreCase("4K")) {
            worth += 0.02;

            if (steelCase) {
                worth += 0.03;
            }
        } else {
            worth -= 0.08;
        }

        return price + (price * (2020 - this.year) * worth);
    }

    @Override
    public String toString() {
        return "Film " + super.toString() + "\nDirector =  " + director + "\nMedia Type =  " + mediaType + "\nSteel Case =  " + steelCase + "\n\n";
    }

}
