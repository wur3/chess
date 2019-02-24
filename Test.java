public class Test {
  public static void main (String[] args) {
    Board board = new Board();
    /**
    //board.print_xy();
    Pawn p1 = new Pawn(board,1,2,"black");
    Pawn p2 = new Pawn(board, 2,3,"white");
    System.out.println(board.piece_at(1,2));
    System.out.println(board.piece_at(2,3));

    p1.capture(2,3);
    System.out.println(board.piece_at(1,2));
    System.out.println(board.piece_at(2,3));


    Rook r1 = new Rook(board,1,2,"black");
    Rook r2 = new Rook(board, 5,2,"white");
    System.out.println(board.piece_at(1,2));
    System.out.println(board.piece_at(5,2));

    r1.move(5,2);
    System.out.println(board.piece_at(1,2));
    System.out.println(board.piece_at(5,2));


    Bishop b1 = new Bishop(board,1,1,"white");
    Bishop b2 = new Bishop(board,2,2,"black");
    b1.move(2,2);
    System.out.println(board.piece_at(1,1));
    System.out.println(board.piece_at(2,2));

    King k1 = new King(board,1,1,"white");
    Knight k2 = new Knight(board,0,2,"black");
    System.out.println(board.piece_at(1,1));
    System.out.println(board.piece_at(0,2));
    k1.move(0,2);
    System.out.println(board.piece_at(1,1));
    System.out.println(board.piece_at(0,2));
    **/
    Queen q1 = new Queen(board,4,4,"white");
    Bishop b1 = new Bishop(board,7,7,"white");
    System.out.println(board.piece_at(4,4));
    System.out.println(board.piece_at(7,7));
    q1.move(7,7);

    System.out.println(board.piece_at(4,4));
    System.out.println(board.piece_at(7,7));
  }
}
