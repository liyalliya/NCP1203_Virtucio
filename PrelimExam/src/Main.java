import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        double BALANCE = 1000.00 ;
        boolean isNotNegative = true ;

        while (BALANCE > 0) {

            String[] mode = {"Check\nBalance", "Deposit", "Withdraw", "Quit"};

            int choice = JOptionPane.showOptionDialog(null, "Welcome to Digital Bank!" +
                            "\nChoose your transaction.", "Digital Bank", JOptionPane.PLAIN_MESSAGE,
                    JOptionPane.DEFAULT_OPTION, null, mode, mode[0]);

            if (choice == 0) {
                JOptionPane.showMessageDialog(null, "Your current balance: " + BALANCE,
                        "Digital Bank", JOptionPane.PLAIN_MESSAGE);
            }

            if (choice == 1) {
                while (isNotNegative) {
                    double userInput = Double.parseDouble(JOptionPane.showInputDialog(null,
                            "Your current balance: " + BALANCE + "\nEnter amount to be deposited:",
                            "Digital Bank", JOptionPane.PLAIN_MESSAGE));
                    if (userInput <= 0) {
                        BALANCE += userInput;
                        JOptionPane.showMessageDialog(null, "Amount deposited: " + userInput +
                                "\nYour new balance: " + BALANCE, "Digital Bank", JOptionPane.PLAIN_MESSAGE);
                        isNotNegative = false ;
                    } else {
                        JOptionPane.showMessageDialog(null, "Invalid Amount.");
                    }
                }
            }
            if (choice == 2) {
                while (isNotNegative) {
                    double userInput = Double.parseDouble(JOptionPane.showInputDialog(null,
                            "Your current balance: " + BALANCE + "\nEnter amount to be withdrawed: ",
                            "Digital Bank", JOptionPane.PLAIN_MESSAGE));
                    if (userInput <= BALANCE) {
                        BALANCE -= userInput;
                        JOptionPane.showMessageDialog(null, "Amount withdrawed: " + userInput
                                + "\nYour new balance: " + BALANCE, "Digital Bank", JOptionPane.PLAIN_MESSAGE);
                        isNotNegative = false;
                    } else {
                        JOptionPane.showMessageDialog(null, "Invalid Amount.");
                    }
                }
            }
            if (choice == 3) {
                JOptionPane.showMessageDialog(null, "Thank you for choosing Digital Bank!");
                System.exit(0);
                // exit
            }

        }
    }
}

