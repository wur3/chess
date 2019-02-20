public class Rook extends Piece{

  public Rook(Board b, int x, int y, String color) {
    super(b, x, y, color);
  }



  @Override
  public void move(int x, int y) {
    if (this.x == x) {
      this.y = y;
    }
    else if (this.y == y) {
      this.x = x;
    }
    return;
  }


}
