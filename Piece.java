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
    return String.format("%s %s @(%d,%d)",color, String.valueOf(getClass()).substring(6), x, y);
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

  //@return whether the path from (this.x, this.y) to (this.x, y) is completely unoccupied (excluding the start point)
  protected boolean vertical_path(int y) {
    int inc = (this.y < y) ? 1 : -1;
    for (int i = this.y + inc; i != y; i += inc) {
      if (b.occupied_at(this.x,i)) {  //fails if any square is occupied
        System.out.println("Path blocked");
        return false;
      }
    }
    return true;
  }

  //@return whether the path from (this.x, this.y) to (x, this.y) is completely unoccupied (excluding the start point)
  protected boolean horizontal_path(int x) {
    int inc = (this.x < x) ? 1 : -1;
    for (int i = this.x + inc; i != x; i += inc) {
      if (b.occupied_at(i,this.y)) {  //fails if any square is occupied
        System.out.println("Path blocked");
        return false;
      }
    }
    return true;
  }

  //@return whether the diagonal path from (this.x, this.y) to (x, y) is completely unoccupied (excluding the start point)
  protected boolean diagonal_path(int x, int y) {
    int x_inc = (this.x < x) ? 1 : -1;
    int y_inc = (this.y < y) ? 1 : -1;

    for (int x_i = this.x + x_inc, y_i = this.y + y_inc; x_i <= x; x_i += x_inc, y_i += y_inc) {
      if (b.occupied_at(x_i,y_i)) {  //fails if any square is occupied
        //System.out.println("Diagonal path blocked");
        return false;
      }
    }
    return true;
  }

  //@return whether (this.x, this.y) to (x, y) is a diagonal path
  protected boolean is_diagonal (int x, int y){
    if( Math.abs(this.x - x) != Math.abs(this.y - y)) { //not a diagonal path
      System.out.println("This path is not diagonal.");
      return false;
    }
    return true;
  }
}
