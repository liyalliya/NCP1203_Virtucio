import javax.swing.*;

public class Main5 {
    public static void main(String[] args) {
        String mobileNumber = JOptionPane.showInputDialog(null, "To know your mobile network " +
                "\nEnter your mobile number: ", "Mobile Network", JOptionPane.PLAIN_MESSAGE);

        if (mobileNumber.length() == 11) {
            String firstFourPrefix = mobileNumber.substring(0, 4);
            String firstFivePrefix = mobileNumber.substring(0, 5);

            switch (firstFivePrefix) {
                case "09173", "09175", "09176", "09256", "09253" ->
                        JOptionPane.showMessageDialog(null, "Your mobile number: \n" +
                                mobileNumber + " - Globe Postpaid.");

                default -> {
                    switch (firstFourPrefix) {
                        case "0905", "0906", "0915", "0966", "0917" ->
                                JOptionPane.showMessageDialog(null, "Your mobile number: \n"
                                        + mobileNumber + " - Globe/TM Network.");
                        case "0907", "0909", "0910", "0912", "0930" ->
                                JOptionPane.showMessageDialog(null, "Your mobile number: \n"
                                        + mobileNumber + "- TNT Network.");
                        case "0908", "0919", "0921", "0928", "0929" ->
                                JOptionPane.showMessageDialog(null, "Your mobile number: \n"
                                        + mobileNumber + "- Smart Network.");
                        case "0922", "0923", "0924", "0925", "0931" ->
                                JOptionPane.showMessageDialog(null, "Your mobile number: \n"
                                        + mobileNumber + " - Sun Network");
                        default -> { JOptionPane.showMessageDialog(null,
                                "Prefix doesn't have a match.");
                    }
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please enter an 11 digit mobile number.");
        }
    }
}
