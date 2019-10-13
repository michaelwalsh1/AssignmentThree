
import java.util.ArrayList;

public class Product {

    private String name;
    private String genre;
    private String mediaType;
    private String releaseDate;
    private int metaScore;
    private double price;
    private boolean isAvailable;

    public Product(String name, String genre, String mediaType, String releaseDate, int metaScore, double price, boolean isAvailable) {
        this.name = name;
        this.genre = genre;
        this.mediaType = mediaType;
        this.releaseDate = releaseDate;
        this.metaScore = metaScore;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    /**
     * Sets the name of the product
     *
     * @param String name
     */
    public void setName(String name) {

    }

    /**
     * Returns the name of the product
     *
     * @return String
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the genre of the product
     *
     * @param String genre
     */
    public void setGenre(String genre) {

    }

    /**
     * Returns the genre of the product
     *
     * @return String
     */
    public String getGenre() {
        return genre;
    }

    /**
     * Sets the release date of the product
     *
     * @param String releaseDate
     */
    public void setReleaseDate(String releaseDate) {

    }

    /**
     * Returns the release date of the product
     *
     * @return String
     */
    public String getReleaseDate() {
        return releaseDate;
    }

    /**
     * Sets the meta score of the product
     *
     * @param int metaScore
     */
    public void setMetaScore(int metaScore) {

    }

    /**
     * Returns the meta score of the product
     *
     * @returns int
     */
    public int getMetaScore() {
        return metaScore;
    }

    /**
     * Sets the disc type of the product
     *
     * @param String discType
     */
    public void setMediaType(String mediaType) {

    }

    /**
     * Returns the disc type of the product
     *
     * @return String
     */
    public String getMediaType() {
        return mediaType;
    }

    /**
     * sets the price of the product
     *
     * @param double price
     */
    public void setPrice(double price) {

    }

    /**
     * Returns the price of the product
     *
     * @return double
     */
    public double getPrice() {
        return price;
    }

    /**
     * sets the boolean for isAvailable
     *
     * @param boolean isAvailable
     */
    public void setIsAvailable(boolean isAvailable) {
        isAvailable = true;
    }

    /**
     * Returns the boolean for isAvailable
     *
     * @return boolean, true if isAvailable, false if not
     */
    public boolean getIsAvailable() {
        return isAvailable;
    }

    /**
     * Checks if product is available.
     *
     * @param Product someProduct
     *
     * @return boolean, if someProduct is available
     *
     * @ensure result == (true || false)
     */
    public String toString() {
        System.out.print("---------------------------------------/n"
                + "Name: " + this.name
                + "/nDiscType: " + this.mediaType
                + "/nGenre: " + this.genre
                + "/nRelease Date: " + this.releaseDate
                + "/nmetaScore: " + this.metaScore
                + "/nPrice: " + this.price
                + "/nisAvailable" + this.isAvailable
                + "/n--------------------------------------------");
        return toString();
    }

}
