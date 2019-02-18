public abstract class Piece {
  //instance variables
  protected int x;
  protected int y;
  protected String color;
  protected boolean moved = false;

  //constructor
  public Piece(int x, int y, String color) {
    this.x = x;
    this.y = y;
    this.color = color;
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

  public String getColor() {
    return color;
  }

  public String toString() {
    return String.format("%s(%d,%d)",getClass(),x,y);
  }

}
