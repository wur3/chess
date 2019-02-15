public abstract class Piece {
  //instance variables
  private int x;
  private int y;

  //constructor
  public Piece(int x, int y) {
    this.x = x;
    this.y = y;
  }

  //specified by each piece type
  abstract void move(int x, int y);
}
