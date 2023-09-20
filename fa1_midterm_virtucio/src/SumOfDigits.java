import javax.swing.*;

public class Main2 {
    public static void main(String[] args) {
        JTextField integerInput1 = new JTextField();

        Object[] message = {"Enter an integer number: ", integerInput1
        };

        int choose = JOptionPane.showConfirmDialog(null, message, "Arithmetic Methods",
                JOptionPane.OK_OPTION);

        if (choose == JOptionPane.OK_OPTION) {
            int num = Integer.parseInt(integerInput1.getText());
            JOptionPane.showMessageDialog(null, sumDigits(num), "Arithmetic Methods",
                    JOptionPane.PLAIN_MESSAGE);
        }

        }
        public static int sumDigits(int num) {
        int num1 = (num - (num % 100)) / 100 ;
        int num2 = (num - (num1 * 100)) / 10 ;
        int num3 = (num - (num1 * 100 + num2 * 10)) / 1 ;
        int sum = num1 + num2 + num3;
        return sum;
        }

    }




