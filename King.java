public class King extends Piece{

  public King(Board b, int x, int y, String color) {
    super(b, x, y, color);
  }

  @Override
  public void move(int x, int y) {
    if ((Math.abs(this.x-x) > 1) && (Math.abs(this.y-y) > 1)) {
      System.out.println("King cannot move like that!");
      System.out.println(String.format("(%d,%d) to (%d,%d)",this.x,this.y,x,y));
    }
    //diagonal movement
    else if (is_diagonal(x,y)) {
      if (diagonal_path(x, y, true)) {
        atomic_move(x, y);
      }
      //space is occupied by enemy
      else if (diagonal_path(x, y, false) && b.piece_at(x,y).getColor() != color) {
        b.clear(x, y);
        atomic_move(x, y);
      }
    }
    //horizontal moving
    else if (this.x != x) {
      //targetted space is empty
      if (horizontal_path(x, true)) {
        atomic_move(x, y);
      }
      //space is occupied by enemy
      else if (horizontal_path(x, false) && b.piece_at(x,y).getColor() != color) {
        b.clear(x, y);
        atomic_move(x, y);
      }
    }
    //vertical moving
    else if (this.y != y) {
      //targetted space is empty
      if (vertical_path(y, true)) {
        atomic_move(x, y);
      }
      //space is occupied by enemy
      else if (vertical_path(y, false) && b.piece_at(x,y).getColor() != color) {
        b.clear(x, y);
        atomic_move(x, y);
      }
    }
    return;
  }

}
