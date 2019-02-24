import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Color;

public class ChessPanel extends JPanel{
  public ChessPanel() {
    setPreferredSize(new Dimension(Main.X_DIMENSION,Main.Y_DIMENSION));

  /**
      Piece white_pieces[] = new Piece[16];
      Piece black_pieces[] = new Piece[16];
      for (int i = 0; i < Board.BOARD_WIDTH; i++) {
        white_pieces[i] = new Pawn(board, i, 1, "white");
        black_pieces[i] = new Pawn(board, i, 6, "black");
      }
      for (int i = 0; i < Board.BOARD_WIDTH; i++) {
        switch (i) {
          case 0:
            white_pieces[i + Board.BOARD_WIDTH] = new Rook(board, i, 0, "white");
            black_pieces[i + Board.BOARD_WIDTH] = new Rook(board, i, 7, "black");
            break;
          case 1:
            white_pieces[i + Board.BOARD_WIDTH] = new Knight(board, i, 0, "white");
            black_pieces[i + Board.BOARD_WIDTH] = new Knight(board, i, 7, "black");
            break;
          case 2:
            white_pieces[i + Board.BOARD_WIDTH] = new Bishop(board, i, 0, "white");
            black_pieces[i + Board.BOARD_WIDTH] = new Bishop(board, i, 7, "black");
            break;
          case 3:
            white_pieces[i + Board.BOARD_WIDTH] = new King(board, i, 0, "white");
            black_pieces[i + Board.BOARD_WIDTH] = new King(board, i, 7, "black");
            break;
          case 4:
            white_pieces[i + Board.BOARD_WIDTH] = new Queen(board, i, 0, "white");
            black_pieces[i + Board.BOARD_WIDTH] = new Queen(board, i, 7, "black");
            break;
          case 5:
            white_pieces[i + Board.BOARD_WIDTH] = new Bishop(board, i, 0, "white");
            black_pieces[i + Board.BOARD_WIDTH] = new Bishop(board, i, 7, "black");
            break;
          case 6:
            white_pieces[i + Board.BOARD_WIDTH] = new Knight(board, i, 0, "white");
            black_pieces[i + Board.BOARD_WIDTH] = new Knight(board, i, 7, "black");
            break;
          case 7:
            white_pieces[i + Board.BOARD_WIDTH] = new Rook(board, i, 0, "white");
            black_pieces[i + Board.BOARD_WIDTH] = new Rook(board, i, 7, "black");
            break;
        }
      }

      for (int i = 0; i < 16; i++) {
        System.out.println(white_pieces[i].toString());
      }
      for (int i = 0; i < 16; i++) {
        System.out.println(black_pieces[i].toString());
      }
      **/
  }

  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    for (int i = 0; i < 8; i++) {

      for (int j = 0; j < 8; j++) {
        if ((i+j)%2 == 1) {
          g.setColor(Color.BLACK);
        }
        else {
          g.setColor(Color.WHITE);
        }

        g.fillRect(j*Main.X_DIMENSION/8,(8-1-i)*Main.Y_DIMENSION/8, Main.X_DIMENSION/8, Main.Y_DIMENSION/8);
      }
    }

  }
}
