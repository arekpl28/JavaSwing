import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button extends JFrame implements ActionListener {
    //public class MyFrame extends JFrame {
    JButton button;
    JLabel label;

    Button() {

        ImageIcon image = new ImageIcon("src/button.png");
        ImageIcon icon = new ImageIcon("src/bro.png");

        label = new JLabel();
        label.setIcon(icon);
        label.setBounds(150, 250, 250, 150);
        label.setVisible(false);

        button = new JButton();
        button.setBounds(100, 100, 300, 150);
        button.addActionListener(this);
//        button.addActionListener(e -> System.out.println("click"));
        button.setText("I'm a button!");
        button.setFocusable(false);
        button.setIcon(image);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans", Font.BOLD, 25));
        button.setIconTextGap(-15);
        button.setForeground(Color.red);
        button.setBackground(Color.cyan);
        //   button.setEnabled(false);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);
        this.add(button);
        this.add(label);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            System.out.println("click");
            label.setVisible(true);

        }
    }
}
