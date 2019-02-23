public class Rook extends Piece{

  public Rook(Board b, int x, int y, String color) {
    super(b, x, y, color);
  }

  @Override
  public void move(int x, int y) {
    //horizontal moving
    if ((this.x != x) && (this.y == y)) {
      //targetted space is empty
      if (horizontal_path(x, true)) {
        atomic_move(x, y);
        return;
      }
      //space is occupied by enemy
      else if (horizontal_path(x, false) && b.piece_at(x,y).getColor() != color) {
        b.clear(x, y);
        atomic_move(x, y);
        return;
      }
    }
    //vertical moving
    else if ((this.x == x) && (this.y != y)) {
      //targetted space is empty
      if (vertical_path(y, true)) {
        atomic_move(x, y);
        return;
      }
      //space is occupied by enemy
      else if (vertical_path(x, false) && b.piece_at(x,y).getColor() != color) {
        b.clear(x, y);
        atomic_move(x, y);
        return;
      }
    }
    else {
      System.out.println("Rook cannot move like that!");
    }
    return;
  }

}
