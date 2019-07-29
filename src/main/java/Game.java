public class Game {
	private final Player playerOne;
	private final Player playerTwo;
	private final Board board;
	private Player currentPlayer;

	public Game(Player playerOne, Player playerTwo) {
		this.playerOne = playerOne;
		this.playerTwo = playerTwo;
		this.board = new Board();

		currentPlayer = this.playerOne;
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

	public void play(int position) {
		this.board.set(position - 1, currentPlayer.getMark());
		switchPlayer();
	}

	private void switchPlayer() {
		if (currentPlayer.equals(playerOne)) {
			currentPlayer = playerTwo;
		} else {
			currentPlayer = playerOne;
		}
	}

	public Player getCurrentPlayer() {
		return this.currentPlayer;
	}

	public boolean checkEndGame() {
		for (int i = 0; i < this.board.size(); i++) {
			if (this.board.get(i) == ' ') {
				return false;
			}
		}
		return true;
	}

	public boolean checkEmptyBoard() {
		for (char e : board.getElements()) {
			if (e != ' ') {
				return false;
			}
		}
		return true;
	}

	public boolean checkWinner() {
		if (board.get(1 - 1) == board.get(4 - 1)  
			&& board.get(4 - 1) == board.get(7 - 1)) {
			return true;
		}
		return false;
	}

}
