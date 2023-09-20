import javax.swing.*;

public class Main3 {
    public static void main(String[] args) {
        float distance = Float.parseFloat(JOptionPane.showInputDialog(null,
                "Enter distance travelled (in km): ", "Taxi Fare", JOptionPane.PLAIN_MESSAGE));

        JOptionPane.showMessageDialog(null, "Your total fare: \n" + calculateFare(distance));

    }
    public static float calculateFare(float distance) {
        float FARE = 60;
        float totalFare = FARE + (distance * 25.5f);
        return totalFare;
    }

}