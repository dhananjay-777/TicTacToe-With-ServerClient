
package tictactoe;

import java.awt.Image;
import tictactoe.tools.ImageProvider;

public class GameFiles {
  public static final Image STARTSCREEN = new ImageProvider("images/startscreen.jpeg").get().
    getScaledInstance(500, 500, Image.SCALE_SMOOTH); 
}
