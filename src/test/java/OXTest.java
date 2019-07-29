import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class OXTest {

    @Test public void
    เริ่มต้นเล่นเกมส์_ผู้เล่นคนแรกชื่อว่าจิว() {
        GameServer gameServer = new GameServer();
        gameServer.createPlayerOne("จิว", 'O');
        gameServer.createPlayerTwo("เต้", 'X');
        Game game = gameServer.newGame();

        // Validate
        Player playerOne = game.getPlayerOne();
        assertEquals("จิว", playerOne.getName());
        assertEquals('O', playerOne.getMark());
    }

    @Test public void
    เริ่มต้นเล่นเกมส์_ผู้เล่นคนที่สองชื่อว่าเต้() {
        GameServer gameServer = new GameServer();
        gameServer.createPlayerOne("จิว", 'O');
        gameServer.createPlayerTwo("เต้", 'X');
        Game game = gameServer.newGame();

        // Validate
        Player playerTwo = game.getPlayerTwo();
        assertEquals("เต้", playerTwo.getName());
        assertEquals('X', playerTwo.getMark());
    }

    @Test public void
    เริ่มต้นเล่นเกมส์_สร้าง_board_ขนาดเป็น_9() {
        GameServer gameServer = new GameServer();
        gameServer.createPlayerOne("จิว", 'O');
        gameServer.createPlayerTwo("เต้", 'X');
        Game game = gameServer.newGame();

        // Validate
        Board board = game.getBoard();
        assertEquals(9, board.size());
        assertTrue("ฺBoard จะต้องมีค่าว่างทั้งหมดนะ", game.checkEmptyBoard());
    }

}
