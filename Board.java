public class Board {

  public static final int BOARD_WIDTH = 8;
  public static final int BOARD_HEIGHT = 8;

  private Square[][] board;
  Piece white_pieces[] = new Piece[16];
  Piece black_pieces[] = new Piece[16];


  public Board() {
    //create and populate 2D array of Squares
    board = new Square[BOARD_HEIGHT][BOARD_HEIGHT];
    for (int i = 0; i < BOARD_HEIGHT; i++) {
      for (int j = 0; j < BOARD_WIDTH; j++) {
        board[i][j] = new Square(j, BOARD_HEIGHT-1-i);
      }
    }
    populate();
  }

  public void populate() {
    for (int i = 0; i < Board.BOARD_WIDTH; i++) {
      white_pieces[i] = new Pawn(this, i, 1, "white");
      black_pieces[i] = new Pawn(this, i, 6, "black");
    }
    white_pieces[Board.BOARD_WIDTH] = new Rook(this, 0, 0, "white");
    black_pieces[Board.BOARD_WIDTH] = new Rook(this, 0, 7, "black");
    white_pieces[1 + Board.BOARD_WIDTH] = new Knight(this, 1, 0, "white");
    black_pieces[1 + Board.BOARD_WIDTH] = new Knight(this, 1, 7, "black");
    white_pieces[2 + Board.BOARD_WIDTH] = new Bishop(this, 2, 0, "white");
    black_pieces[2 + Board.BOARD_WIDTH] = new Bishop(this, 2, 7, "black");
    white_pieces[3 + Board.BOARD_WIDTH] = new King(this, 3, 0, "white");
    black_pieces[3 + Board.BOARD_WIDTH] = new King(this, 3, 7, "black");
    white_pieces[4 + Board.BOARD_WIDTH] = new Queen(this, 4, 0, "white");
    black_pieces[4 + Board.BOARD_WIDTH] = new Queen(this, 4, 7, "black");
    white_pieces[5 + Board.BOARD_WIDTH] = new Bishop(this, 5, 0, "white");
    black_pieces[5 + Board.BOARD_WIDTH] = new Bishop(this, 5, 7, "black");
    white_pieces[6 + Board.BOARD_WIDTH] = new Knight(this, 6, 0, "white");
    black_pieces[6 + Board.BOARD_WIDTH] = new Knight(this, 6, 7, "black");
    white_pieces[7 + Board.BOARD_WIDTH] = new Rook(this, 7, 0, "white");
    black_pieces[7 + Board.BOARD_WIDTH] = new Rook(this, 7, 7, "black");
  }

  public void place(Piece p, int x, int y) {
    board[BOARD_HEIGHT-1-y][x].place(p);
  }

  public void clear(int x, int y) {
    board[BOARD_HEIGHT-1-y][x].remove();
  }

  public Piece piece_at(int x, int y) {
    return board[BOARD_HEIGHT-1-y][x].getPiece();
  }

  public boolean occupied_at(int x, int y) {
    return board[BOARD_HEIGHT-1-y][x].getOccupied();
  }

  public void print_xy() {
    for (int i = 0; i < BOARD_HEIGHT; i++) {
      for (int j = 0; j < BOARD_WIDTH; j++) {
        System.out.print("[" + board[i][j].getX() + "," + board[i][j].getY() +"]   ");
      }
      System.out.println();
    }
  }

  public void print_pieces() {
    for (int i = 0; i < BOARD_HEIGHT; i++) {
      for (int j = 0; j < BOARD_WIDTH; j++) {
        if (occupied_at(board[i][j].getX(), board[i][j].getY())) {
          System.out.print(String.valueOf(piece_at(board[i][j].getX(), board[i][j].getY()).getClass()).charAt(6));
        } else {
          System.out.print('_');
        }
      }
      System.out.println();
    }
  }

}
