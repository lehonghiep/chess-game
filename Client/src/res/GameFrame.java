package res;

import javax.swing.*;

public class GameFrame extends JFrame {
    ImageIcon img = new ImageIcon(getClass().getResource("res/hust.png"));

    public GameFrame() {
        setIconImage(img.getImage());
    }
}
