import javax.swing.JFrame;

public class Main {

  public static final int X_DIMENSION = 1000;
  public static final int Y_DIMENSION = 1000;

  public static void main(String[] args) {
    Board board = new Board();

    JFrame window = new JFrame("Chess Time");
    window.add(new ChessPanel(board));
    window.pack();
    window.setVisible(true);
    board.print_pieces();

  }
}
