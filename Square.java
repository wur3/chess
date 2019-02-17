public class Square {

  private boolean occupied = false;
  private Piece piece = null;

  private int x, y;

  public Square(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public void place(Piece p) {
    occupied = true;
    piece = p;
  }

  public void remove() {
    occupied = false;
    piece = null;
  }

  //Accessors
  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }
}
