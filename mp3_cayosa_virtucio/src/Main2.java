import javax.swing.*;

public class Main2 {
    public static void main(String[] args) {

        boolean isNotZero = true;
        int sum = 0;
        int prod = 1;
        int prod2 = 1;
        int divByThree = 0;
        int divByFive = 0;

        String allNumbers = " "; // will act as a container

        while (isNotZero) {
            int userInput = Integer.parseInt(JOptionPane.showInputDialog("Input Number:"));

            if (userInput > 10) {
                sum += userInput; // Add numbers > 10 to the sum
            }
            if (userInput < 5 && userInput != 0) {
                prod *= userInput;
            }
            if (userInput % 3 == 0 && userInput != 0){
                divByThree++;
            }
            if (userInput % 5 == 0 && userInput != 0){
                divByFive++;
            }
            if (userInput % 2 == 0 && userInput != 0)
            {
                prod2 *= userInput;
            }
            allNumbers += userInput + "\n";

            if (userInput == 0) {
                isNotZero = false;
            }
        }

        JOptionPane.showMessageDialog(null,
                "All Numbers:\n" + allNumbers +
                        "\nSum of Numbers > 10: " + sum +
                        "\nProduct of Numbers < 5: " + prod +
                        "\nNumbers Divisible by 3: " + divByThree +
                        "\nNumbers Divisible by 5: " + divByFive +
                        "\nThrice the product of \n numbers less than 2: " + prod2 * 3);
    }
}

