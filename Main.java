import javax.swing.JFrame;

public class Main {

  public static void main(String[] args) {
    Board board = new Board();
    JFrame window = new JFrame();
    window.add(new ChessPanel());
    window.pack();
    window.setVisible(true);
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
}
