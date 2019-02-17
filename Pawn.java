public class Pawn extends Piece{

  private boolean doubleMoved = false;

  public Pawn(int x, int y, String color) {
    super(x, y, color);
  }

  public void capture(int x, int y) {
    ;
  }

  public void en_passant(int x, int y) {
    ;
  }

  @Override
  public void move(int x, int y) {
    if (x == this.x && y == this.y + 1) {
      this.y = y;
    }
    return;
  }


}
