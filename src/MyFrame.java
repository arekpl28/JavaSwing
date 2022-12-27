import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
   MyFrame(){
       this.setTitle("Hello world");

       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.setResizable(false);
       this.setSize(420,420);
       this.setVisible(true);
       this.getContentPane().setBackground(Color.CYAN);
   }
}
