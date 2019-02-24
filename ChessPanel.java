import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Color;

public class ChessPanel extends JPanel{
  public ChessPanel() {
    setPreferredSize(new Dimension(500,500));
  }

  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.setColor(Color.GREEN);
    g.fillRect(0,0, 500, 500);
  }
}
