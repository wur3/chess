public class Square {

  private boolean occupied = false;
  private Piece piece = null;

  private int x, y;

  //constructor
  public Square(int x, int y) {
    this.x = x;
    this.y = y;
  }

  //overloaded constructor
  public Square(int x, int y, Piece p) {
    this.x = x;
    this.y = y;
    place(p);
  }

  public void place(Piece p) {
    if (!occupied) {
      occupied = true;
      piece = p;
    }
    else {
      System.out.println(String.format("(%d, %d) is already occupied!", x, y));
    }
  }

  public void remove() {
    if (occupied) {
      occupied = false;
      piece = null;
    }
    else {
      System.out.println(String.format("(%d, %d) is already empty!", x, y));
    }
  }

  //Accessors
  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  public boolean getOccupied() {
    return occupied;
  }

  public Piece getPiece() {
    return piece;
  }
}
