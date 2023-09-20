import javax.swing.*;

public class Main4 {
    public static void main(String[] args) {

        JTextField enterInput1 = new JTextField();
        JTextField enterInput2 = new JTextField();
        JTextField enterInput3 = new JTextField();

        Object[] message = {
                "Tuition Fee (PHP): ", enterInput1,
                "Increase Rate (Percentage): ", enterInput2,
                "Number of Years: ", enterInput3
        };

        JOptionPane.showMessageDialog(null, message);

        double inputTuition = Double.parseDouble(enterInput1.getText());
        double inputIncrease = Double.parseDouble(enterInput2.getText());
        int schoolYears = Integer.parseInt(enterInput3.getText());
        double increaseRate = inputIncrease / 100 ;

         String message1 = "Tuition Fee (PHP): " + inputTuition + "\nIncrease Rate (Percentage): "
                + inputIncrease + "\nNumber of years: " + schoolYears + "\nYear " +
                 "  Tuition fee with Increase Rate of " + inputIncrease + "\n\n";

        for (int year = 1; year <= schoolYears; year++) {
            inputTuition += inputTuition * increaseRate;
            message1 += year + " - - - - PHP " + String.format("%.2f", inputTuition) + "\n";

        }
        JOptionPane.showMessageDialog(null,  message1  );
    }
}




