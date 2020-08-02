package Inheritance;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ali Eren and Yusuf
 */
public class Figure extends Collectibles implements License {

    private String series;
    private String size;
    private int limit;

    public Figure() {
    }

    public Figure(String series, String size, int limit, String title, double price, String publisher, String condition, int year, double worth) {
        super(title, price, publisher, condition, year, worth);
        this.series = series;
        this.size = size;
        this.limit = limit;
    }

    @Override
    public String toString() {
        return "Figure " + super.toString() + "\nSeries =  " + series + "\nSize =  " + size + "\nLimit =  " + limit + "\n\n" + licenseCertificate();
    }

    //Woth Calculations are not standard for the real world.
    @Override
    public double worthCalculator() {

        double worth = 0.0;
        if (size.equalsIgnoreCase("Premium")) {
            worth += 0.025;
        }

        if (series.equalsIgnoreCase("Kotobukiya")) {
            worth += 0.025;
        }

        if (limit <= 500) {
            for (int i = 1; i < 500; i++) {
                if (limit == i) {
                    worth += (500 - i) * 0.8;
                }
            }
        }

        return price + (price * (2020 - this.year) * worth);
    }

    public String licenseCertificate() {
        return "Your " + title + " Figure is licensed by " + publisher;
    }

}
