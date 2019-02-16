public class Rook extends Piece{

  public Rook(int x, int y) {
    super(x,y);
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
