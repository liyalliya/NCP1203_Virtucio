import javax.swing.*;

public class Main2 {
    public static void main(String[] args) {

        String[] options = new String[]{"By Sides", "By Angles"};
        int triangleIdentifier = JOptionPane.showOptionDialog(null,
                "Let's identify your triangle! \n Choose how: ", "Types of Triangle",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

        if (triangleIdentifier == 0) {
            bySides();
        } else if (triangleIdentifier == 1){
            byAngles();
        } else {
            JOptionPane.showMessageDialog(null, "Process Canceled!");
        }
    }
    public static void bySides() {
        JTextField input1 = new JTextField();
        JTextField input2 = new JTextField();
        JTextField input3 = new JTextField();
        Object[] message = {
                "Side 1 : ", input1,
                "Side 2 : ", input2,
                "Side 3 : ", input3
        };
        JOptionPane.showMessageDialog(null, message);
        int side1, side2, side3;
        side1 = Integer.parseInt(input1.getText());
        side2 = Integer.parseInt(input2.getText());
        side3 = Integer.parseInt(input3.getText());

        if (side1 + side2 > side3 && side2 + side3 > side1 && side3 + side1 > side2) {
            if (side1 == side2 && side2 == side3) {
                JOptionPane.showMessageDialog(null, "IT'S AN EQUILATERAL TRIANGLE!");
            } else if (side1 == side2 || side2 == side3 || side1 == side3) {
                JOptionPane.showMessageDialog(null, "IT'S AN ISOSCELES TRIANGLE!");
            } else {
                JOptionPane.showMessageDialog(null, "IT'S A SCALENE TRIANGLE!");
            }
        }  else {
            JOptionPane.showMessageDialog(null, "INVALID MEASUREMENT!");
        }
    }
    public static void byAngles() {
        JTextField input1 = new JTextField();
        JTextField input2 = new JTextField();
        JTextField input3 = new JTextField();
        Object[] message = {
                "Angle 1 : ", input1,
                "Angle 2 : ", input2,
                "Angle 3 : ", input3
        };
        JOptionPane.showMessageDialog(null, message);
        int angle1, angle2, angle3;
        angle1 = Integer.parseInt(input1.getText());
        angle2 = Integer.parseInt(input2.getText());
        angle3 = Integer.parseInt(input3.getText());

        if (angle1 + angle2 + angle3 == 180) {
            if (angle1 == 90 || angle2 == 90 || angle3 == 90) {
                JOptionPane.showMessageDialog(null, "IT'S A RIGHT ANGLED!");
            } else if (angle1 < 90 && angle2 < 90 && angle3 < 90) {
                JOptionPane.showMessageDialog(null, "IT'S AN ACUTE ANGLED!");
            } else {
                JOptionPane.showMessageDialog(null, "IT'S AN OBTUSE ANGLED!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Oh no! Invalid Angles!");
        }
    }
}

