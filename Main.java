public class Main {

  public static void main(String[] args) {
    Board board = new Board();
    board.print_xy();
    Pawn p1 = new Pawn(board,1,2,"black");
    Pawn p2 = new Pawn(board, 2,3,"white");
    System.out.println(board.piece_at(1,2));
    System.out.println(board.piece_at(2,3));

    p1.capture(2,3);
    System.out.println(board.piece_at(1,2));
    System.out.println(board.piece_at(2,3));



  }
}
