import Java.lang.Math;

public abstract class Piece {
  //instance variables
  protected Board b;
  protected int x;
  protected int y;
  protected String color;
  protected boolean moved = false;

  //constructor
  public Piece(Board b, int x, int y, String color) {
    this.b = b;
    this.x = x;
    this.y = y;
    this.color = color;

    b.place(this, this.x, this.y);
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

  //helper
  protected void atomic_move(int x, int y) {
    b.clear(this.x, this.y); //move piece off of old position of board
    b.place(this, x, y); //move piece onto new position of board
    //update piece's own position
    this.x = x;
    this.y = y;
    moved = true;
  }

  @return whether the path from (x, y1) to (x, y2) is completely unoccupied (excluding the start point)
  protected boolean vertical_path(int x, int y1, int y2) {
    int inc = (y1 < y2) ? 1 : -1;
    for (int i = y1; i != y2; i += inc) {
      if (b.occupied_at(x,i)) {  //fails if any square is occupied
        System.out.println("Path blocked");
        return false;
      }
    }
    return true;
  }

  @return whether the path from (x1, y) to (x2, y) is completely unoccupied (excluding the start point)
  protected boolean horizontal_path(int x1, int y, int x2) {
    int inc = (x1 < x2) ? 1 : -1;
    for (int i = x1; i != x2; i += inc) {
      if (b.occupied_at(i,y)) {  //fails if any square is occupied
        System.out.println("Path blocked");
        return false;
      }
    }
    return true;
  }

  @return whether the diagonal path from (x1, y1) to (x2, y2) is completely unoccupied (excluding the start point)
  protected Boolean diagonal_path(int x1, int y1, int x2, int y2) {
    int x_inc = (x1 < x2) ? 1 : -1;
    int y_inc = (y1 < y2) ? 1 : -1;

    //MOVE THIS TO BEFORE THE FUNCTION GETS CALLED
    if( Math.abs(x1 - x2) != Math.abs(y1 - y2)) { //not a diagonal path
      System.out.println("This path is not diagonal.");
      return null;
    }

    for (int x_i = x1, y_i = y1; x_i <= x2; x_i += x_inc, y_i += y_inc) {
      if (b.occupied_at(x_i,y_i)) {  //fails if any square is occupied
        System.out.println("Diagonal path blocked");
        return false;
      }
    }
    return true;
  }
}
