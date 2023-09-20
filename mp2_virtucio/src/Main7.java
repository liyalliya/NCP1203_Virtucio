import javax.swing.*;

public class Main7 {
    public static void main(String[] args) {

            double monthlySalary, annualSalary, monthlySalaryTax;
            monthlySalary = Double.parseDouble(JOptionPane.showInputDialog("Enter the monthly salary:"));
            annualSalary = monthlySalary * 12;
            monthlySalaryTax = salaryTax(annualSalary)/12 ;

            String annualResultMessage, monthlyResultMessage, taxResultMessage, resultMessage;
            annualResultMessage = String.format("Annual Salary : %.2f", annualSalary) ;
            monthlyResultMessage = String.format("\nMonthly Salary : %.2f", monthlySalary);
            taxResultMessage = String.format("\nEstimated Tax: " + "%.2f", monthlySalaryTax);
            resultMessage = annualResultMessage + monthlyResultMessage + taxResultMessage ;

            JOptionPane.showMessageDialog(null, resultMessage);
        }
    public static double salaryTax(double annualSalary) {
        double tax = 0;
        if (annualSalary < 250000) {
            tax = 0 ;
        } else if (annualSalary < 400000) {
            tax = 0.2 * (annualSalary - 250000)  ;
        } else if (annualSalary < 800000) {
            tax = 30000 + 0.25 * (annualSalary - 400000) ;
        } else if (annualSalary < 2000000) {
            tax = 130000 + 0.30 * (annualSalary - 800000)  ;
        } else if (annualSalary < 8000000) {
            tax = 490000 + 0.32 * (annualSalary - 2000000) ;
        } else  {
            tax = 2410000 + 0.35 * (annualSalary - 8000000) ;
        }
        return tax;
    }
}
