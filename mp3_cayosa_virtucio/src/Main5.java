import java.util.*;
import javax.swing.*;
import java.awt.*;

public class Main5 {
    public static void main(String[] args) {
        Random randNum = new Random();

        String[] message = {"Play", "Cancel"};

        JPanel panel = new JPanel(new BorderLayout());
        JLabel label = new JLabel("Welcome to IN-BETWEEN");
        label.setHorizontalAlignment(JLabel.CENTER);
        panel.add(label, BorderLayout.CENTER);

        int choice = JOptionPane.showOptionDialog(
                null, panel, "", JOptionPane.YES_NO_OPTION, JOptionPane.DEFAULT_OPTION,
                null, message, message[0]);

        if (choice == JOptionPane.YES_OPTION) {
            // Initializing money
            int pocketMoney = 1000;

            while (pocketMoney > 0){
                int playerBet = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Enter Your Bet!" + "\nYour Wallet: PHP "  + pocketMoney,
                        "IN-BETWEEN", JOptionPane.PLAIN_MESSAGE));

                if (playerBet <= pocketMoney) {

                    int firstCard = randNum.nextInt(14);        // Generating random numbers
                    int secondCard = randNum.nextInt(14);
                    int thirdCard = randNum.nextInt(14);

                    // Text status / messages
                    JPanel infoPanel = new JPanel(new BorderLayout());
                    JLabel infoLabel = new JLabel("Card 1: " + firstCard + "     Card 2: " + secondCard + "\n " +
                            "\n     Card 3: ?");
                    infoLabel.setHorizontalAlignment(JLabel.CENTER);
                    infoPanel.add(infoLabel, BorderLayout.CENTER);
                    String gameStatus = "";

                    // Higher or Lower
                    if (firstCard == secondCard){
                        String[] options2 = {"Higher", "Lower"};
                        int select2 = JOptionPane.showOptionDialog(null, infoLabel,
                                "IN-BETWEEN", JOptionPane.YES_NO_OPTION, JOptionPane.DEFAULT_OPTION,
                                null, options2, options2[0]);

                        if (select2 == JOptionPane.YES_OPTION) {                 // Selected Higher
                            if (thirdCard > firstCard){
                                gameStatus = "CONGRATS! You Won.";
                                pocketMoney += playerBet;
                            } else{
                                gameStatus = "WRONG! Sorry You Lost.";
                                pocketMoney -= playerBet;
                            }
                        } else if (select2 == JOptionPane.NO_OPTION){            // Selected Lower
                            if (thirdCard < firstCard){
                                gameStatus = "CONGRATS! You Won.";
                                pocketMoney += playerBet;
                            } else {
                                gameStatus = "WRONG! Sorry You Lost.";
                                pocketMoney -= playerBet;
                            }
                        }
                    } else {
                        // DEAL OR NO DEAL
                        String[] options = {"DEAL", "NO DEAL"};

                        int select = JOptionPane.showOptionDialog(null, infoLabel,
                                "IN-BETWEEN", JOptionPane.YES_NO_OPTION, JOptionPane.DEFAULT_OPTION,
                                null, options, options[0]);

                        if (select == JOptionPane.YES_OPTION) {

                            if ((firstCard > thirdCard && secondCard < thirdCard) || (firstCard < thirdCard && secondCard > thirdCard)){
                                gameStatus = "CONGRATS! You Won.";
                                pocketMoney += playerBet;
                            } else {
                                gameStatus = "WRONG! Sorry You Lost.";
                                pocketMoney -= playerBet;
                            }
                        } else {    // If NO DEAL, -100 for the user
                            gameStatus = "NO DEAL! Penalty -100.";
                            pocketMoney -= 100;
                        }
                    }
                    JOptionPane.showMessageDialog(null,
                            " ".repeat(18) + gameStatus + "\n" + " ".repeat(24) +
                                    "Third Card is " + thirdCard , "IN-BETWEEN", JOptionPane.PLAIN_MESSAGE);
                } else {  // if bet is larger than the wallet
                    JOptionPane.showMessageDialog(null, "Input Error!");
                }
            }
            JOptionPane.showMessageDialog(null,
                    " ".repeat(26) + "GAME OVER.\n" + " ".repeat(19) +
                            "Thank you for playing!", "IN-BETWEEN", JOptionPane.DEFAULT_OPTION);
        } else {
            JOptionPane.showMessageDialog(null, "    Thank you for playing!");
        }
    }
}