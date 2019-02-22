public class Main {

  public static void main(String[] args) {
    Board board = new Board();
    //board.print_xy();

    /**
    Pawn p1 = new Pawn(board,1,2,"black");
    Pawn p2 = new Pawn(board, 2,3,"white");
    System.out.println(board.piece_at(1,2));
    System.out.println(board.piece_at(2,3));

    p1.capture(2,3);
    System.out.println(board.piece_at(1,2));
    System.out.println(board.piece_at(2,3));
    **/
    Piece white_pieces[] = new Piece[16];
    for (int i = 0; i < Board.BOARD_WIDTH; i++) {
      white_pieces[i] = new Pawn(board, i, 1, "white");
      System.out.println(white_pieces[i].toString());
    }

    Piece black_pieces[] = new Piece[16];
    for (int i = 0; i < Board.BOARD_WIDTH; i++) {
      black_pieces[i] = new Pawn(board, i, 6, "black");
      System.out.println(black_pieces[i].toString());
    }


  }
}
