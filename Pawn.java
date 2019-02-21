public class Pawn extends Piece{

  private boolean justDoubleMoved = false;

  public Pawn(Board b, int x, int y, String color) {
    super(b, x, y, color);
  }

  public void capture(int x, int y) {
    if (vertical_path(this.x, this.y, y, b)) {
      moved = true;
      justDoubleMoved = false;
    }
  }

  public void en_passant(int x, int y) {
    //check if positions next to self are from pawns that doublemoved

    moved = true;
    justDoubleMoved = false;
  }

  @Override
  public void move(int x, int y) {
    //if pawn doesn't stay in the same column
    if (x != this.x) {
      System.out.println("Pawns can't move like that on x-axis!");
      System.out.println(String.format("(%d,%d) to (%d,%d)",this.x,this.y,x,y));
    }
    //if pawn moves up by 1 or 2
    else if ((y == this.y + 1) || (!moved && y == this.y + 2)) {
      //if new position isn't occupied
      if (vertical_path(this.x, this.y, y, b)) {
        justDoubleMoved = (y == this.y + 1) ? false : true;

      atomic_move(x,y);
      }
    } else {
      System.out.println("Pawns can't move like that on y-axis!");
      System.out.println(String.format("(%d,%d) to (%d,%d)",this.x,this.y,x,y));
    }
  }

  public boolean getJustDoubleMoved() {
    return justDoubleMoved;
  }

}
