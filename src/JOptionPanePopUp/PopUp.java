package JOptionPanePopUp;

import javax.swing.*;

public class PopUp {
    public static void main(String[] args) {

        // JOptionPane = pop up a standard dialog box that prompts users for a value or informs the of something


//        JOptionPane.showMessageDialog(null, "This is some useless info", "title", JOptionPane.PLAIN_MESSAGE);
//        JOptionPane.showMessageDialog(null, "This is more useless info", "title", JOptionPane.INFORMATION_MESSAGE);
//        JOptionPane.showMessageDialog(null, "Really?", "title", JOptionPane.QUESTION_MESSAGE);
//        JOptionPane.showMessageDialog(null, "Warning message!!!", "title", JOptionPane.WARNING_MESSAGE);
//        JOptionPane.showMessageDialog(null, "Error", "title", JOptionPane.ERROR_MESSAGE);
//
//        System.out.println(
//                JOptionPane.showConfirmDialog(null, "Bro do you even code?", "This is my title",
//                        JOptionPane.YES_NO_CANCEL_OPTION));
//
//        String name = JOptionPane.showInputDialog("What is you name?");
//        System.out.println("Hello " + name);
        String[] responses = {"No, you are awesome", "Thank you", "*blush*"};

        JOptionPane.showOptionDialog(null,
                "You are awesome!",
                "Secret message",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                responses,
                0);
    }
}
