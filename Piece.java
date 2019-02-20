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
  //1. vertical move
  protected boolean vertical_path(int x1, int y1, int y2, Board b) {
    int high = (y1 >= y2) ? y1 : y2;
    int low = (y1 < y2) ? y1 : y2;
    for (int i = low + 1; i < high; i++) {
      if (b.occupied_at(x1,i)) {  //fails if any square is occupied
        System.out.println("Path blocked");
        return false;
      }
    }
    return true;
  }

  //2. horizontal move
  protected boolean horizontal_path(int x1, int y1, int x2, Board b) {
    int high = (x1 >= x2) ? x1 : x2;
    int low = (x1 < x2) ? x1 : x2;
    for (int i = low + 1; i < high; i++) {
      if (b.occupied_at(i,y1)) {  //fails if any square is occupied
        System.out.println("Path blocked");
        return false;
      }
    }
    return true;
  }
  //3. diagonal move

}
