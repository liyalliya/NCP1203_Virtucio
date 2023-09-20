import javax.swing.*;

public class Main4 {
    public static void main(String[] args) {
        String changeInput = JOptionPane.showInputDialog("Enter the change amount:");
        double changeAmount = Double.parseDouble(changeInput);

        // Define the currency values for pesos and cents
        int[] peso = { 1000, 500, 200, 100, 50, 20, 10, 5, 1 };
        int[] cent = { 10, 5, 1 };

        String[] money = {
                "1000", "500", "200", "100", "50", "20", "10", "5", "1",
                "10 cents", "5 cents", "1 cent"
        };

        int[] changeCounts = new int[peso.length + cent.length];

        for (int i = 0; i < peso.length; i++) {
            changeCounts[i] = (int) (changeAmount / peso[i]);
            changeAmount -= changeCounts[i] * peso[i];
        }

        for (int i = peso.length, j = 0; j < cent.length; i++, j++) {
            changeCounts[i] = (int) (changeAmount * 100 / cent[j]);
            changeAmount -= changeCounts[i] * cent[j] / 100.0;
        }

        StringBuilder outputMessage = new StringBuilder("Change breakdown: " + changeInput + "\n");
        for (int i = 0; i < changeCounts.length; i++) {
            if (changeCounts[i] > 0) {
                outputMessage.append(money[i]).append(" = ").append(changeCounts[i]).append("\n");
            } else {
                outputMessage.append(money[i]).append(" = --\n");
            }
        }
        JOptionPane.showMessageDialog(null, outputMessage.toString(), "Change Breakdown",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
