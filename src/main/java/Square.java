/**
 * Class that represents a square of a monopoly board
 */
public abstract class Square {

    private String name;

    /**
     * Square constructor
     *
     * @param name String : name of the square
     */
    public Square(String name) {
        this.name = name;
    }

    /**
     * Returns the name of the square
     *
     * @return String : name of the square
     */
    public String getName() {
        return name;
    }

    /**
     * Action taht will be exectued on the player when he lands on this square
     *
     * @param p Player : player
     */
    abstract public void landedOn(Player p);

}
