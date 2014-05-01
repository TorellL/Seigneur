import java.awt.*;
import javax.swing.*;

public class Direkt3 extends JApplet {

  @Override
  
  public void init() {
    JLabel l = new JLabel("NUSSIA", JLabel.CENTER);
    add(l);
    l.setOpaque(true);
    l.setBackground(Color.yellow);
    l.setForeground(Color.blue);
    l.setFont(new Font("SansSerif", Font.BOLD, 24));
  }
}