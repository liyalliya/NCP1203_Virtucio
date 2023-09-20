import javax.swing.*;
import java.text.DecimalFormat;

public class Main3 {
    public static void main(String[] args) {
        JTextField input1 = new JTextField();
        JTextField input2 = new JTextField();
        JTextField input3 = new JTextField();
        Object [] message = {
                "Enter the driving distance : ", input1,
                "Enter KM per gallon : ", input2,
                "Enter price per gallon : ", input3
        };

        JOptionPane.showMessageDialog(null, message, "Fuel Efficiency", JOptionPane.PLAIN_MESSAGE);
        double distance, kmPerGallon, pricePerGallon, gallonPerKm, totalCost;
        distance = Double.parseDouble(input1.getText());
        kmPerGallon = Double.parseDouble(input2.getText());
        pricePerGallon = Double.parseDouble(input3.getText());

        DecimalFormat decimal = new DecimalFormat("#.00");
        gallonPerKm = distance / kmPerGallon ;
        totalCost = gallonPerKm * pricePerGallon ;
        gallonPerKm = Double.parseDouble(decimal.format(gallonPerKm));
        totalCost = Double.parseDouble(decimal.format(totalCost));

        String totalMessage = "Your driving distance : " + distance + "\nKM per gallon : " +  kmPerGallon +
                "\nGallon per KM : " + gallonPerKm + "\nPrice per Gallon :  " + pricePerGallon +
                "\n\n Your total cost of driving : " + totalCost ;

        JOptionPane.showMessageDialog(null, totalMessage);
    }
}


