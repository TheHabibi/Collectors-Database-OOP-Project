package Inheritance;

/**
 *
 * @author Ali Eren and Yusuf
 */
public class ComicBook extends Media implements License {

    private String author;
    private String illustrator;
    private int issue;
    private Boolean isSigned;
    private Cover cover = new Cover();

    public ComicBook() {

    }

    public ComicBook(String author, String illustrator, int issue, Boolean isSigned, String genre, String title, double price, String publisher, String condition, int year, double worth, Cover cover) {
        super(genre, title, price, publisher, condition, year, worth);
        this.author = author;
        this.illustrator = illustrator;
        this.issue = issue;
        this.isSigned = isSigned;
        this.cover = cover;

    }

    @Override
    public String toString() {
        return "ComicBook " + super.toString() + "\nAuthor =  " + author + "\nIllustrator =  " + illustrator + "\nIssue =  " + issue + "\nIsSigned =  " + isSigned + "\n" + licenseCertificate();
    }

    //Woth Calculations are not standard for the real world.
    @Override
    public double worthCalculator() {

        double worth = 0.0;

        if (this.issue == 1) {
            worth += 0.5;
        } else {
            for (int i = 2; i < 100; i++) {
                if (this.issue == i) {
                    if (this.issue <= 50) {
                        worth += (50 - i) / 100;
                    } else {
                        worth -= i / 100;
                    }
                }
            }
        }

        if (this.isSigned) {
            worth += 2.1;
        }

        if (this.cover.isVariant()) {
            worth += 1.3;
        }

        return price + (price * (2020 - this.year) * worth);

    }

    @Override
    public String licenseCertificate() {

        if (isSigned) {
            return "\nThis comic is signed by " + author + " and licensed by " + publisher + " ©\n";
        } else {
            return "\nThis comic is not licensed\n";
        }
    }

}
