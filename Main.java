public class Main {

  public static void main(String[] args) {
    Board board = new Board();
    board.print_xy();
    Pawn p1 = new Pawn(1,2,"black");
    board.place(p1,1,2);
    board.place(p1,1,2);
    System.out.println(board.piece_at(1,2));




  }
}
