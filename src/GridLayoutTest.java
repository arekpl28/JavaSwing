import javax.swing.*;
import java.awt.*;

public class GridLayoutTest {

    public static void main(String[] args) {
        //GridLayout places components in a grid of cells
        
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new GridLayout(3, 1, 5, 5));

        for (int i = 0; i < 10; i++) {
            frame.add(new JButton(String.valueOf(i + 1)));
        }

        frame.setVisible(true);
    }
}
