import java.util.ArrayList;

public class Player {

    private String name;
    private Piece piece;

    private Board board;
    private ArrayList<Die> dice;

    public Player(String name, Piece piece, Board board, ArrayList<Die> dice) {
        this.name = name;
        this.piece = piece;
        this.board = board;
        this.dice = dice;
    }

    public String getName() {
        return name;
    }

    public Piece getPiece() {
        return piece;
    }

    /**
     * Roll dice and move the player to the corresponding location
     */
    public void takeTurn() {
        int fv = 0 ;

        for(Die die : dice){
            die.roll();
            fv += die.getFaceValue();
        }

        Square oldLoc = piece.getLocation();
        Square newLoc = board.getSquare(oldLoc, fv);
        System.out.println("Current player : " +name);
        System.out.println("Square landed : " + newLoc.getName());
        piece.setLocation(newLoc);
    }
}
