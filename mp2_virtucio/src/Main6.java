import javax.swing.*;

public class Main6 {
    public static void main(String[] args) {

        int number = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number : "));

        if (number % 3 == 0 && number % 5 == 0) {
            JOptionPane.showMessageDialog(null, "HEP-HEP HOORAY!");
        } else if (number % 3 == 0) {
            JOptionPane.showMessageDialog(null, "HEP-HEP!");
        } else if (number % 5 == 0) {
            JOptionPane.showMessageDialog(null, "HOORAY!");
        } else {
            JOptionPane.showMessageDialog(null, "The numebr you entered is not " +
                    "divisible by 3 or 5.");
        }
    }
}
