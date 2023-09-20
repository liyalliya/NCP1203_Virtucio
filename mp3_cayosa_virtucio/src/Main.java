import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JTextField enterInput1 = new JTextField();
        JTextField enterInput2 = new JTextField();

        Object[] message = {"Start:", enterInput1, "End:", enterInput2};
        int aCount = 0;
        int bCount = 0;
        int cCount = 0;
        String allNumbers = "";

        int option = JOptionPane.showConfirmDialog(null, message,
                "Looping", JOptionPane.OK_CANCEL_OPTION);

        if (option == JOptionPane.OK_OPTION) {
            int start = Integer.parseInt(enterInput1.getText());
            int end = Integer.parseInt(enterInput2.getText());

            for (int i = start; i <= end; i++) {
                if (i % 2 == 0) {
                    aCount++;
                }
                if (i % 3 == 0) {
                    bCount++;
                }
                if (i % 2 == 0 && i % 3 == 0){
                    cCount++;
                }
                allNumbers += i + ", ";
            }

            JOptionPane.showMessageDialog(null,
                    "All Numbers:\n" + allNumbers +
                            "\nCounts:\n"+
                            "Divisible by 2: " + aCount + "\n" +
                            "Divisible by 3: " + bCount + "\n" +
                            "Divisible by both 2 and 3: " + cCount  );
        }
    }
}
