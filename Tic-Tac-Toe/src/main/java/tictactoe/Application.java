
package tictactoe;

import java.awt.EventQueue;
import javax.swing.JFrame;

import tictactoe.gui.Board;

public class Application extends JFrame {

  public Application() {
    initUI();
  }

  private void initUI() {
    add(Board.getInstance());
    
    pack();

    setTitle("Tic Tac Toe");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
  }

  public static void main(String[] args) {

    EventQueue.invokeLater(() -> {
      Application ex = new Application();
      ex.setVisible(true);
    });
  }
}
