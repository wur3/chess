public class Pawn extends Piece{

  private Boolean doubleMoved = False;

  public Pawn(int x, int y) {
    super(x,y);
  }

  public void capture(int x, int y) {
    ;
  }

  public void en_passant(int x, int y) {
    ;
  }

  @Override
  public void move(int x, int y) {
    if (x == this.x && y = this.y + 1) {
      this.y = y;
    }
    return;
  }


}
