package Inheritance;

/**
 *
 * @author Ali Eren and Yusuf
 */
public abstract class Collectibles {

    protected String title;
    protected double price;
    protected String publisher;
    protected String condition;
    protected int year;
    protected double worth;
    protected static int totalCount;

    public Collectibles() {

    }

    public Collectibles(String title, double price, String publisher, String condition, int year, double worth) {
        this.title = title;
        this.price = price;
        this.publisher = publisher;
        this.condition = condition;
        this.year = year;
        this.worth = worth;

    }

    public String getTitle() {
        return title;
    }

    public void setWorth(double worth) {
        this.worth = worth;
    }

    public double getWorth() {
        return worth;
    }

    public static int getTotalCount() {
        return totalCount;
    }

    @Override
    public String toString() {
        return "\n" + "Title =  " + title + "\nPrice =  " + price + " $" + "\nPublisher =  " + publisher + "\nCondition =  " + condition + "\nYear  (" + year + ")";
    }

    public abstract double worthCalculator();

    public static void itemCount() {
        totalCount++;
    }

}
