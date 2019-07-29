public class Game {
    private final Player playerOne;
    private final Player playerTwo;
    private final Board board;

    public Game(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        this.board = new Board();
    }

    public Player getPlayerOne() {
        return this.playerOne;
    }

    public Player getPlayerTwo() {
        return this.playerTwo;
    }

    public Board getBoard() {
        return this.board;
    }

    public boolean checkEmptyBoard() {
        for (char e: board.getElements()) {
            if(e != ' ') {
                return false;
            }
        }
        return true;
    }
}
