import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {


//        BorderLayout = A BorderLayout places components in five areas:NORTH, SOUTH, WEST, CENTER,
//                        All extra spaces is placed in the center area

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new BorderLayout(10, 10));
        frame.setVisible(true);

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();

        panel1.setBackground(Color.red);
        panel2.setBackground(Color.green);
        panel3.setBackground(Color.yellow);
        panel4.setBackground(Color.magenta);
        panel5.setBackground(Color.blue);

        panel1.setPreferredSize(new Dimension(100, 100));
        panel2.setPreferredSize(new Dimension(100, 100));
        panel3.setPreferredSize(new Dimension(100, 100));
        panel4.setPreferredSize(new Dimension(100, 100));
        panel5.setPreferredSize(new Dimension(100, 100));

        //---------------sub panels-------------------//

        JPanel panel6 = new JPanel();
        JPanel panel7 = new JPanel();
        JPanel panel8 = new JPanel();
        JPanel panel9 = new JPanel();
        JPanel panel10 = new JPanel();

        panel6.setBackground(Color.black);
        panel7.setBackground(Color.darkGray);
        panel8.setBackground(Color.gray);
        panel9.setBackground(Color.lightGray);
        panel10.setBackground(Color.white);

        panel5.setLayout(new BorderLayout());

        panel6.setPreferredSize(new Dimension(50, 50));
        panel7.setPreferredSize(new Dimension(50, 50));
        panel8.setPreferredSize(new Dimension(50, 50));
        panel9.setPreferredSize(new Dimension(50, 50));
        panel10.setPreferredSize(new Dimension(50, 50));

        panel5.add(panel6, BorderLayout.NORTH);
        panel5.add(panel7, BorderLayout.WEST);
        panel5.add(panel8, BorderLayout.EAST);
        panel5.add(panel9, BorderLayout.SOUTH);
        panel5.add(panel10, BorderLayout.CENTER);
        //---------------sub panels-------------------//

        frame.add(panel1, BorderLayout.NORTH);
        frame.add(panel2, BorderLayout.WEST);
        frame.add(panel3, BorderLayout.EAST);
        frame.add(panel4, BorderLayout.SOUTH);
        frame.add(panel5, BorderLayout.CENTER);

        //////////////////////////////////////////////////////////////////////
//        JButton = a button that performs an action when clicked on
//        new Button();


//        ImageIcon icon = new ImageIcon("src/up.png");
//
//        JLabel label =new JLabel();
//        label.setText("Hi");
//        label.setIcon(icon);
//      //  label.setVerticalAlignment(JLabel.BOTTOM);
//      //  label.setHorizontalAlignment(JLabel.RIGHT);
//        label.setBounds(0,0,175,175);
//
//        JPanel redPanel = new JPanel();
//        redPanel.setBackground(Color.red);
//        redPanel.setBounds(0,0,250,250);
//        redPanel.setLayout(null);
//
//        JPanel bluePanel = new JPanel();
//        bluePanel.setBackground(Color.blue);
//        bluePanel.setBounds(250,0,250,250);
//
//        JPanel greenPanel = new JPanel();
//        greenPanel.setBackground(Color.green);
//        greenPanel.setBounds(0,250,500,250);
//        greenPanel.setLayout(null);
////        greenPanel.setLayout(new BorderLayout());
//
//        JFrame frame = new JFrame();
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setLayout(null);
//        frame.setSize(750,750);
//        frame.setVisible(true);
//
//        redPanel.add(label);
//
//        frame.add(redPanel);
//        frame.add(bluePanel);
//        frame.add(greenPanel);


    }
}
