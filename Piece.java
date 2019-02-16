public abstract class Piece {
  //instance variables
  protected int x;
  protected int y;

  //constructor
  public Piece(int x, int y) {
    this.x = x;
    this.y = y;
  }

  //specified by each piece type
  public abstract void move(int x, int y);

  //Accessors
  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }


}
