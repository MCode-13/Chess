package chess;

import chess.board.Board;
import java.awt.Canvas;
import java.awt.Graphics;
import javax.swing.JFrame;

public class Main extends JFrame {
    
    private final int boardSize = 900;
    private final int WIDTH = boardSize + 350;
    private final int HEIGHT = boardSize + 20;
    private final Board board;
    
    private Main(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(WIDTH, HEIGHT);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
        board = new Board(boardSize);
        this.add(board);
    }

    public static void main(String[] args) {
        Main window = new Main("chess");
    }
}
