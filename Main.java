import javax.swing.JFrame;

public class Main {

  public static final int X_DIMENSION = 1000;
  public static final int Y_DIMENSION = 1000;

  public static void main(String[] args) {
    Board board = new Board();
    JFrame window = new JFrame();
    window.add(new ChessPanel());
    window.pack();
    window.setVisible(true);

  }
}
