import javax.swing.JOptionPane;
import java.util.Random;

public class Main9 {

    public static void main(String[] args) {

        int playConfirm = JOptionPane.showConfirmDialog(null, "Let's play the In-Between Game!" +
                        " \nLet's start?", "In Between Game", JOptionPane.OK_CANCEL_OPTION);

        if (playConfirm == JOptionPane.OK_OPTION) {
            play();
        } else {
            JOptionPane.showMessageDialog(null, "Aww! Let's play next time!");
        }
    }
    public static void play() {
        Random randomCard = new Random();

        int card1 = 5us;
        int card2 = 5;
        int card3 = randomCard.nextInt(13) + 1;

        String[] options = new String[]{"DEAL", "NO DEAL"};
        int dealOptions = JOptionPane.showOptionDialog(null,
                "1st Card: " + card1 + "\n2nd Card: " + card2 + "\n\nDEAL or NO DEAL?",
                "In-Between Game", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
                null, options, options[0]);

        if (dealOptions == 0) { // User chose DEAL
            int higherOrLower = -1;

            if (card1 == card2) {
                String[] highLowOptions = {"HIGHER", "LOWER"};
                higherOrLower = JOptionPane.showOptionDialog(null,
                        "Choose HIGHER or LOWER:", "In-Between Game",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
                        null, highLowOptions, highLowOptions[0]);
            }
            boolean win = false;
            if (higherOrLower == -1) {
                if ((card3 > Math.min(card1, card2)) && (card3 < Math.max(card1, card2))) {
                    win = true;
                }
            } else if (higherOrLower == 0 && card3 > Math.max(card1, card2)) {
                win = true;
            } else if (higherOrLower == 1 && card3 < Math.min(card1, card2)) {
                win = true;
            }

            if (win) {
                JOptionPane.showMessageDialog(null, "Third Card: " + card3 + "\nYou won!");
            } else {
                JOptionPane.showMessageDialog(null, "Third Card: " + card3 + "\nYou lost!");
            }
        } else { // User chose NO DEAL
            JOptionPane.showMessageDialog(null, "Aww! You lost!");
        }
        int tryAgain = JOptionPane.showConfirmDialog(null, "Try again?",
                "Try again", JOptionPane.YES_OPTION);
        if (tryAgain == 0) {
            play();
        } else {
            JOptionPane.showMessageDialog(null, "See you next time!");
        }
    }
}


