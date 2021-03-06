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

  public String getType() {
    return String.valueOf(getClass()).substring(6);
  }

  public String toString() {
    return String.format("%s %s @(%d,%d)",color, getType(), x, y);
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
  protected boolean vertical_path(int y, boolean full) {
    int inc = (this.y < y) ? 1 : -1;
    if (full) {
      y += inc;
    }

    for (int i = this.y + inc; i != y; i += inc) {
      //System.out.println("Checking " + x + "," + i);
      if (b.occupied_at(this.x,i)) {  //fails if any square is occupied
        System.out.println("Vertical path blocked at " + x + "," + i);
        return false;
      }
    }
    return true;
  }

  //@return whether the path from (this.x, this.y) to (x, this.y) is completely unoccupied (excluding the start point)
  protected boolean horizontal_path(int x, boolean full) {
    int inc = (this.x < x) ? 1 : -1;
    if (full) {
      x += inc;
    }
    for (int i = this.x + inc; i != x; i += inc) {
      //System.out.println("Checking " + i + "," + y);
      if (b.occupied_at(i,this.y)) {  //fails if any square is occupied
        //System.out.println("Horizontal path blocked at " + i + "," + y);
        return false;
      }
    }
    return true;
  }

  //@return whether the diagonal path from (this.x, this.y) to (x, y) is completely unoccupied (excluding the start point)
  protected boolean diagonal_path(int x, int y, boolean full) {
    int x_inc = (this.x < x) ? 1 : -1;
    int y_inc = (this.y < y) ? 1 : -1;

    if (full) {
      x += x_inc;
      y += y_inc;
    }

    for (int x_i = this.x + x_inc, y_i = this.y + y_inc; x_i != x; x_i += x_inc, y_i += y_inc) {
      //System.out.println("Checking " + x_i + "," + y_i);
      if (b.occupied_at(x_i,y_i)) {  //fails if any square is occupied
        //System.out.println("Diagonal path blocked at " + x_i + "," + y_i);
        return false;
      }
    }
    return true;
  }

  //@return whether (this.x, this.y) to (x, y) is a diagonal path
  protected boolean is_diagonal (int x, int y){
    if( Math.abs(this.x - x) != Math.abs(this.y - y)) { //not a diagonal path
      //System.out.println("This path is not diagonal.");
      return false;
    }
    return true;
  }
}
