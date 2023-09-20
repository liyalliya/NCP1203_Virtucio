import javax.swing.*;
import java.util.Random;

public class Main3 {
    public static void main(String[] args) {

        Random random = new Random();
        int guessNum = 7;

        int tries = 0;

        boolean isNotCorrect = true;

        while (isNotCorrect){

            int userInput = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Enter your guess: ", "Guessing Game", JOptionPane.PLAIN_MESSAGE));

            tries++;

            if (userInput < 0 || userInput > 10) {
                JOptionPane.showMessageDialog(null, "Enter numbers from 0 - 10 only.");
            } else if (userInput > guessNum) {
                JOptionPane.showMessageDialog(null, "Lower!");
            } else if (userInput < guessNum) {
                JOptionPane.showMessageDialog(null, "Higher!");
            } else {

            String message = "Good job! You guessed the number!" + "\nRandom Number: " +
                    guessNum+ "\nNumber of tries: " + tries ;

                if (tries == 1) {
                    message += "\nWhat a Pro!";
                } else if (tries >= 2 && tries <= 4) {
                    message += "\nSuch an Expert!";
                } else if (tries >= 5 && tries <= 6) {
                    message += "\nNice try for a Beginner!";
                } else {
                    message += "\nYou're still a Novice! ";
                }
                JOptionPane.showMessageDialog(null, message);
                isNotCorrect = false ;
            }
            }
        }
    }
