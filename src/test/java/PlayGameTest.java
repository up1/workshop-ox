import static org.junit.Assert.*;

import org.junit.Test;

public class PlayGameTest {
	
	@Test
	public void winner() {
		GameServer gameServer = new GameServer();
		gameServer.createPlayerOne("จิว", 'O');
		gameServer.createPlayerTwo("เต้", 'X');
		Game game = gameServer.newGame();
		
		game.play(1);
		game.play(3);
		game.play(4);
		game.play(5);
		game.play(7);

		// Validate After
		assertTrue(game.checkWinner());
	}
	
	@Test
	public void play_with_เต้จิว() {
		GameServer gameServer = new GameServer();
		gameServer.createPlayerOne("จิว", 'O');
		gameServer.createPlayerTwo("เต้", 'X');
		Game game = gameServer.newGame();
		
		game.play(1);
		game.play(2);
		game.play(3);
		game.play(4);

		// Validate After
		assertEquals('X', game.getBoard().get(4-1));
		assertEquals("จิว", game.getCurrentPlayer().getName());
	}
	
	@Test
	public void play_with_เต้() {
		GameServer gameServer = new GameServer();
		gameServer.createPlayerOne("จิว", 'O');
		gameServer.createPlayerTwo("เต้", 'X');
		Game game = gameServer.newGame();
		
		game.play(1);
		game.play(2);

		// Validate After
		assertEquals('X', game.getBoard().get(2-1));
		assertEquals("จิว", game.getCurrentPlayer().getName());
	}
	
	@Test
	public void play_with_จิว() {
		GameServer gameServer = new GameServer();
		gameServer.createPlayerOne("จิว", 'O');
		gameServer.createPlayerTwo("เต้", 'X');
		Game game = gameServer.newGame();
		// Before
		assertEquals("จิว", game.getCurrentPlayer().getName());
		 
		game.play(1);

		// Validate After
		assertEquals('O', game.getBoard().get(1-1));
		assertEquals("เต้", game.getCurrentPlayer().getName());
	}
	
	@Test
	public void play_with_end_game() {
		GameServer gameServer = new GameServer();
		gameServer.createPlayerOne("จิว", 'O');
		gameServer.createPlayerTwo("เต้", 'X');
		Game game = gameServer.newGame();
		game.play(1);game.play(2);
		game.play(3);game.play(4);
		game.play(5);game.play(6);
		game.play(7);game.play(8);
		game.play(9);

		// Validate
		assertTrue(game.checkEndGame());
	}

	@Test
	public void playOne_ลงที่ตำแหน่ง_5_game_ยังไม่จบ() {
		GameServer gameServer = new GameServer();
		gameServer.createPlayerOne("จิว", 'O');
		gameServer.createPlayerTwo("เต้", 'X');
		Game game = gameServer.newGame();
		game.play(5);

		// Validate
		assertFalse(game.checkEndGame());
	}

}
