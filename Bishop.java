public class Bishop extends Piece{

  public Bishop(Board b, int x, int y, String color) {
    super(b, x, y, color);
  }

  @Override
  public void move(int x, int y) {
    if (!is_diagonal(x,y)) {
      System.out.println("Bishops cannot move like that!");
    }
    else {
      if (diagonal_path(x, y, true)) {
        atomic_move(x, y);
      }
      //space is occupied by enemy
      else if (diagonal_path(x, y, false) && b.piece_at(x,y).getColor() != color) {
        b.clear(x, y);
        atomic_move(x, y);
      }
    }
    return;
  }

}
