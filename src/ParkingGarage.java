import javax.swing.*;
import java.text.DecimalFormat;

public class ParkingGarage {
public static void main(String[] args) {
    String hours;
    double charge;
    double totalHours;
    double totalCharge;
    DecimalFormat decimalFormat;

    totalHours = 0;
    totalCharge = 0;
    decimalFormat = new DecimalFormat("$##.##");

    for (int i = 0; i < 5; i++) {
        hours = JOptionPane.showInputDialog("Enter the hours parked for car 1:");
        charge = 5 + Double.parseDouble(hours) - 2;

        totalHours += Double.parseDouble(hours);
        totalCharge += charge;
    }

    JOptionPane.showMessageDialog(null, "Total Hours " + totalHours + "\n" + "Total Charge " + decimalFormat.format(totalCharge));
}
}
