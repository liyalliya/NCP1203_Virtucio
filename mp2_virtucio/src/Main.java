import javax.swing.*;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        double billInput, tipInput, tip, totalBill;

        JTextField input1 = new JTextField();
        JTextField input2 = new JTextField();
        Object[] message = {
                "Enter your bill: ", input1,
                "Enter your tip (in percentage): ", input2
        };

        JOptionPane.showMessageDialog(null, message, "Bill Calculator", JOptionPane.PLAIN_MESSAGE);

        billInput = Double.parseDouble(input1.getText());
        tipInput = Double.parseDouble(input2.getText());

        DecimalFormat decimal = new DecimalFormat("#.00");
        tip = billInput * (tipInput / 100);
        totalBill = billInput + tip;
        tip = Double.parseDouble(decimal.format(tip));
        totalBill = Double.parseDouble(decimal.format(totalBill));

        String totalMessage = "Bill: " + billInput + "\nTip: " + tip + "\nTotal Bill: " + totalBill;
        JOptionPane.showMessageDialog(null, totalMessage, "Bill Caluclator",
                JOptionPane.PLAIN_MESSAGE);
    }
}


