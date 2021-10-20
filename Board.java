/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess.board;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class Board extends Canvas {
    
    private final int boardSize;
    
    public Board(int boardSize) {
        super();
        this.boardSize = boardSize;
    }
    
    @Override
    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, boardSize, boardSize);
        /* for (Piece piece : pieces) {
            piece.render(g);
        }

*/
    }
    
}
