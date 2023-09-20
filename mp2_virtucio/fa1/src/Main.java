import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JTextField integerInput1 = new JTextField();
        JTextField integerInput2 = new JTextField();
        JTextField floatInput = new JTextField();

        Object[] message = {
                "Enter an integer number: ", integerInput1, integerInput2,
                "Enter a float number: ", floatInput
        };

        int choose = JOptionPane.showConfirmDialog(null, message, "Arithmetic Methods",
                JOptionPane.OK_OPTION);

        if (choose == JOptionPane.OK_OPTION) {
            int num1 = Integer.parseInt(integerInput1.getText());
            int num2 = Integer.parseInt(integerInput2.getText());
            float num3 = Float.parseFloat(floatInput.getText());

            String add = String.valueOf(computeSum(num1, num2, num3));
            String diff = String.valueOf(computeDifference(num1, num2, num3));
            String prod = String.valueOf(computeProduct(num1, num2, num3));
            String quo = String.valueOf(computeQuotient(num1, num2, num3));

            JOptionPane.showMessageDialog(null, "Num1 : " + num1 + "\nNum2 : " + num2 +
                    "\nNum3 : " + num3 + "\nAddition: " + add + "\nDifference: " + diff + "\nProduct" + prod +
                    "\nQuotient" +  quo, "Arithmetic Calculator", JOptionPane.PLAIN_MESSAGE);

        }

    }
    public static float computeSum(int num1, int num2, float num3){
        float sum = num1 + num2 + num3;
        return sum;
    }

    public static float computeDifference(int num1, int num2, float num3){
        float diff = num1 - num2 - num3;
        return diff;
    }
    public static float computeProduct(int num1, int num2, float num3) {
        float prod = num1  * num2 * num3;
        return prod;
    }
    public static float computeQuotient(int num1, int num2, float num3) {
        float quotient = (num1 / num2) / num3;
        return quotient;
    }
}