package Inheritance;

/**
 *
 * @author Ali Eren and Yusuf
 */
public class Cover {

    private String artist;
    private boolean variant;
    private int coverLimit;

    public Cover() {
    }

    public Cover(String artist, boolean variant, int coverLimit) {
        this.artist = artist;
        this.variant = variant;
        this.coverLimit = coverLimit;
    }

    public boolean isVariant() {
        return variant;
    }

    public int getCoverLimit() {
        return coverLimit;
    }

    @Override
    public String toString() {
        return "\nArtist =  " + artist + "\nVariant =  " + variant + "\nCover Limit =  " + coverLimit;
    }

}
