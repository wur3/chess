import java.util.Arrays;

public class Knight extends Piece{
  private int[] diff = {2, 1, -1, -2};
  public Knight(Board b, int x, int y, String color) {
    super(b, x, y, color);
  }

  @Override
  public void move(int x, int y) {
    boolean x_in_range = false;
    boolean y_in_range = false;

    //check that both the x and y differences are 2,1,-1,or -2 but x and y also cannot be the same value
    for (int i : diff) {
      if (i == this.x-x) {
        x_in_range = true;
      }
      else if (i == this.y-y) {
        y_in_range = true;
      }
    }
    if (!(x_in_range && y_in_range)) {
      System.out.println("Knights cannot move like that.");
      System.out.println(String.format("(%d,%d) to (%d,%d)",this.x,this.y,x,y));
    }
    //valid destination
    else {
      //empty space
      if (!b.occupied_at(x,y)) {
        atomic_move(x, y);
      }
      //enemy space
      else if (b.piece_at(x,y).getColor() != color) {
        b.clear(x, y);
        atomic_move(x, y);
      }
    }
    return;
  }

}
