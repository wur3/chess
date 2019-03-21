import javax.swing.*;
import java.io.File;
import java.io.IOException;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class ChessPanel extends JPanel{

  private BufferedImage image;
  private Board board;

  public ChessPanel(Board b) {
    board = b;
    setPreferredSize(new Dimension(Main.X_DIMENSION,Main.Y_DIMENSION));

  }

  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    //draw chessboard pattern
    for (int i = 0; i < 8; i++) {
      for (int j = 0; j < 8; j++) {
        if ((i+j)%2 == 1) {
          // g.setColor(Color.BLACK);
          g.setColor(Color.decode("#FFFACD"));
        }
        else {
          // g.setColor(Color.WHITE);
          g.setColor(Color.decode("#593E1A"));
        }

        g.fillRect(i*Main.X_DIMENSION/8, (8-1-j)*Main.Y_DIMENSION/8, Main.X_DIMENSION/8, Main.Y_DIMENSION/8);

        if (board.occupied_at(i, j)) {
          String image_path = "images/" + String.valueOf(board.piece_at(i, j).getType().toLowerCase()
          + board.piece_at(i, j).getColor().charAt(0) + ".gif");
          try {
            image = ImageIO.read(new File(image_path));
          } catch(final IOException e) {
              System.out.println("Cannot find: images/" + image_path);
          }
          g.drawImage(image, i*Main.X_DIMENSION/8, (8-1-j)*Main.Y_DIMENSION/8, Main.X_DIMENSION/8, Main.Y_DIMENSION/8, this);
        }
      }
    }


  }
}
