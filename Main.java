public class Main {

  public static void main(String[] args) {
    Board board = new Board();
    board.print_xy();
    Pawn p1 = new Pawn(board,1,2,"black");
    //System.out.println(board.piece_at(1,2));
    Pawn p2 = new Pawn(board, 1,3,"black");
    



  }
}
