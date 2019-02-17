public class Board {

  public static final int BOARD_WIDTH = 8;
  public static final int BOARD_HEIGHT = 8;

  private Square[][] board;

  public Board() {
    //create and populate 2D array of Squares
    board = new Square[BOARD_HEIGHT][BOARD_HEIGHT];
    for (int i = 0; i < BOARD_HEIGHT; i++) {
      for (int j = 0; j < BOARD_WIDTH; j++) {
        board[i][j] = new Square(j, BOARD_HEIGHT-1-i);
      }
    }
  }

  public void print_xy() {
    for (int i = 0; i < BOARD_HEIGHT; i++) {
      for (int j = 0; j < BOARD_WIDTH; j++) {
        System.out.print("[" + board[i][j].getX() + "," + board[i][j].getY() +"]   ");
      }
      System.out.println();
    }
  }

}
