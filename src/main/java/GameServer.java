public class GameServer {

    private Player playerOne;
    private Player playerTwo;

    public Game newGame() {
        return new Game(playerOne, playerTwo);
    }

    public void createPlayerOne(String name, char mark) {
        playerOne = new Player(name, mark);
    }

    public void createPlayerTwo(String name, char mark) {
        playerTwo = new Player(name, mark);
    }
}
